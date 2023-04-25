package stepdefs.muratStepdefs;

import driver.BaseClass;
import driver.LocatorsMovita;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

public class MovitaUrunlerCozumlerStepdefs extends BaseClass implements LocatorsMovita {

    String afterColor;
    @Given("users navigate too {string}")
    public void usersNavigateToo(String url) {
        driver.get(url);
    }

    @When("user hover overr {string}")
    public void userHoverOverr(String text) {
        hover(menuler(text));
        String color=menuler(text).getCssValue("color");
        afterColor= Color.fromString(color).asHex();

    }

    @And("user assert change color off")
    public void userAssertChangeColorOff() {
        Assert.assertNotEquals(afterColor,beforeColor);
    }

    @And("user clickk {string}")
    public void userClickk(String text) {
        click(menuler(text));
    }

    @Then("{string} should be visiblee")
    public void shouldBeVisiblee(String text) {
        String currentUrl=driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,text);
    }

    @Then("{string} should be visible in related pagee")
    public void shouldBeVisibleInRelatedPagee(String text) {

        String sourcePage=driver.getPageSource();
        Assert.assertTrue(sourcePage.contains(text));


    }
}
