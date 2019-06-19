package cignaPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class Account extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[2]/div/ul/li[2]/a")
    WebElement clicklogin;

    @FindBy(xpath = "//*[@id=\"register\"]")
    WebElement clickregister;

    @FindBy(xpath = "//input[@id=\"firstname\"]")
    WebElement userfirstname;

    @FindBy(xpath = "//input[@id=\"lastname\"]")
    WebElement userlastname;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;

    @FindBy(xpath = "//*[@id=\"month\"]")
    WebElement monthselection;

    @FindBy(xpath = "//*[@id=\"day\"]")
    WebElement day;

    @FindBy(xpath = "//*[@id=\"year\"]")
    WebElement year;

    @FindBy(xpath = "//*[@id=\"zipcode\"]")
    WebElement zipcode;

    @FindBy(xpath = "//input[@tabindex='2']")
    WebElement radio2;

    @FindBy(xpath = "//button[@class='summary']")
    WebElement try1;

    @FindBy(xpath = "//a[@tabindex='6']")
    WebElement try2;

    @FindBy(xpath = "//*[@id=\"username\"]")
    WebElement username;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"loginbutton\"]")
    WebElement loginbutton;

    @FindBy(xpath = "//div[@id='alertmessage']")
    WebElement alerttext;


    public void setClicklogin() {
        clicklogin.click();
        sleepFor(5);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        if (url.equals("https://www.cigna.com/")) {
            System.out.println("Url got matched");
        } else {
            System.out.println("Url did not matched");
        }
    }

    public void setRegister(String firstName, String LastName) {
        clicklogin.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        sleepFor(5);
        handleNewTab(driver);
        clickregister.click();
        userfirstname.sendKeys(firstName);
        sleepFor(3);
        userlastname.sendKeys(LastName);
        sleepFor(3);
        submit.click();
        Select select = new Select(monthselection);
        sleepFor(3);
        select.selectByVisibleText("December");
        sleepFor(3);
        day.sendKeys("01");
        sleepFor(3);
        year.sendKeys("1995");
        sleepFor(3);
        submit.click();
        zipcode.sendKeys("11419");
        sleepFor(3);
        submit.click();
        sleepFor(3);
        radio2.click();
        submit.click();
        sleepFor(3);
        try1.click();
        sleepFor(3);
        try2.click();


    }

    public void loginDetails(String user, String pass) {
        clicklogin.click();
        sleepFor(5);
        handleNewTab(driver);
        username.sendKeys(user);
        sleepFor(3);
        password.sendKeys(pass);
        sleepFor(3);
        loginbutton.click();
        sleepFor(3);
        System.out.println(alerttext.getText());


    }
}