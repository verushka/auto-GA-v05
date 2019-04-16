package spaces.alain.core;


import org.umssdiplo.automationv01.core.bootstrap.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.bootstrap.utils.PropertyAccessor;
import org.umssdiplo.automationv01.core.bootstrap.utils.WebUrls;
import spaces.alain.web.Incident.IncidentCreate;
import spaces.alain.web.Incident.IncidentDelete;
import spaces.alain.web.Incident.IncidentEdit;
import spaces.alain.web.Incident.IncidentHome;
import spaces.alain.web.home.Home;

public final class Care4You {
    private Home home;
    private IncidentHome incidentHome;
    private IncidentCreate incidentCreate;
    private IncidentEdit incidentEdit;
    private IncidentDelete incidentDelete;

    private Care4You() {
        home = new Home();
        incidentHome = new IncidentHome();
        incidentCreate = new IncidentCreate();
        incidentEdit = new IncidentEdit();
        incidentDelete = new IncidentDelete();
    }

    public static Care4You init() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl(WebUrls.ALAIN));
        return new Care4You();
    }

    public Home getHome() {
        return home;
    }

    public IncidentHome getIncidentHome() {
        return incidentHome;
    }

    public IncidentCreate getIncidentCreate() {
        return incidentCreate;
    }

    public IncidentEdit getIncidentEdit() {
        return incidentEdit;
    }

    public IncidentDelete getIncidentDelete() {
        return incidentDelete;
    }
}
