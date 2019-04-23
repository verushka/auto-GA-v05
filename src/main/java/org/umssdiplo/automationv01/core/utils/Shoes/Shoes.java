package org.umssdiplo.automationv01.core.utils.Shoes;


import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.web.ShoesBuy;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;


public final class Shoes {
    private ShoesBuy shoesBuy;

    private Shoes() {
        shoesBuy = new ShoesBuy();

    }

    public static Shoes init() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Shoes();
    }

    public ShoesBuy getShoesBuy() {
        return shoesBuy;
    }


}
