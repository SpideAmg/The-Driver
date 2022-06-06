package DemoSauceWebsite;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class testproducts2 extends CommonAPI {


    @Test
    public void products2 () {
        type("#user-name", "standard_user");
        type("#password", "secret_sauce");
        click("#login-button");
        click("#item_2_img_link > img");
    }
}
