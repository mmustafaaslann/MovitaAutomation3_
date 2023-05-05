package driver;

import driver.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class BaseClass {

    public WebDriver driver = Driver.getDriver();
    public WebDriverWait wait = Driver.getWait();


    public void click(By locator) {

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        click(element);
    }

    public void click(WebElement element) {


        wait.until(driver1 -> {
            try {
                element.click();
                return true;
            } catch (Exception e1) {
                try {
                    new Actions(driver1).moveToElement(element).click().perform();
                    return true;
                } catch (Exception e2) {
                    try {
                        ((JavascriptExecutor) driver1).executeScript("arguments[0].click()", element);
                        return true;
                    } catch (Exception e3) {
                        return false;
                    }
                }
            }
        });
    }

    public void sendKeys(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.sendKeys(text);
    }

    public void sendKeys(WebElement element, String text) {


        wait.until(driver1 -> {
            try {
                element.sendKeys(text);
                return true;
            } catch (Exception e1) {
                try {
                    new Actions(driver1).moveToElement(element).sendKeys(text).perform();
                    return true;
                } catch (Exception e2) {
                    try {
                        ((JavascriptExecutor) driver1).executeScript("arguments[0].sendKeys(text)", element);
                        return true;
                    } catch (Exception e3) {
                        return false;
                    }
                }
            }
        });
    }

    public void visibility(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        visibility(element);
    }

    public void visibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void getScreenShoot(String name) {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File target = new File("_screeshoot/resim.png");
        try {
            FileUtils.copyFile(source, target);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){

        }

    }

    public void hover(WebElement element) {
        new Actions(driver)
                .moveToElement(element)
                .build()
                .perform();

    }

    public WebElement menuler(String text) {
        WebElement element = driver.findElement(By.xpath("//ul[@class='menu-container']//li/a/div[text()='"+text+"']"));
        return element;
    }
}
