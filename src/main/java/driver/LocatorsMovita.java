package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface LocatorsMovita {
    String url="https://www.movita.com.tr/";
    String beforeColor="#444444";



    By lLogo=By.cssSelector("#logo");
    By lPageYazısı=By.xpath("//div[text()='Mobil Vasıta İzleme Takip Sistemi']");
    By lDropDownLanguageMenu=By.id("dropdownMenuButton");
    By lDropDownEnglish=By.xpath("(//a[@class='dropdown-item'])[1]");
    By lDropDownTurkish=By.xpath("(//a[@class='dropdown-item'])[1]");
    By lTitleEnglish=By.xpath("//div[@class='tp-mask-wrap']//div[contains(text(),'Mobile')]");
    By lTitleTurkish=By.xpath("//div[@class='tp-mask-wrap']//div[contains(text(),'Mobil')]");
    By lAnaSayfaButton=By.xpath("//div[text()='Ana Sayfa']");
    By lKurumsamButton=By.xpath("//div[text()='Kurumsal']");
    By lTopMenuGirisyapButton=By.xpath("//a/div[text()='GİRİŞ Yap']");
    By lTopMenuLoginButton=By.xpath("//a/div[text()='Login']");
    By lGirisSayfasıSifreUnutmaLinki=By.linkText("Şifrenizi mi unuttunuz?");
    By lUsernameBox=By.xpath("//input[@name='username']");
    By lPasswordBox=By.xpath("//input[@name='password']");
    By lDemoFilo=By.xpath("//span[@class='user-name']");
    By lLogout=By.xpath("//a[@href='/logout']");
    By lTextLutfenSifreGirin=By.xpath("//div[contains(text(),'şifre girin')]");
    By lTextLutfenKullaniciAdiGirin=By.xpath("(//div[@class='invalid-feedback position-absolute start-0 top-100'])[1] ");
    By lTextLutfenSifreDeneme=By.xpath("//div[@class='password-toggle']/div");
    By lTextKullaniciGirisYapamadı=By.xpath("//div[text()='Kullanıcı Adı Yada Şifre Hatalı']");
    By lGirisYapButton=By.xpath("//button[@type='submit']");
    By lTextSifreAssert=By.xpath("//label[text()='Şifre']");
    By lAnaSayfaDönüş=By.xpath("//div[@class='container px-3']/a");
    By lFlag=By.id("dropdownMenuButton");




}
