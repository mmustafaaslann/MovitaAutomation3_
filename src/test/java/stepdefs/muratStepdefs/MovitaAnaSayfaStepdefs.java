package stepdefs.muratStepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import driver.BaseClass;
import driver.LocatorsMovita;

public class MovitaAnaSayfaStepdefs extends BaseClass implements LocatorsMovita {
    @Given("Go to Url")
    public void goToUrl() {
        driver.get(url);
    }
    String afterColor;
    @When("Hover over to AnaSayfa button")
    public void hoverOverToAnaSayfaButton() {
        WebElement eAnasayfaButton=driver.findElement(lAnaSayfaButton);
        hover(eAnasayfaButton);
        String color = eAnasayfaButton.getCssValue("color");
        afterColor= Color.fromString(color).asHex();
    }

    @Then("Writing color change")
    public void writingColorChange() {
        Assert.assertNotEquals(beforeColor,afterColor);

    }

    @And("Button AnaSayfa should be clickable")
    public void buttonAnaSayfaShouldBeClickable() {
        wait.until(ExpectedConditions.elementToBeClickable(lAnaSayfaButton));
    }

    @And("Click AnaSayfa Button")
    public void clickAnaSayfaButton() {
        click(lAnaSayfaButton);
    }

    @And("Mobil Vasita izleme takip Sistemi writing should be visible")
    public void mobilVasitaIzlemeTakipSistemiWritingShouldBeVisible() {
        visibility(lPageYazısı);

    }
}
