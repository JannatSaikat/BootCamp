package cnnPackTest;

import cnnPack.VerifyPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyPageTest extends CommonAPI {

    VerifyPage pageObject;

    @BeforeMethod
    public  void initi(){
        pageObject= PageFactory.initElements(driver,VerifyPage.class);
    }
     @Test(enabled = false)
    public void setnewdispTest(){

        pageObject.setnewsdisp();
    }
    @Test(enabled = false)
    public void setLogoTest(){
        pageObject.setCNNlogo();
    }

    @Test(enabled = true)
    public void setTextvalidationTest(){
        pageObject.setTextvalidation();

    }


}