package microcenter;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class FindLocation extends CommonAPI {

    @Test
    public void findStore_By_List() {
        hoverOver("#siteSelections > div.rightItems.inline > ul.myStore.inline > li.title > div.storeDownArrow");
        click("#storeInfo > ul > li.changeMyStore > div > div > button > i");
        click("#storeInfo > ul > li.changeMyStore > div > ul > li.dropdown-itemLI.store_105 > a");
        waitFor(2);

    }

    @Test
    public void findStores_By_zipcode(){
        hoverOver("#siteSelections > div.rightItems.inline > ul.myStore.inline > li.title > div.storeDownArrow");
        type("#findStoreZip", "11358");
        click("#findStoreButton");
        waitFor(2);

    }

}


