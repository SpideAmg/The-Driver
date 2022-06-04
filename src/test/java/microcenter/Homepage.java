package microcenter;

import Base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Homepage extends CommonAPI {
    @Test
    public void test1() {
        type("#search-query", "Computer Monitors");
        click("#searchForm > input.submit.btn");
        waitFor(2);
    }

    @Test
    public void test2() {
        type("#search-query", "Televisios");
        click("#searchForm > input.submit.btn");
        waitFor(2);
    }

    @Test
    public void test3() {
        type("#search-query", "AIR & WATER COOLING");
        click("#searchForm > input.submit.btn");
        waitFor(2);
    }

    @Test
    public void test4() {
        type("#search-query", "pc parts");
        click("#searchForm > input.submit.btn");
        waitFor(2);
    }

    @Test
    public void test5() {
        type("#search-query", "pc parts");
        click("#searchForm > input.submit.btn");
        waitFor(2);

    }
}