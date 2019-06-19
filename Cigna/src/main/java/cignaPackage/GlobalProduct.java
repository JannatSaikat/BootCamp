package cignaPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlobalProduct extends CommonAPI {

    @FindBy(xpath = "(//a[@class='nav-link small-text'])[1]")
    WebElement international;

    public void setInternational(){
        System.out.println( international.getText());
        international.click();
    }
}
