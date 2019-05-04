package spaces.alain.web.Incident;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.bootstrap.managepage.BasePage;
import spaces.alain.domain.Incident;

import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.*;


public class IncidentCreate extends BasePage {
    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "description")
    private WebElement descriptionField;

    @FindBy(id = "date")
    private WebElement dateField;

    @FindBy(id = "type")
    private WebElement typeField;

    @FindBy(id = "severity")
    private WebElement severityField;

    @FindBy(id = "employeeId")
    private WebElement employeeIdField;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(xpath = "//small[@data-alert='name']")
    private WebElement alertNameField;

    @FindBy(xpath = "//small[@data-alert='date']")
    private WebElement alertDateField;

    @FindBy(xpath = "//small[@data-alert='type']")
    private WebElement alertTypeField;

    @FindBy(xpath = "//small[@data-alert='severity']")
    private WebElement alertSeverityField;

    @FindBy(xpath = "//small[@data-alert='employee']")
    private WebElement alertEmployeeField;

    public void fillIncidentsForm(Incident incident) {
        setValue(nameField, incident.getName());
        setValue(descriptionField, incident.getDescription());
        click(dateField);
        click(findByXPath(getDate(incident.getDate())));
        setValueNoEditable(typeField, incident.getType());
        setValueNoEditable(severityField, incident.getSeverity());
        setValueNoEditable(employeeIdField, incident.getEmployeeId());
    }

    public void fillNameField(String value) {
        setValue(nameField, value);
    }

    public void fillDescriptionField(String value) {
        setValue(descriptionField, value);
    }

    public void fillDateField(String value) {
        click(dateField);
        click(findByXPath(getDate(value)));
    }

    public void fillTypeField(String value) {
        setValueNoEditable(typeField, value);
    }

    public void fillSeverityField(String value) {
        setValueNoEditable(severityField, value);
    }

    public void fillEmployeeField(String value) {
        setValueNoEditable(employeeIdField, value);
    }

    public WebElement getNameLabelRequired() {
        return alertNameField;
    }

    public WebElement getDateLabelRequired() {
        return alertDateField;
    }

    public WebElement getTypeLabelRequired() {
        return alertTypeField;
    }

    public WebElement getSeverityLabelRequired() {
        return alertSeverityField;
    }

    public WebElement getEmployeeLabelRequired() {
        return alertEmployeeField;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public void submitIncidentsForm() {
        click(submitButton);
    }

    public WebElement getElement(String name) {
        return findByXPath(("//td[contains(text(), '" + name + "')]"));
    }

    public String getFieldRequiredLabel() {
        return "This field is required.";
    }

    private static String getDate(String date) {
        return "//div[@aria-label='" + date + "']";
    }
}
