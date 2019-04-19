package spaces.ricardo.web.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.bootstrap.managepage.BasePage;

import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.click;

public class Home extends BasePage {

    @FindBy(id = "root-security-menu")
    private WebElement safetyEquipmentOption;

    @FindBy(id = "root-safety-equipment-home")
    private WebElement homeOption;

    public void navigateToSafetyEquipment() {
        click(safetyEquipmentOption);
    }

    public void navigateToHome() {
        click(homeOption);
    }
}
