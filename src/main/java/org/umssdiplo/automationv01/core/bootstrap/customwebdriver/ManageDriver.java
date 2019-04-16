package org.umssdiplo.automationv01.core.bootstrap.customwebdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.umssdiplo.automationv01.core.bootstrap.utils.BrowserType;
import org.umssdiplo.automationv01.core.bootstrap.utils.PropertyAccessor;

import java.util.concurrent.TimeUnit;

public class ManageDriver {
    private static final int IMPLICIT_TIME_WAIT = PropertyAccessor.getInstance().getImplicitTimeWait();
    private static final int EXPLICIT_TIME_WAIT = PropertyAccessor.getInstance().getExplicitTimeWait();
    private static ManageDriver instance;
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    private ManageDriver() {
        BrowserType driverType = BrowserType.valueOf(PropertyAccessor.getInstance().getBrowser());
        webDriver = DriverFactory.getManageDriver(driverType);
        webDriver.manage().window().maximize();
        restorePreviousTimeWait();
    }

    public static ManageDriver getInstance() {
        if (instance == null) {
            instance = new ManageDriver();
        }
        return instance;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }

    public void restorePreviousTimeWait() {
        setImplicitTimeWait(IMPLICIT_TIME_WAIT);
        setExplicitTimeWait(EXPLICIT_TIME_WAIT);
    }

    public void setImplicitTimeWait(int implicitTimeWait) {
        webDriver.manage().timeouts().implicitlyWait(implicitTimeWait, TimeUnit.SECONDS);
    }

    public void setExplicitTimeWait(int explicitTimeWait) {
        webDriverWait = new WebDriverWait(webDriver, explicitTimeWait);
    }
}
