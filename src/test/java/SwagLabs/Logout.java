package SwagLabs;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class Logout extends CommonAPI {

    @Test


    public void LogoutTesting(){


        type("#user-name","standard_user");
        type("#password","secret_sauce");
        click("#login-button");
       click("#react-burger-menu-btn");
        waitFor(5);
       click("#logout_sidebar_link");


    }
}
