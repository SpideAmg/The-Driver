package Apps.Asus;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class ProArt_Motherboards extends CommonAPI {
    @Test
    public void ProArt(){
        click("#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck");
        click("#headerLayerOne > div > div.HeaderDesktop__topLeftMenu___uskw.HeaderDesktop__themeWhite__1bpoN > div:nth-child(4) > a");
        click("#s2__productline > div > a.product__item.item-5");
        click("#s2__grid > div > div.item.item-4.text-left > div.item-content > div > div.btn-group > a");


    }
}
