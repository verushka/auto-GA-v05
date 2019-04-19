package spaces.ricardo.web.safetyEquipment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.bootstrap.managepage.BasePage;

import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.click;

public class SafetyEquipmentHome extends BasePage {

    @FindBy(id = "list-safety-equipment-menu")
    private WebElement listSafetyEquipmentssOption;

    @FindBy(id = "create-safety-equipment-menu")
    private WebElement createSafetyEquipmentsOption;

    @FindBy(id = "report-safety-equipment-menu")
    private WebElement reportSafetyEquipmentsOption;

    public void openIncidentsList() {
        click(listSafetyEquipmentssOption);
    }

    public void openIncidentsForm() {
        click(createSafetyEquipmentsOption);
    }

    public void openIncidentsReport() {
        click(reportSafetyEquipmentsOption);
    }
}
