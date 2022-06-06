package DemoSauceWebsite;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class testproducts3 extends CommonAPI {


    @Test
    public void products3() {
        type("#user-name", "standard_user");
        type("#password", "secret_sauce");
        click("#login-button");
        click("#item_3_img_link > img");
    }
}

