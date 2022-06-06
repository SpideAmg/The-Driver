package DemoSauceWebsite;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class addtoCard extends CommonAPI {


    @Test
    public void dropdown() {
        type("#user-name", "standard_user");
        type("#password", "secret_sauce");
        click("#login-button");
        click("//*[@id=\"shopping_cart_container\"]/a");

    }
}