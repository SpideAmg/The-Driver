package SwagLabs;


import Base.CommonAPI;
import org.testng.annotations.Test;

public class Checkout extends CommonAPI {

    @Test

    public void CheckoutTesting() {


        type("#user-name", "standard_user");
        type("#password", "secret_sauce");
        click("#login-button");
       // click("#react-burger-menu-btn");
        click("#shopping_cart_container > a");
       // hoverOver("#about_sidebar_link");
       // click("#checkout");
        waitFor(5);
    }

}