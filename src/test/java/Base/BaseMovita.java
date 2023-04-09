package Base;

import Locaators.Locator;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Driver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BaseMovita implements Locator {
    protected  WebDriver driver;
    protected  WebDriverWait wait;

    {
        driver = Driver.getDriver();
        wait = Driver.getWait();
        driver.manage().window().maximize();
    }

    public void click(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        click(element);

    }

    public void click(WebElement element) {
        wait.until(driver->{
            try {
                element.click();
                return true;

            }catch(Exception e1){
                try {
                    new Actions(driver).moveToElement(element).click().perform();
                    return true;

                }catch(Exception e2){
                    try {
                        ((JavascriptExecutor)driver).executeScript("arguments[0].click",element);
                        return true;
                    }catch (Exception e3){
                        return false;
                    }

                }

            }


        });

    }

    public void visible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void visible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void assertElement(By locator, String str) {

        WebElement element = driver.findElement(locator);
        String text = element.getText();
        System.out.println(text);
        //bekle(1000);
        Assert.assertEquals(text, str);

    }

    public void bekle(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void getScreenshot(String name) {

        String isim = "screenShots/" + name + " " + LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd_MM_yyyy")) + ".png";

        TakesScreenshot takesScreenshot = ((TakesScreenshot) driver);

        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File target = new File(isim);

        try {
            FileUtils.copyFile(source, target);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void hoverOver(WebElement element){
        new Actions(driver)
                .moveToElement(element)
                .pause(500)
                .build()
                .perform();
    }
    public void hoverAll(By locator){
        List<WebElement> list=driver.findElements(locator);

        for (WebElement element : list) {
            new Actions(driver)
                    .moveToElement(element)
                    .build()
                    .perform();
        }
    }
    public void assertChangeColor(WebElement element, String color) {
        String bgColorRGB = element.getCssValue("color");
        String bgColorHex = Color.fromString(bgColorRGB).asHex();
        Assert.assertEquals(bgColorHex, color);
    }
    public void assertChangeColor(By locator, String color) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        assertChangeColor(element, color);
    }

    @Override
    public WebElement homePageMenu(String text) {
        WebElement element = driver.findElement(By.xpath("//ul[@class='menu-container']//div[text()='" + text + "']"));
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }
    public WebElement MainSubTitle (String text){
        WebElement element = driver.findElement(By.xpath("//ul[@class='sub-menu-container']//div[text()='"+ text +"']"));
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }
    public void assertChangeColorMainTitle(String text) {
       /* String bgColorRGB = element.getCssValue("color");
        String bgColorHex = Color.fromString(bgColorRGB).asHex();
        Assert.assertEquals(bgColorHex, color);*/

        String beforeColorMainTitle=homePageMenu(text).getCssValue("color");
        hoverOver(homePageMenu(text));
        String afterColorMainTitle=homePageMenu(text).getCssValue("color");
        Assert.assertNotEquals(beforeColorMainTitle,afterColorMainTitle);
    }

    public void assertChangeColorSubTitle(String text) {
        String beforeColorMainTitle=MainSubTitle(text).getCssValue("color");
        hoverOver(MainSubTitle(text));
        String afterColorMainTitle=MainSubTitle(text).getCssValue("color");
        Assert.assertNotEquals(beforeColorMainTitle,afterColorMainTitle);
    }
    public void visibleVerifyWithSubtitleKurumsal(String text) {
        By lKurumsalSubTitleVerify=By.xpath("//h1[text()='"+text+"']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(lKurumsalSubTitleVerify));
    }
    public void verifyToUrunlerSubtitle(String text) {
        By lUrunlerSubtitle=By.xpath("//h3[text()='"+text+"']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(lUrunlerSubtitle));

    }
    public void visibleVerifyWithSubtitleCozumler(String text) {
        By lSubTitleVerify=By.xpath("//h2[@class='d-flex'][contains(.,' "+text+"')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(lSubTitleVerify));
    }
    public void visibleVerifyWithSubtitle(String text) {
        By lSubTitleVerify=By.xpath("//div[@class='col-md-3']//img");
        wait.until(ExpectedConditions.presenceOfElementLocated(lSubTitleVerify));
    }
}
