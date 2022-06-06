package DemoSauceWebsite;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class LoginTest extends CommonAPI {


    @Test
    public void LoginWithValiduserNameandPass() {
        type("#user-name", "standard_user");
        type("#password", "secret_sauce");
        click("#login-button");

    }
}

