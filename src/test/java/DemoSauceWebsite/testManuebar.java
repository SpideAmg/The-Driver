package DemoSauceWebsite;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class testManuebar extends CommonAPI {


    @Test
    public void PRODUCTS() {
        type("#user-name", "standard_user");
        type("#password", "secret_sauce");
        click("#login-button");

        click("#item_4_img_link > img");




    }


}