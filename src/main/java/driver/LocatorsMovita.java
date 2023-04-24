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


}
