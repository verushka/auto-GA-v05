package spaces.boris.core;

import org.umssdiplo.automationv01.core.bootstrap.customwebdriver.ManageDriver;
import spaces.boris.domain.PropertyAccessor;
import spaces.boris.web.Machine;

public final class LoadPage {
    public static Machine loginPage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Machine();
    }
}
