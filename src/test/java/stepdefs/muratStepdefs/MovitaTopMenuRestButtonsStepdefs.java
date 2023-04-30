package stepdefs.muratStepdefs;

import driver.BaseClass;
import driver.LocatorsMovita;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

public class MovitaTopMenuRestButtonsStepdefs extends BaseClass implements LocatorsMovita {
    String afterColor;
    @Given("users navigateto {string}")
    public void usersNavigateto(String url) {
        driver.get(url);

    }

    @When("user hoverover {string}")
    public void userHoverover(String text) {
        hover(menuler(text));
        String color=menuler(text).getCssValue("color");
        afterColor= Color.fromString(color).asHex();

    }

    @And("user assert change color of {string}")
    public void userAssertChangeColorOf(String text) {
        Assert.assertNotEquals(afterColor,beforeColor);
    }

    @And("userclick {string}")
    public void userclick(String text) {
        click(menuler(text));
    }





    @Then("shouldbe visible {string}")
    public void shouldbeVisible(String text) {
      String currentUrl=driver.getCurrentUrl();
      Assert.assertEquals(currentUrl,text);

    }
}
