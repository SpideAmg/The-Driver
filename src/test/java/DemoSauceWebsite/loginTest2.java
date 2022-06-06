package DemoSauceWebsite;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest2 extends CommonAPI {
    String wronginfo;
    @Test
    public void LoginWithInvalidUserNameandPass() {
        type("#user-name", "standard_user");
        type("#password", "secret_sau5ce");
        click("#login-button");


    }
    }





