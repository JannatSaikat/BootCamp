package Home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(id = "email")
    static WebElement email;


    public void signIn(){
        email.sendKeys("soup");
    }
}
