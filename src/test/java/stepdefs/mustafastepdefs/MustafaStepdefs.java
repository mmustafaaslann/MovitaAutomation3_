package stepdefs.mustafastepdefs;

import Base.BaseMovita;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.Map;

public class MustafaStepdefs extends BaseMovita {
    @Given("kullanıcılar şuraya gider:{string}")
    public void kullanıcılarŞurayaGider(String url) {
        driver.get(url);
    }

    @When("kullanıcılar movita logosunu tıkladı")
    public void kullanıcılarMovitaLogosunuTıkladı() {
        click(llogo);
    }

    @And("Mobil Araç Takip Sistemi görünür olmalıdır")
    public void mobilAraçTakipSistemiGörünürOlmalıdır() {
        visible(lMobilVasıtaTurkish);
    }

    @Then("başarılı olmalı")
    public void başarılıOlmalı() {
        getScreenshot("Mobil vasıta");
    }

    @When("kullanıcı enter düğmesini tıklar")
    public void kullanıcıEnterDüğmesiniTıklar() {
        click(lEnterButton);
    }

    @And("kullanıcı Türkçe dil düğmesini tıklar")
    public void kullanıcıTürkçeDilDüğmesiniTıklar() {
        click(lTurkishLang);
    }

    @And("user String verify Türkce → “Mobil Vasita izleme takip Sistemi” yazisini verify ett")
    public void userStringVerifyTürkceMobilVasitaIzlemeTakipSistemiYazisiniVerifyEtt() {
        visible(lMobilVasıtaTurkish);
    }

    @And("kullanıcı ingilizce dil düğmesini tıklar")
    public void kullanıcıIngilizceDilDüğmesiniTıklar() {
        click(lEnglishLang);
    }

    @And("kullanıcı     String verfiy  İngilizce → “Mobil Araç Takip Sistemi” yazısını doğrulama et doğrulama İngilizce → “Mobil Araç Takip Sistemi” yazısını doğrulama et")
    public void kullanıcıStringVerfiyİngilizceMobilAraçTakipSistemiYazısınıDoğrulamaEtDoğrulamaİngilizceMobilAraçTakipSistemiYazısınıDoğrulamaEt() {
        visible(lMobilVasıtaEnglish);
        getScreenshot("Mobile Vehicle Tracking System");
    }

    @When("kullanıcı ana sayfa başlığının üzerine gelir ve başlık rengi değiştirilebilir olmalıdır.")
    public void kullanıcıAnaSayfaBaşlığınınÜzerineGelirVeBaşlıkRengiDeğiştirilebilirOlmalıdır() {
        WebElement element = driver.findElement(lAnaSayfa);
        String beforeColor = element.getCssValue("color");
        hoverAll(lAnaSayfa);
        String afterColor = element.getCssValue("color");
        Assert.assertNotEquals(beforeColor, afterColor);

    }

    @And("ana başlık tıklanabilir olmalıdır")
    public void anaBaşlıkTıklanabilirOlmalıdır() {
        click(lAnaSayfa);
    }


    @When("kullanıcı  {string} üzerine gelir")
    public void kullanıcıÜzerineGelir(String anaBaslik) {
        hoverOver(homePageMenu(anaBaslik));
    }

    @And("hover over yapar  {string}")
    public void hoverOverYapar(String altBaslik) {
        hoverOver(MainSubTitle(altBaslik));
    }

    @And("kullanıci atl basliklara tiklar   {string}")
    public void kullanıciAtlBasliklaraTiklar(String altBaslik) {
        click(MainSubTitle(altBaslik));
    }

    @And("{string} ve   {string} renkleri değişmelidir")
    public void veRenkleriDeğişmelidir(String anaBaslik, String altBaslik) {
        assertChangeColorMainTitle(anaBaslik);
        assertChangeColorSubTitle(altBaslik);
    }

    @Then("alt basliklar   {string} ile görünür olmalı")
    public void altBasliklarIleGörünürOlmalı(String text) {

        visibleVerifyWithSubtitle(text);


    }

    @When(":  kullanici urunler {string} üzerine gelir")
    public void kullaniciUrunlerÜzerineGelir(String anaBaslik) {
        hoverOver(homePageMenu(anaBaslik));
    }

    @And(":urunler seceneklerinde  hover over yapar {string}")
    public void urunlerSeceneklerindeHoverOverYapar(String altBaslik) {
        hoverOver(MainSubTitle(altBaslik));
    }

    @And(":  kullanıcı alt basliklara tiklar {string}")
    public void kullanıcıAltBasliklaraTiklar(String subTitle) {
        click(MainSubTitle(subTitle));
    }

    @And(":  alt basliklar {string} ile görünür olmalıdır")
    public void altBasliklarIleGörünürOlmalıdır(String text) {
        verifyToUrunlerSubtitle(text);
    }



    @When(": kullanıcı cozumler {string} üzerine gelir")
    public void kullanıcıCozumlerÜzerineGelir(String anaBaslik) {
        hoverOver(homePageMenu(anaBaslik));
    }

    @And(": cozumler seceneklerinde hover over yapar {string}")
    public void cozumlerSeceneklerindeHoverOverYapar(String altBaslik) {
        hoverOver(MainSubTitle(altBaslik));
    }

    @And(": kullanıcı alt basliklara tiklarr {string}")
    public void kullanıcıAltBasliklaraTiklarr(String subTitle) {
        click(MainSubTitle(subTitle));
    }

    @And(": alt basliklar {string} ile görünürr olmalıdırr")
    public void altBasliklarIleGörünürrOlmalıdırr(String text) {
     visibleVerifyWithSubtitleCozumler(text);
    }



    @Then(": cozumler  {string} ve   {string} renkleri değişmelidir")
    public void cozumlerVeRenkleriDeğişmelidir(String anaBaslik, String altBaslik) {
        assertChangeColorMainTitle(anaBaslik);
        assertChangeColorSubTitle(altBaslik);

    }







}