package spaces.nicaela.core;


import org.umssdiplo.automationv01.core.bootstrap.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.bootstrap.utils.PropertyAccessor;
import org.umssdiplo.automationv01.core.bootstrap.utils.WebUrls;
import spaces.nicaela.web.shoes.ShoesHome;

public final class Shoes {
    private ShoesHome shoesHome;


    private Shoes() {
        shoesHome = new ShoesHome();

    }

    public static Shoes init() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl(WebUrls.SHOES));
        return new Shoes();
    }

    public ShoesHome getShoesHome() {
        return shoesHome;
    }


}
