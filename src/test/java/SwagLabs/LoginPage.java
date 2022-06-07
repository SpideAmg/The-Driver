package SwagLabs;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class LoginPage extends CommonAPI {

    @Test

    public void UsingCorrectEmailandPassword(){



        type("#user-name","standard_user");
        type("#password","secret_sauce");
        click("#login-button");
        waitFor(5);
       // click("#logout_sidebar_link");


    }



}
