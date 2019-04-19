package spaces.ricardo.web.safetyEquipment;

import org.openqa.selenium.WebElement;
import org.umssdiplo.automationv01.core.bootstrap.managepage.BasePage;

import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.click;
import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.findByXPath;

public class SafetyEquipmentEdit extends BasePage {

    public void navigateToEditSafetyEquipment(String name) {
        WebElement element = findByXPath(("//td[contains(text(), '" + name + "')]/parent::tr//button[contains(@class, 'fa-pencil')]"));
        click(element);
    }
}
