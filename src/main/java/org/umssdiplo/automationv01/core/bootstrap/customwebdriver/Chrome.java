package org.umssdiplo.automationv01.core.bootstrap.customwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements CustomWebDriver {

    @Override
    public WebDriver generateWebDriver() {
        return new ChromeDriver();
    }
}
