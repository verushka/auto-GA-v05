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

    @FindBy(id = "stock")
    private WebElement stockField;

    @FindBy(id = "description")
    private WebElement descriptionField;

    @FindBy(id = "select-type")
    private WebElement typeField;

    @FindBy(id = "add-file-safety")
    private WebElement addFileField;

    @FindBy(id = "option-safety-1")
    private WebElement option1Field;

    @FindBy(id = "option-safety-2")
    private WebElement option2Field;

    @FindBy(id = "option-safety-3")
    private WebElement option3Field;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(xpath = "//table[@id='table-safety-equipment-list']/tbody/tr[last()]/td[contains(@id, 'safety-codes')]")
    private WebElement lastRowCodeValueSafety;

    public void fillSafetyEquipmentsForm(SafetyEquipment safetyEquipment) {
        setValue(codeField, safetyEquipment.getCode());
        setValue(nameField, safetyEquipment.getName());
        setValue(stockField, safetyEquipment.getStock().toString());
        setValueNoEditable(typeField, "TRAUMATOLOGY");
        setValue(descriptionField, safetyEquipment.getDescription());
        click(option2Field);
    }

    public void submitSafetyEquipmentsForm() {
        click(submitButton);
    }

    public WebElement getElement(String code) {
        return findByXPath(("//td[contains(text(), '" + code + "')]"));
    }

    public String getLastCodeCreated() {
        return getTextContent(lastRowCodeValueSafety);
    }
}
