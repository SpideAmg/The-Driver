package microcenter;

import Base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends CommonAPI {

    @Test
    public void MissingPassWordfield () {
        hoverOver("#hypSignInWrapper > div.userDownArrow");
        click("#accountOptions > ul > li.topLvl.cid_11834");
        type("#ctl00_ContentLeftSide_ucLogin_txtEmailAddress", "test@gmail.com");
        click("#ctl00_ContentLeftSide_ucLogin_btnSignIn");
        String MissingPassWordfield = getElementText("#ctl00_ContentLeftSide_ucLogin_vsRegister > ul > li > a");
        Assert.assertEquals(MissingPassWordfield ,"Password is Required");

    }

    @Test
    public void missingEmailAddressfield() {
        hoverOver("#hypSignInWrapper > div.userDownArrow");
        click("#accountOptions > ul > li.topLvl.cid_11834");
        type("#ctl00_ContentLeftSide_ucLogin_txtPassword", "1234Abcd");
        click("#ctl00_ContentLeftSide_ucLogin_btnSignIn");
        String  missingEmailAddressfield = getElementText("#ctl00_ContentLeftSide_ucLogin_vsRegister > ul > li > a");
        Assert.assertEquals( missingEmailAddressfield,"Email Address is Required");
        waitFor(3);


    }

    @Test
    public void invalidPassWord() {
        hoverOver("#hypSignInWrapper > div.userDownArrow");
        click("#accountOptions > ul > li.topLvl.cid_11834");
        type("#ctl00_ContentLeftSide_ucLogin_txtEmailAddress", "test@gmail.com");
        type("#ctl00_ContentLeftSide_ucLogin_txtPassword", "1234Abcd");
        click("#ctl00_ContentLeftSide_ucLogin_btnSignIn");
        waitFor(3);
    }

    @Test
    public void invalidUsserName() {
        hoverOver("#hypSignInWrapper > div.userDownArrow");
        click("#accountOptions > ul > li.topLvl.cid_11834");
        type("#ctl00_ContentLeftSide_ucLogin_txtEmailAddress", "test@gmail.com");
        type("#ctl00_ContentLeftSide_ucLogin_txtPassword", "1234Abcd");
        click("#ctl00_ContentLeftSide_ucLogin_btnSignIn");
        waitFor(3);
    }

          }
