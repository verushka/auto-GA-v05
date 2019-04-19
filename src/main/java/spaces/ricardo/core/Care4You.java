package spaces.ricardo.core;

import org.umssdiplo.automationv01.core.bootstrap.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.bootstrap.utils.PropertyAccessor;
import org.umssdiplo.automationv01.core.bootstrap.utils.WebUrls;
import spaces.ricardo.web.home.Home;
import spaces.ricardo.web.safetyEquipment.SafetyEquipmentCreate;
import spaces.ricardo.web.safetyEquipment.SafetyEquipmentDelete;
import spaces.ricardo.web.safetyEquipment.SafetyEquipmentEdit;
import spaces.ricardo.web.safetyEquipment.SafetyEquipmentHome;

public final class Care4You {

    private Home home;
    private SafetyEquipmentHome safetyEquipmentHome;
    private SafetyEquipmentCreate safetyEquipmentCreate;
    private SafetyEquipmentEdit safetyEquipmentEdit;
    private SafetyEquipmentDelete safetyEquipmentDelete;

    private Care4You() {
        home = new Home();
        safetyEquipmentHome = new SafetyEquipmentHome();
        safetyEquipmentCreate = new SafetyEquipmentCreate();
        safetyEquipmentEdit = new SafetyEquipmentEdit();
        safetyEquipmentDelete = new SafetyEquipmentDelete();
    }

    public static spaces.ricardo.core.Care4You init() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl(WebUrls.ALAIN));
        return new spaces.ricardo.core.Care4You();
    }

    public Home getHome() {
        return home;
    }

    public SafetyEquipmentHome getSafetyEquipmentHome() {
        return safetyEquipmentHome;
    }

    public SafetyEquipmentCreate getSafetyEquipmentCreate() {
        return safetyEquipmentCreate;
    }

    public SafetyEquipmentEdit getSafetyEquipmentEdit() {
        return safetyEquipmentEdit;
    }

    public SafetyEquipmentDelete getSafetyEquipmentDelete() {
        return safetyEquipmentDelete;
    }
}
