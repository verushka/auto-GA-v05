package spaces.ricardo.web.safetyEquipment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.bootstrap.managepage.BasePage;
import spaces.ricardo.domain.SafetyEquipment;

import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.*;
import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.setValue;

public class SafetyEquipmentEdit extends BasePage {

    @FindBy(id = "name-edit")
    private WebElement nameField;

    @FindBy(id = "code-edit")
    private WebElement codeField;

    @FindBy(id = "stock-edit")
    private WebElement stockField;

    @FindBy(id = "description-edit")
    private WebElement descriptionField;

    @FindBy(id = "select-edit")
    private WebElement typeField;

    @FindBy(id = "add-file-edit")
    private WebElement addFileField;

    @FindBy(id = "option-safety-1")
    private WebElement option1Field;

    @FindBy(id = "option-safety-2")
    private WebElement option2Field;

    @FindBy(id = "option-safety-3")
    private WebElement option3Field;

    @FindBy(id = "submit-edit")
    private WebElement submitButton;

    public void submitIncidentsForm() {
        click(submitButton);
    }

    public WebElement getElement(String name) {
        return findByXPath(("//td[contains(text(), '" + name + "')]/parent::tr//button[contains(@class, 'fa-pencil')]"));
    }

    public void navigateToEditSafetyEquipment(String name, SafetyEquipment safetyEquipment) {
        WebElement element = getElement(name);
        click(element);
        setValue(descriptionField, safetyEquipment.getCode());
        setValue(nameField, safetyEquipment.getName());
        setValue(stockField, safetyEquipment.getStock().toString());
        setValueNoEditable(typeField, "INJURIES AND FRACTURES");
        setValue(descriptionField, safetyEquipment.getDescription());
        click(option1Field);
    }
}
