package page;

import org.openqa.selenium.By;

public interface LocatorsMovita {
    String url="https://www.movita.com.tr/";
    By lLogo=By.cssSelector("#logo");
    By lPageYazısı=By.xpath("//div[text()='Mobil Vasıta İzleme Takip Sistemi']");
    By lDropDownLanguageMenu=By.id("dropdownMenuButton");
    By lDropDownEnglish=By.xpath("(//a[@class='dropdown-item'])[1]");
    By lDropDownTurkish=By.xpath("(//a[@class='dropdown-item'])[1]");
    By lTitleEnglish=By.xpath("//div[@class='tp-mask-wrap']//div[contains(text(),'Mobile')]");
    By lTitleTurkish=By.xpath("//div[@class='tp-mask-wrap']//div[contains(text(),'Mobil')]");

}
