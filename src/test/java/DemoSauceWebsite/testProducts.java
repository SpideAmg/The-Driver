package DemoSauceWebsite;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class testProducts extends CommonAPI {


    @Test
    public void dropdwonitiems() {
        type("#user-name", "standard_user");
        type("#password", "secret_sauce");
        click("#login-button");
        click("//*[@id=\"item_1_title_link\"]/div");




    }
}
