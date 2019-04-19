package spaces.nicaela.web.department;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.bootstrap.managepage.BasePage;

import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.*;


public class DepartmentHome extends BasePage {

    @FindBy(id = "list-departments-menu")
    private WebElement listDepartmentsOption;


    @FindBy(id = "create-departments-menu")
    private WebElement createDepartmentOption;


    public void openDepartmentsList() {
        click(listDepartmentsOption);
    }

    public void openDepartmentsForm() {
        click(createDepartmentOption);
    }

}
