package TestHome;

import Home.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    HomePage home;

    @BeforeMethod
    public void initialization() {
        home = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void testSignIn(){
        home.signIn();
    }

}
