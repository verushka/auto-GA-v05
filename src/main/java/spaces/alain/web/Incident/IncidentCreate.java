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

    public void fillIncidentsForm(Incident incident) {
        setValue(nameField, incident.getName());
        setValue(descriptionField, incident.getDescription());
        click(dateField);
        click(findByXPath(getDate(incident.getDate())));
        setValueNoEditable(typeField, incident.getType());
        setValueNoEditable(severityField, incident.getSeverity());
        setValueNoEditable(employeeIdField, incident.getEmployeeId());
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
