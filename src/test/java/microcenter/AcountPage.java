package microcenter;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class AcountPge extends CommonAPI {


    @Test
    public void SignInWithInvalidEmail() {
        hoverOver("#hypSignInWrapper > div.userDownArrow");
        click("#accountOptions > ul > li.topLvl.cid_11834");
        click("#ctl00_ContentLeftSide_hlRegistration > span");
        type("#ctl00_ContentLeftSide_ucRegistration_txtFirstName", "adam");
        type("#ctl00_ContentLeftSide_ucRegistration_txtLastName", "rayan");
        type("#ctl00_ContentLeftSide_ucRegistration_txtEmailAddress", "test@gmail.com");
        type("#ctl00_ContentLeftSide_ucRegistration_txtPhoneNumber", "3472344567");
        type("#ctl00_ContentLeftSide_ucRegistration_txtPassword", "1234Abcd");
        type("#ctl00_ContentLeftSide_ucRegistration_txtConfirmPassword", "1234Abcd");
        click("#ctl00_ContentLeftSide_ucRegistration_ckbAcceptTerms");
        click("#ctl00_ContentLeftSide_ucRegistration_btnRegisterAccount");
        waitFor(3);


    }

    @Test
    public void SignInWithInvalidPhoneNumber() {

        hoverOver("#hypSignInWrapper > div.userDownArrow");
        click("#accountOptions > ul > li.topLvl.cid_11834");
        click("#ctl00_ContentLeftSide_hlRegistration > span");
        type("#ctl00_ContentLeftSide_ucRegistration_txtFirstName", "adam");
        type("#ctl00_ContentLeftSide_ucRegistration_txtLastName", "rayan");
        type("#ctl00_ContentLeftSide_ucRegistration_txtEmailAddress", "test@gmail.com");
        type("#ctl00_ContentLeftSide_ucRegistration_txtPhoneNumber", "3472344");
        type("#ctl00_ContentLeftSide_ucRegistration_txtPassword", "1234Abcd");
        type("#ctl00_ContentLeftSide_ucRegistration_txtConfirmPassword", "1234Abcd");
        click("#ctl00_ContentLeftSide_ucRegistration_ckbAcceptTerms");
        click("#ctl00_ContentLeftSide_ucRegistration_btnRegisterAccount");
        waitFor(3);
    }

    @Test
    public void SignInWithInvalidPassword() {
        hoverOver("#hypSignInWrapper > div.userDownArrow");
        click("#accountOptions > ul > li.topLvl.cid_11834");
        click("#ctl00_ContentLeftSide_hlRegistration > span");
        type("#ctl00_ContentLeftSide_ucRegistration_txtFirstName", "adam");
        type("#ctl00_ContentLeftSide_ucRegistration_txtLastName", "rayan");
        type("#ctl00_ContentLeftSide_ucRegistration_txtEmailAddress", "test@gmail.com");
        type("#ctl00_ContentLeftSide_ucRegistration_txtPhoneNumber", "3472344567");
        type("#ctl00_ContentLeftSide_ucRegistration_txtPassword", "1234Abcd");
        type("#ctl00_ContentLeftSide_ucRegistration_txtConfirmPassword", "1234Abcd");
        click("#ctl00_ContentLeftSide_ucRegistration_ckbAcceptTerms");
        click("#ctl00_ContentLeftSide_ucRegistration_btnRegisterAccount");
        waitFor(3);
    }
}