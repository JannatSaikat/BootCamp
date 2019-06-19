package TestHome;

import Home.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class TestHomePage extends CommonAPI {

    HomePage home;

    @BeforeMethod
    public void initialization() {
        home = PageFactory.initElements(driver, HomePage.class);
    }

    @Test (enabled = true)
    public void testSignIn(){
        Assert.assertEquals(home.signIn(),"Facebook");
        System.out.println("Facebook Log In is successfull");
    }

    @Test (enabled = false)
    public void testsearchName(){

        Assert.assertEquals(home.searchName(),"Daljeet – Facebook Search");
        System.out.println("Facebook search is working");
    }

    @Test (enabled = false )
    public void testFriendRequest(){
        home.friendRequest();
    }

    @Test(enabled = false)
    public void testAcceptRequest(){
        home.acceptRequest();
    }

    @Test(enabled = false)
    public void testLikePost(){
        home.likePost();
    }

    @Test(enabled = false)
    public void testUploadFile(){
        home.uploadFile();
    }

    @Test(enabled = false)
    public void testcomment(){
        home.comment();
    }

}
