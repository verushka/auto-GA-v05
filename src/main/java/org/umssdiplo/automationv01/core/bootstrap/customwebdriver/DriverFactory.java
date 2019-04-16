package org.umssdiplo.automationv01.core.bootstrap.customwebdriver;

import org.openqa.selenium.WebDriver;
import org.umssdiplo.automationv01.core.bootstrap.utils.BrowserType;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {
    private DriverFactory(){}

    public static WebDriver getManageDriver(BrowserType browserType){
        Map<BrowserType, CustomWebDriver> pickupDriver = new HashMap<>();
        pickupDriver.put(BrowserType.CHROME, new Chrome());
        pickupDriver.put(BrowserType.FIREFOX, new Firefox());

        return pickupDriver.get(browserType).generateWebDriver();
    }
}
