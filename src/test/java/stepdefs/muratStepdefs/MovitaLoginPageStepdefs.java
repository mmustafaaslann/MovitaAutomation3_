package stepdefs.muratStepdefs;

import driver.BaseClass;
import driver.LocatorsMovita;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


import java.util.List;
import java.util.Map;

public class MovitaLoginPageStepdefs extends BaseClass implements LocatorsMovita {

    String afterColor;
    WebElement eGirisButtonElement=driver.findElement(lTopMenuGirisyapButton);
    @Then("Griş Yap butonuna Hoverover ol")
    public void grişYapButonunaHoveroverOl() {
       visibility(lTopMenuGirisyapButton);
        hover(eGirisButtonElement);


    }

    @And("Griş Yap Butonunu renginin değiştiğini assert et")
    public void grişYapButonunuRengininDeğiştiğiniAssertEt() {
        String color=eGirisButtonElement.getCssValue("color");
        afterColor= Color.fromString(color).asHex();

    }

    @And("Griş Yap Butonunun clicable olduğunu assert et")
    public void grişYapButonununClicableOlduğunuAssertEt() {
        wait.until(ExpectedConditions.elementToBeClickable(lTopMenuGirisyapButton));

    }

    @And("Griş Yap Butoonuna click et")
    public void grişYapButoonunaClickEt() {
        click(lTopMenuGirisyapButton);
    }

    @Then("Sayfada {string} yazısını assert et")
    public void sayfadaYazısınıAssertEt(String text) {

        String linkText= driver.findElement(lGirisSayfasıSifreUnutmaLinki).getText();
        Assert.assertEquals(linkText,text);
    }

    @And("Kullanıcı kutusu veya şifre hatalı girildiğinde{string} Görüldüğünü assert et")
    public void kullanıcıKutusuVeyaŞifreHatalıGirildiğindeGörüldüğünüAssertEt(String text, DataTable table) {
        List<Map<String ,String >>map=table.asMaps();
        for (Map<String, String> maps : map) {


            sendKeys(lUsernameBox, maps.get("Kullanıcı1 Adı"));
            sendKeys(lPasswordBox, maps.get("Sifre"));
            click(lGirisYapButton);
            String linkText = driver.findElement(lTextKullaniciGirisYapamadı).getText();
            System.out.println(linkText);
            Assert.assertEquals(linkText, text);
        }
    }

    @Then("Başarılı giriş")
    public void başarılıGiriş(DataTable table) {
        Map<String,String>map=table.asMap();

       sendKeys(lUsernameBox,map.get("Kullanıcı"));
        sendKeys(lPasswordBox,map.get("Sifre2"));
        click(lGirisYapButton);


    }

    @And("Kullanıcı sayfasına girildiğini doğrula")
    public void kullanıcıSayfasınaGirildiğiniDoğrula() {
        visibility(lDemoFilo);
        click(lDemoFilo);
        click(lLogout);


    }

    @Then("Kullanıcı adı kutusunu boş bırak şifre yaz Griş Yap tıkla")
    public void kullanıcıAdıKutusunuBoşBırakŞifreYazGrişYapTıkla() {
        sendKeys(lPasswordBox,"1192movita");
        click(lGirisYapButton);
    }

    @And("Kullanıcı kutusu altında {string} assert et")
    public void kullanıcıKutusuAltındaAssertEt(String text) {
        String textKullanıcıAdıGir=driver.findElement(lTextLutfenKullaniciAdiGirin).getText();
        Assert.assertEquals(textKullanıcıAdıGir,text);
        driver.findElement(lPasswordBox).clear();
    }

    @Then("Kullanıcı Kutusunu doldur Sifre kutusunu boş bırak Griş yap tıkla")
    public void kullanıcıKutusunuDoldurSifreKutusunuBoşBırakGrişYapTıkla() {
        sendKeys(lUsernameBox,"demomovita");
        click(lGirisYapButton);
    }


    @Then("Türkçe dil seçeneğine click")
    public void türkçeDilSeçeneğineClick() {
        click(lAnaSayfaDönüş);


    }

    @And("Griş Yap Buttonuna click et")
    public void grişYapButtonunaClickEt() {

        click(lTopMenuGirisyapButton);
    }

    @And("Sayfanın Türkçe olduğunu assert et")
    public void sayfanınTürkçeOlduğunuAssertEt() {
        String textSifreUnutmaLink="Şifrenizi mi unuttunuz?";
       String textOrjinal= driver.findElement(lGirisSayfasıSifreUnutmaLinki).getText();
        Assert.assertEquals(textSifreUnutmaLink,textOrjinal);
    }

    @Then("English dil seçeneğine click")
    public void englishDilSeçeneğineClick() {
        click(lAnaSayfaDönüş);
        click(lFlag);
        click(lDropDownEnglish);
    }

    @And("Giriş yap Buttonuna Click et")
    public void girişYapButtonunaClickEt() {

        click(lTopMenuLoginButton);
    }

    @And("Sayfanın English olduğunu assert et")
    public void sayfanınEnglishOlduğunuAssertEt() {
        String textSifre=driver.findElement(lTextSifreAssert).getText();
        String sifreText="Password";
        Assert.assertEquals(textSifre,sifreText);
        getScreenShoot("English Page Assertions");
    }




    @And("Şifre kutusu altında {string} assert et")
    public void şifreKutusuAltındaAssertEt(String text) {

        String textKullanıcıSıfreGir=driver.findElement(lTextLutfenSifreGirin).getText();
        Assert.assertEquals(textKullanıcıSıfreGir,text);


    }
}
