package Asus;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class CollSys extends CommonAPI {
    @Test
    public void ColS(){
        click("#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck");

        hoverOver("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(12)");
        waitFor(1);
        hoverOver("#dropDownMenu > div > div.HeaderLevelOneDropDownMenu__innerWrapper__IrKxh > ul.HeaderLevelOneDropDownMenu__menuColumn__17p1m.HeaderLevelOneDropDownMenu__productLevelTwo__pPSIj > li.HeaderLevelOneDropDownMenu__productLevelItemSelect__2VFHX.menuPDLevelTwo");
        waitFor(1);
        click("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(14) > div > div.HeaderLevelOneDropDownMenu__innerWrapper__IrKxh > ul:nth-child(2) > li:nth-child(2) > a > div");


    }
}
