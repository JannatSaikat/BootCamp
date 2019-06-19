package testCignaPackage;

import base.CommonAPI;
import cignaPackage.GlobalProduct;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGlobalProduct extends CommonAPI {

    GlobalProduct globalProduct;

    @BeforeMethod
    public void initialization(){
        globalProduct= PageFactory.initElements(driver,GlobalProduct.class);
    }

    @Test(enabled = false)
    public void testSetInternational(){
        globalProduct.setInternational();
    }
}