package microcenter;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class LoginTest extends CommonAPI {

    @Test
    public void MissingPassWord() {
        hoverOver("#hypSignInWrapper > div.userDownArrow");
        click("#accountOptions > ul > li.topLvl.cid_11834");
        type("#ctl00_ContentLeftSide_ucLogin_txtEmailAddress", "test@gmail.com");
        click("#ctl00_ContentLeftSide_ucLogin_btnSignIn");
        waitFor(3);
    }

    @Test
    public void missingUserName() {
        hoverOver("#hypSignInWrapper > div.userDownArrow");
        click("#accountOptions > ul > li.topLvl.cid_11834");
        type("#ctl00_ContentLeftSide_ucLogin_txtPassword", "1234Abcd");
        click("#ctl00_ContentLeftSide_ucLogin_btnSignIn");
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
