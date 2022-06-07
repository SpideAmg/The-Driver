package SwagLabs;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class hoverOver extends CommonAPI {

    @Test

    public void hoverOverTesting(){

        type("#user-name","standard_user");
        type("#password","secret_sauce");
        click("#login-button");
        click("#react-burger-menu-btn");
        waitFor(2);
        hoverOver("#about_sidebar_link");
        waitFor(5);
    }
}
