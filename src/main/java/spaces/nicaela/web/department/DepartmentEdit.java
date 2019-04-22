package spaces.nicaela.web.department;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.bootstrap.managepage.BasePage;
import spaces.nicaela.domain.Department;

import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.*;


public class DepartmentEdit extends BasePage {

    @FindBy(id = "code")
    private WebElement codeInput;

    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id = "description")
    private WebElement descriptionInput;

    @FindBy(id = "department-edit-2")
    private WebElement editDepartment1;

    @FindBy(id = "department-submit")
    private WebElement submitDepartment;

    @FindBy(xpath = "//table[@id='table-departments-list']/tbody/tr[last()]/td[contains(@id, 'department-name')]")
    private WebElement lastRowCodeValue;

    @FindBy(xpath = "//table[@id='table-departments-list']/tbody/tr[last()]/td[contains(@id, 'department-name')]/parent::tr//button[contains(@class, 'fa-pencil')]")
    private WebElement lastRowButton;

    public void submitDepartmentsForm() {
        click(submitDepartment);
    }

    public void optionEditDepartmentForm() {
        click(editDepartment1);
    }

    public void editInformationDepartmentForm(Department department) {
        setValue(codeInput, department.getCode());
        setValue(nameInput, department.getName());
        setValue(descriptionInput, department.getDescription());
    }

    public void optionLastLasDepartmentCreated() {
        click(lastRowButton);
    }

    public String getLastNameEdited() {
        return getTextContent(lastRowCodeValue);
    }

}
