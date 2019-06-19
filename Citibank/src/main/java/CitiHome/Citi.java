package CitiHome;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Citi extends CommonAPI {

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "banking")
    public WebElement banking;

    @FindBy(linkText = "Checking")
    public WebElement checking;

    @FindBy(linkText = "Savings")
    public WebElement Savings;

    @FindBy(xpath = "//div[@role='search']")
    public WebElement search;

    @FindBy(xpath = "//input[@placeholder='Tell us what you’re looking for']")
    public WebElement inputSearch;

    @FindBy(linkText = "Search")
    public WebElement searchButton;

    @FindBy(id = "stateSelectorSelectId")
    public WebElement selectState;

    @FindBy(xpath = "//button[@type='button']")
    WebElement stateButton;

    @FindBy(partialLinkText = "When you bank")
    WebElement facilities;

    @FindBy(partialLinkText = "Set up balance")
    WebElement facilities2;


    //Sign In
    public void signIn(){
        username.sendKeys("ytpromo75@gmail.com");
        password.sendKeys("850568", Keys.ENTER);

    }

    //Banking Options
    public void banking(){
//        Actions actions = new Actions(driver);
//        actions.moveToElement(banking).build().perform();
        banking.click();
        checking.click();
        Select select = new Select(selectState);
        select.selectByIndex(2);
        sleepFor(3);
        stateButton.click();
        System.out.println(facilities.getText());
        System.out.println(facilities2.getText());
        driver.navigate().back();
        driver.navigate().back();
        banking.click();
        Savings.click();
    }

    public void search(){
        search.click();
        inputSearch.sendKeys("opening account");
        sleepFor(3);

    }


}
