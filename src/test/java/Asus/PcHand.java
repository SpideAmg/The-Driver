package Asus;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class PcHand extends CommonAPI {
    @Test
    public void PHand(){

        click("#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck");
        hoverOver("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(9)");
        hoverOver("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(11) > div > div.HeaderLevelOneDropDownMenu__innerWrapper__IrKxh > ul.HeaderLevelOneDropDownMenu__menuColumn__17p1m.HeaderLevelOneDropDownMenu__productLevelTwo__pPSIj > li.HeaderLevelOneDropDownMenu__productLevelItemSelect__2VFHX");
        click("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(11) > div > div.HeaderLevelOneDropDownMenu__innerWrapper__IrKxh > ul:nth-child(3) > li:nth-child(4) > a > div");


    }
    }

