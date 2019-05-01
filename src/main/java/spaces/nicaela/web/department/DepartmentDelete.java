package spaces.nicaela.web.department;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.bootstrap.managepage.BasePage;

import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.*;


public class DepartmentDelete extends BasePage {

    @FindBy(id = "department-delete-2")
    private WebElement deleteDepartment1;

    @FindBy(id = "department-delete-ok")
    private WebElement deleteDepartmentOk;

    @FindBy(xpath = "//table[@id='table-departments-list']/tbody/tr[last()]//parent::tr//button[contains(@name, 'Delete department')]")
    private WebElement lastDeleteOption;

    public void optionDeleteDepartmentForm() {
        click(deleteDepartment1);
    }

    public void deleteDepartmentOkForm() {
        click(deleteDepartmentOk);
    }

    public void optionDeleteLasItemCreated() {
        WebElement table = webDriver.findElement(By.id("table-departments-list"));
        int numOfRow = table.findElements(By.tagName("tr")).size() - 1;
        String itemForDelete = "department-delete-" + numOfRow;
        webDriver.findElement(By.id(itemForDelete)).click();
    }

    public Boolean existOptionDelete(){
        return isPresent(lastDeleteOption);
    }

}
