package spaces.ricardo.web.safetyEquipment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.bootstrap.managepage.BasePage;

import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.click;
import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.findByXPath;

public class SafetyEquipmentDelete extends BasePage {

    @FindBy(id = "modal-confirm")
    private WebElement confirmButton;

    @FindBy(id = "modal-cancel")
    private WebElement cancelButton;

    public void deleteSafetyEquipment() {
        click(confirmButton);
    }

    public void cancelSafetyEquipment() {
        click(cancelButton);
    }

    public void showDeleteModalSpecificElement(String name) {
        WebElement element = findByXPath(("//td[contains(text(), '" + name + "')]/parent::tr//button[contains(@class, 'fa-trash')]"));
        click(element);
    }

    public WebElement verifyIncidentDeleted(String name) {
        try {
            return findByXPath(("//td[contains(text(), '" + name + "')]"));
        } catch (Exception e) {
            return null;
        }
    }
}
