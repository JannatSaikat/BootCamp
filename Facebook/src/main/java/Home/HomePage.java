package Home;

import base.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonAPI {

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "pass")
    public WebElement pass;

    @FindBy(partialLinkText = "Forgot account")
    public WebElement forgot;

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement search;

    @FindBy(linkText = "People")
    WebElement people;

    @FindBy(partialLinkText = "Add Friend")
    WebElement addFriend;


    // Signing In
    public String signIn(){

        Assert.assertEquals(forgot.isEnabled(), true);
        email.sendKeys("ytpromo75@gmail.com");
        pass.sendKeys("850568", Keys.ENTER);
        //cancelAlert();
        return  driver.getTitle();
    }

    //Searching Name
    public String searchName(){
        signIn();
        Actions actions = new Actions(driver);
        actions.doubleClick(search);
        search.sendKeys("Daljeet",Keys.ENTER);
        sleepFor(3);
        return driver.getTitle();
    }

    //Send a friend request
    public void friendRequest(){
        signIn();
        addFriend.click();
    }

}
