package DemoSauceWebsite;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class dropdown2  extends CommonAPI {


    @Test
    public void dropManue() {
        type("#user-name", "standard_user");
        type("#password", "secret_sauce");
        click("#login-button");
        selectFromDropdown("#react-burger-menu-btn", "Reset App State");
    }
        }
