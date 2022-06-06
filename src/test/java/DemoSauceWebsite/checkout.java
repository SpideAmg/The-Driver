package DemoSauceWebsite;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class checkout extends CommonAPI {


    @Test
    public void invalidusername() {
        type("#user-name", "standard_user");
        type("#password", "secret_sauce");
        click("#login-button");
        click("//*[@id=\"shopping_cart_container\"]/a");
        click("#checkout");
        type("#first-name", "huijoijhuij");
        type("#last-name", "hjgfdghj");
        type("#postal-code", "19987");
        click("#continue");
    }
}
