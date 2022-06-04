package microcenter;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class Clearance extends CommonAPI {

    @Test
    public void closeout() {
        hoverOver("#byProd");
        click("#topLvl518");
       //click("#mID518 > ul > li.tertiaryLvl.navarrow.MnID-557 > ul > li:nth-child(10) > a");
        waitFor(3);
    }
        @Test
        public void Accessories_CloseOut() {
            hoverOver("#byProd");
            click("#topLvl518");
            click("#mID518 > ul > li.tertiaryLvl.navarrow.MnID-557 > ul > li:nth-child(6) > a");
            waitFor(3);
        }
            @Test
            public void OpenBox() {
                hoverOver("#byProd");
                click("#topLvl518");
                click("#mID518 > ul > li.tertiaryLvl.navarrow.MnID-559 > ul > li:nth-child(8) > a");
                waitFor(3);

            }
    @Test
    public void AppleOpenBox() {
        hoverOver("#byProd");
        click("#topLvl518");
       // click("#mID518 > ul > li.tertiaryLvl.navarrow.MnID-559 > ul > li:nth-child(1) > a");
        waitFor(3);
    }
}
