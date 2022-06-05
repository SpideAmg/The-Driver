package Apps.Asus;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class Community extends CommonAPI {
    @Test
    public void Com(){
        click("#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck");
        click("#OfficialFooterWrapper > div:nth-child(1) > div.Footer__footerRightWrapper__GbL7a > div > ul > li:nth-child(1) > a");
        click("#OfficialFooterWrapper > div:nth-child(1) > div.Footer__footerRightWrapper__GbL7a > div > ul > li:nth-child(2) > a");
        click("#OfficialFooterWrapper > div:nth-child(1) > div.Footer__footerRightWrapper__GbL7a > div > ul > li:nth-child(3) > a");
        click("#OfficialFooterWrapper > div:nth-child(1) > div.Footer__footerRightWrapper__GbL7a > div > ul > li:nth-child(4) > a");
        click("#OfficialFooterWrapper > div:nth-child(1) > div.Footer__footerRightWrapper__GbL7a > div > ul > li:nth-child(6) > a");

    }
}
