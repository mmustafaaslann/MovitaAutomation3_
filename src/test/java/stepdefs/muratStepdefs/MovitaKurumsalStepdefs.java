package stepdefs.muratStepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import driver.BaseClass;
import driver.LocatorsMovita;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.Map;

public class MovitaKurumsalStepdefs extends BaseClass implements LocatorsMovita {

    String afterColor;


    @Given("users navigate to {string}")
    public void usersNavigateTo(String url) {
        driver.get(url);
    }

    @When("user hover over {string}")
    public void userHoverOver(String text) {
        hover(menuler(text));
        String color = menuler(text).getCssValue("color");
        afterColor=Color.fromString(color).asHex();

    }

    @And("user click {string}")
    public void userClick(String text) {
        click(menuler(text));
    }

    @Then("{string} should be visible")
    public void shouldBeVisible(String text) {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,text);
    }

    @Then("{string} should be visible in related page")
    public void shouldBeVisibleInRelatedPage(String text) {
         String pageSource = driver.getPageSource();
         Assert.assertTrue(pageSource.contains(text));
    }

    @And("user assert change color of")
    public void userAssertChangeColorOf() {
        Assert.assertNotEquals(beforeColor,afterColor);

    }
}
