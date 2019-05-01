package spaces.nicaela.web.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.bootstrap.managepage.BasePage;

import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.*;

public class Home extends BasePage {

    @FindBy(id = "root-departments-home")
    private WebElement homeOption;

    @FindBy(id = "root-departments-menu")
    private WebElement departmentsOption;

    public void navigateToDepartments() {
        click(departmentsOption);
    }

    public String getOptionDepartment() {
        return getTextContent(departmentsOption);
    }

}
