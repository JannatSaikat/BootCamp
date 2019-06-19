package testCignaPackage;

import base.CommonAPI;
import cignaPackage.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearch extends CommonAPI {
    Search search;

    @BeforeMethod
    public void initialization(){
        search= PageFactory.initElements(driver,Search.class);
    }

    @Test(enabled = false)
    public void testSetSearchTool(){
        search.searchtool("Thermometer");
    }

    @Test(enabled = false)
    public void testSetSearchTool1(){
        search.searchtool("Sphygmomanometer");
    }

    @Test(enabled = false)
    public void testSetSearchTool2(){
        search.searchtool("Stethoscope");
    }

    @Test(enabled = false)
    public void testSetSearchTool3(){
        search.searchtool("Suction device");
    }

    @Test(enabled = false)
    public void testSetSearchTool4(){
        search.searchtool("Endoscope");
    }

    @Test(enabled = false)
    public void testSetSearchTool5(){
        search.searchtool("Kidney dish");
    }
}