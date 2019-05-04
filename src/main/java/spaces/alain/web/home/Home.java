package spaces.alain.web.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.bootstrap.managepage.BasePage;

import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.*;


public class Home extends BasePage {
    @FindBy(id = "root-incidents-menu")
    private WebElement incidentsOption;

    @FindBy(id = "root-incidents-home")
    private WebElement homeOption;

    public WebElement getIncidentTab() {
        return incidentsOption;
    }

    public void navigateToIncidents() {
        click(incidentsOption);
    }

    public void navigateToHome() {
        click(homeOption);
    }
}
