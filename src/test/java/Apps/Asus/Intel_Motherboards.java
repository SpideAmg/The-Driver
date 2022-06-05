package Apps.Asus;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class Intel_Motherboards extends CommonAPI {
    @Test
    public void Intel(){
        click("#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck");
        hoverOver("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(12)");
        click("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(14) > div > div.HeaderLevelOneDropDownMenu__innerWrapper__IrKxh > ul:nth-child(2) > li:nth-child(2) > a > div");
        waitFor(3);
    }
}
