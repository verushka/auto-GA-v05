package spaces.ricardo.web.safetyEquipment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.bootstrap.managepage.BasePage;
import spaces.ricardo.domain.SafetyEquipment;

import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.*;
import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.findByXPath;

public class SafetyEquipmentCreate extends BasePage {

    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "code")
    private WebElement codeField;

    @FindBy(id = "description")
    private WebElement descriptionField;

    @FindBy(id = "type")
    private WebElement typeField;

    @FindBy(id = "submit")
    private WebElement submitButton;

    public void fillIncidentsForm(SafetyEquipment safetyEquipment) {
        setValue(nameField, safetyEquipment.getName());
        setValue(descriptionField, safetyEquipment.getDescription());
        setValue(descriptionField, safetyEquipment.getCode());
//        setValueNoEditable(typeField, safetyEquipment.getType());
    }

    public void submitIncidentsForm() {
        click(submitButton);
    }

    public WebElement getElement(String name) {
        return findByXPath(("//td[contains(text(), '" + name + "')]"));
    }

    private static String getDate(String date) {
        return "//div[@aria-label='" + date + "']";
    }
}
