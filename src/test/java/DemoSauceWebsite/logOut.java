package DemoSauceWebsite;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class logOut extends CommonAPI {


    @Test
    public void dropdown() {
        type("#user-name", "standard_user");
        type("#password", "secret_sauce");
        click("#login-button");
      click("#add-to-cart-sauce-labs-bike-light");
    }

}
