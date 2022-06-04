package microcenter;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class TopDeals extends CommonAPI {

    @Test
    public void allItems() {
        hoverOver("#byProd");
        hoverOver("#topLvl518");
        click("#mID518 > ul > li.tertiaryLvl.navarrow.MnID-557 > ul > li:nth-child(10) > a");
        waitFor(3);
    }

    public void AllItemsOpenBox() {
        hoverOver("#byProd");
        hoverOver("#topLvl518");
        click("#mID518 > ul > li.tertiaryLvl.navarrow.MnID-559 > ul > li:nth-child(8) > a");
        waitFor(3);
    }

    public void appleOpenBox() {
        hoverOver("#byProd");
        hoverOver("#topLvl518");
        click("#mID518 > ul > li.tertiaryLvl.navarrow.MnID-559 > ul > li:nth-child(2) > a");
        waitFor(3);
    }

    public void gamingOpenBox() {
        hoverOver("#byProd");
        hoverOver("#topLvl518");
        click(" #mID518 > ul > li.tertiaryLvl.navarrow.MnID-557 > ul > li:nth-child(7) > a");
        waitFor(3);


    }

    public void pcPartsOpenBox() {
        hoverOver("#byProd");
        hoverOver("#topLvl518");
        click("  #mID518 > ul > li.tertiaryLvl.navarrow.MnID-557 > ul > li:nth-child(3) > a");
        waitFor(3);

    }
}