package cignaPackage;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTabs extends CommonAPI {

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    WebElement indiviualtext;

    @FindBy(xpath = "(//a[@target='_blank'])[7]" )
    WebElement medicareplan;

    @FindBy(id = "find-state")
    WebElement selectionstate;

    @FindBy(id = "find-county")
    WebElement county;

    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    WebElement employeers;

    @FindBy(xpath = "(//a[@role='button'])[7]")
    WebElement planbutton;

    @FindBy(xpath = "(//p[@class='tooltip-item'])[1]")
    WebElement typical;

    @FindBy(xpath = "(//a[@class='nav-link'])[3]")
    WebElement healthcover;

    @FindBy(xpath = "(//a[@class='nav-link'])[4]")
    WebElement about;

    public void setIndiviual(){
        String text=indiviualtext.getText();
        Assert.assertEquals(text, "Individuals and Families");
        System.out.println("Assertion passed");
        indiviualtext.click();
        ((JavascriptExecutor) driver).executeScript("scroll(0,550);");
        System.out.println(medicareplan.getText());
        medicareplan.click();
        handleNewTab(driver);
        ((JavascriptExecutor) driver).executeScript("scroll(0,550);");
        Select select = new Select(selectionstate);
        sleepFor(3);
        select.selectByVisibleText("New York");
        sleepFor(3);
        Select select1 = new Select(county);
        select1.selectByIndex(1);
        System.out.println(county.getText());

    }

    public void setEmployeers(){
        String text=employeers.getText();
        Assert.assertEquals(text, "Employers and Brokers");
        System.out.println("Assertion passed");
        employeers.click();
        System.out.println(planbutton.getText());
        planbutton.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(typical).build().perform();

    }

    public void setHealth(){
        String text=healthcover.getText();
        Assert.assertEquals(text, "Health Care Providers");
        System.out.println("Assertion passed");
        healthcover.click();
        System.out.println(driver.getCurrentUrl());

    }

    public void setAbout(){
        String text=about.getText();
        Assert.assertEquals(text, "About Us");
        System.out.println("Assertion passed");
        about.click();
        System.out.println(driver.getCurrentUrl());

    }


}