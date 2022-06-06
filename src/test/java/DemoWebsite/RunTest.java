package DemoWebsite;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RunTest extends CommonAPI {
@Test
    public void SigninUsingWrongEmailAndPass() {

        click("#header > div.nav > div > div > nav > div.header_user_info > a");
        type("#email","hhhh@gmail.com");
        type("#passwd","hhhhh");
        click("#SubmitLogin > span");

        waitFor(2);
        //String WrongEmailAndPass = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).getText();
        String WrongEmailAndPass = getElementText("#center_column > div.alert.alert-danger > ol > li");
        waitFor(2);
        Assert.assertEquals(WrongEmailAndPass,"Authentication failed.");




    }










}
