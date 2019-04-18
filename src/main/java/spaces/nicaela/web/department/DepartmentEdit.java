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
        WebElement table = webDriver.findElement(By.id("table-departments-list"));
        int numOfRow = table.findElements(By.tagName("tr")).size() - 1;

        String itemForEdit = "department-edit-" + numOfRow;

        webDriver.findElement(By.id(itemForEdit)).click();
    }

    public String getLastNameEdited() {
        return getTextContent(lastRowCodeValue);
    }

}
