package microcenter;

import Base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AcountPage extends CommonAPI {


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
    public void whrongPhoneNumber() {

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
        //String whrongPhoneNumber = getElementText("#ctl00_ContentLeftSide_ucRegistration_vsAccountInformation > ul > li");
        waitFor(3);
       // Assert.assertEquals( whrongPhoneNumber ,"Please enter valid Mobile Phone Number");
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

    @Test
    public void missingLastNamefield() {
        hoverOver("#hypSignInWrapper > div.userDownArrow");
        click("#accountOptions > ul > li.topLvl.cid_11834");
        click("#ctl00_ContentLeftSide_hlRegistration > span");
        type("#ctl00_ContentLeftSide_ucRegistration_txtFirstName", "adam");
        type("#ctl00_ContentLeftSide_ucRegistration_txtLastName", "");
        type("#ctl00_ContentLeftSide_ucRegistration_txtEmailAddress", "test@gmail.com");
        type("#ctl00_ContentLeftSide_ucRegistration_txtPhoneNumber", "3472344567");
        type("#ctl00_ContentLeftSide_ucRegistration_txtPassword", "1234Abcd");
        type("#ctl00_ContentLeftSide_ucRegistration_txtConfirmPassword", "1234Abcd");
        click("#ctl00_ContentLeftSide_ucRegistration_ckbAcceptTerms");
        click("#ctl00_ContentLeftSide_ucRegistration_btnRegisterAccount");
        waitFor(3);

    }
    @Test
    public void missingfirstNamefield() {
        hoverOver("#hypSignInWrapper > div.userDownArrow");
        click("#accountOptions > ul > li.topLvl.cid_11834");
        click("#ctl00_ContentLeftSide_hlRegistration > span");
        type("#ctl00_ContentLeftSide_ucRegistration_txtFirstName", "");
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