package cignaPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends CommonAPI {

    @FindBy(xpath = "(//input[@type='search'])[1]")
    WebElement setsearch;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement clicksearch;

    @FindBy(id="search-two-tab")
    WebElement medical;


    public void searchtool(String elementsearch){
        setsearch.sendKeys(elementsearch);
        clicksearch.click();
        medical.click();


    }
}