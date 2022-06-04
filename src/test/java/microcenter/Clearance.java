package microcenter;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class Clearance extends CommonAPI {

    @Test
    public void openBox() {
        hoverOver("byProd");
        click("#topLvl518");
        click("#mID518 > ul > li.tertiaryLvl.navarrow.MnID-559 > ul > li:nth-child(8) > a");
        waitFor(4);
    }

    @Test
    public void Closeouts() {
        hoverOver("byProd");
        click("#topLvl518");
        click("#mID518 > ul > li.tertiaryLvl.navarrow.MnID-557 > ul > li:nth-child(10) > a");
        waitFor(4);
    }


    public void Laptops_Notebooks() {
        hoverOver("byProd");
        click("#topLvl518");
        click("#mID518 > ul > li.tertiaryLvl.navarrow.MnID-557 > ul > li:nth-child(4) > a");
        waitFor(4);
    }
}