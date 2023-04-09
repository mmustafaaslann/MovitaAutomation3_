package stepdefs;

import Base.BaseMovita;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class MovitaStepdefs extends BaseMovita {

    @Given("kullanici urly gider {string}")
    public void kullaniciUrlyGider(String url) {
        driver.get(url);
    }


    @When(": kullanici movita logosunu tikladi")
    public void kullaniciMovitaLogosunuTikladi() {

    }

    @And(":  Mobile Vehicle Tracking System görünür olmalidir")
    public void mobileVehicleTrackingSystemGörünürOlmalidir() {
    }

    @Then(": Basarili calısir")
    public void basariliCalısir() {
    }
}


