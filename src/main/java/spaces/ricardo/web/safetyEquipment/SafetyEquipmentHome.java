package spaces.ricardo.web.safetyEquipment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.bootstrap.managepage.BasePage;

import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.click;

public class SafetyEquipmentHome extends BasePage {

    @FindBy(id = "add-safety-equipment-home")
    private WebElement addSafetyOption;

    @FindBy(id = "list-safety-equipment-home")
    private WebElement listSafetyOption;

    @FindBy(id = "report-safety-equipment-menu")
    private WebElement reportSafetyEquipmentsOption;

    @FindBy(id = "update-0")
    private WebElement updateSafetyEquipmentsOption;

    @FindBy(id = "delete-0")
    private WebElement deleteSafetyEquipmentsOption;

    public void openSafetyEquipmentsList() {
        click(listSafetyOption);
    }

    public void openCreateSafetyEquipmentsForm() {
        click(addSafetyOption);
    }

    public void openSafetyEquipmentsReport() {
        click(reportSafetyEquipmentsOption);
    }

    public void openSafetyEquipmentsUpdate() {
        click(updateSafetyEquipmentsOption);
    }

    public void openSafetyEquipmentsDelete() {
        click(deleteSafetyEquipmentsOption);
    }
}
