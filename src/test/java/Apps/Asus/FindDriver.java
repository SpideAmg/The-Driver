package Apps.Asus;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FindDriver extends CommonAPI {
    @Test
    public void FDriver() {
        click("#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck");
        hoverOver("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > div > div.HeaderDesktop__secondRightMenuItem__3JfQe.HeaderDesktop__themeWhite__1bpoN.HeaderDesktop__hasBottomLine__3fHEX");
        click("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > div > div.HeaderDesktop__secondRightMenuItem__3JfQe.HeaderDesktop__themeWhite__1bpoN.HeaderDesktop__hasBottomLine__3fHEX > div > div > a:nth-child(1)");
        click("/html/body/div[2]/main/div[4]/div[2]/div[1]");
        click("#topBanner > div > div > div.bottom-wrapper > ul > li:nth-child(4) > div > span > svg");

    }
}
