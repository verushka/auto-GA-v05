package spaces.alain.web.Incident;

import org.openqa.selenium.WebElement;
import org.umssdiplo.automationv01.core.bootstrap.managepage.BasePage;


import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.*;


public class IncidentEdit extends BasePage {

    public void navigateToEditIncident(String name) {
        WebElement element = findByXPath(("//td[contains(text(), '" + name + "')]/parent::tr//button[contains(@class, 'fa-pencil')]"));
        click(element);
    }

}
