package stepdefs.muratStepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import driver.LocatorsMovita;
import driver.BaseClass;

public class MovitaDropDownStepdefs extends BaseClass implements LocatorsMovita {
    @Given("go to url")
    public void goToUrl() {
        driver.get(url);

    }

    @When("DropDown visible and clickable")
    public void dropdownVisibleAndClickable() {
        visibility(lDropDownLanguageMenu);
        wait.until(ExpectedConditions.elementToBeClickable(lDropDownLanguageMenu));
    }

    @Then("Click DropDown")
    public void clickDropDown() {
        click(lDropDownLanguageMenu);
    }

    @And("English and Turkish languages are visible")
    public void englishAndTurkishLanguagesAreVisible() {
        visibility(lDropDownEnglish);
        visibility(lDropDownTurkish);
    }

    @Then("Click English")
    public void clickEnglish() {
        click(lDropDownEnglish);
    }

    @And("“Mobile Vehicle Tracking System” text visible")
    public void mobileVehicleTrackingSystemTextVisible() {
        visibility(lTitleEnglish);

    }

    @Then("Click Turkish")
    public void clickTurkish() {
        click(lDropDownLanguageMenu);
        click(lDropDownTurkish);
    }

    @And("“Mobil Vasita izleme takip Sistemi” text visible")
    public void mobilVasitaIzlemeTakipSistemiTextVisible() {
        sleep(2000);
        visibility(lTitleTurkish);
    }
}
