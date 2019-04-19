package spaces.nicaela.web.department;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.bootstrap.managepage.BasePage;
import spaces.nicaela.domain.Department;

import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.*;


public class DepartmentCreate extends BasePage {

    @FindBy(id = "code")
    private WebElement codeInput;

    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id = "description")
    private WebElement descriptionInput;

    @FindBy(id = "department-submit")
    private WebElement submitDepartment;

    @FindBy(xpath = "//table[@id='table-departments-list']/tbody/tr[last()]/td[contains(@id, 'department-code')]")
    private WebElement lastRowCodeValue;

    public void submitDepartmentsForm() {
        click(submitDepartment);
    }

    public void enterInformationDepartmentForm(Department department) {
        setValue(codeInput, department.getCode());
        setValue(nameInput, department.getName());
        setValue(descriptionInput, department.getDescription());
    }

    public String getLastCodeAdded() {
        return getTextContent(lastRowCodeValue);
    }
}
