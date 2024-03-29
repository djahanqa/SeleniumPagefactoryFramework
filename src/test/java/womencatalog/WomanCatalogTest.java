package womencatalog;

import base.ScriptBase;
import controller.WomanCatalog;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WomanCatalogTest extends ScriptBase {
    WomanCatalog womanCatalog;

    @BeforeTest
    public void beforetest() {
        init();
    }

    @Test
    public void verifyWomancatalog() {
        womanCatalog = new WomanCatalog(driver);
        womanCatalog.woman(driver,"Women");

    }

    @Test
    public void verifyDresscatalog() {
        womanCatalog = new WomanCatalog(driver);
        womanCatalog.woman(driver,"Dresses");
    }

    @Test
    public void verifyTshirtcatalog() {
        womanCatalog = new WomanCatalog(driver);
        womanCatalog.woman(driver,"T-shirts");
    }



    @AfterTest void closebrowser() {


        driver.close();
        driver.quit();
    }


}