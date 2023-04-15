package stepdefs.muratStepdefs;

import driver.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.LocatorsMovita;
import utils.BaseClass;

public class MovitaLogoStepdefs extends BaseClass implements LocatorsMovita {


    @Given("user on homepage")
    public void userOnHomepage() {
        driver.get(url);

    }

    @When("Logo isvisible and clickable")
    public void logoIsvisibleAndClickable() {
        visibility(lLogo);
        wait.until(ExpectedConditions.elementToBeClickable(lLogo));


    }

    @And("user clicks The Logo")
    public void userClicksTheLogo() {
        click(lLogo);
    }

    @Then("“Mobil Vasita izleme takip Sistemi” isvisible on page")
    public void mobilVasitaIzlemeTakipSistemiIsvisibleOnPage() {
        visibility(lPageYazısı);
        getScreenShoot("movita");

    }


}
