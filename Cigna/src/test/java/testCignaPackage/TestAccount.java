package testCignaPackage;

import base.CommonAPI;
import cignaPackage.Account;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestAccount extends CommonAPI {
    Account account ;

    @BeforeMethod
    public void initialization(){
        account = PageFactory.initElements(driver, Account.class);
    }
    @Test(enabled = false)
    public void testSetLogIn(){
        account.setClicklogin();
    }

    @Test(enabled = false)//to run
    public void testSetRegister(){
        account.setRegister("Daljeet", "Alli");
    }
    @Test(enabled = true)
    public void testLoginDetails(){
        account.loginDetails("Sohan", "Sohan123");
    }
    @Test(enabled = false)
    public void testLoginDetails1(){
        account.loginDetails("Jannat", "Jannat123");
    }
    @Test(enabled = false)
    public void testLoginDetails2(){
        account.loginDetails("Jeff", "Jeff123");
    }
    @Test(enabled = false)
    public void testLoginDetails3(){
        account.loginDetails("Winsen", "Winsen123");
    }
    @Test(enabled = false)
    public void testLoginDetails4(){
        account.loginDetails("Akli", "Akli123");
    }


}