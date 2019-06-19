package testCignaPackage;

import base.CommonAPI;
import cignaPackage.NavigationTabs;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNavigationTabs extends CommonAPI {
    NavigationTabs navigationTabs;

    @BeforeMethod
    public void initialization(){
        navigationTabs= PageFactory.initElements(driver, NavigationTabs.class);
    }

    @Test(enabled = false)
    public void testSetIndiviual(){
        navigationTabs.setIndiviual();
    }

    @Test(enabled = false)
    public void testSetEmployeers(){
        navigationTabs.setEmployeers();
    }

    @Test(enabled = false)
    public void testSetHealth(){
        navigationTabs.setHealth();
    }

    @Test(enabled = false)
    public void testSetAbout(){
        navigationTabs.setAbout();
    }




}