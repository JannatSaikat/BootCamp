package cnnPackTest;

import cnnPack.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {
    HomePage homePage;

    @BeforeMethod
    public void init (){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }
    //@Test
    public void setUsTest(){
        homePage.setUs();

    }
    @Test(enabled = false)
    public void setWorldTest(){
        homePage.setWorld();
    }
    @Test(enabled = false)
    public  void setPoliticsTest(){
        homePage.setPolitics();
    }
    @Test
    public void setsearchNewsTest(){
        homePage.setSearchnews();
    }


}