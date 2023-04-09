package page;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class MovitaPage {

    public MovitaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //locatorlar buraya

}
