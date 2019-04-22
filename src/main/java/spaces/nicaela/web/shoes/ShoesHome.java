package spaces.nicaela.web.shoes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.bootstrap.managepage.BasePage;

import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.click;

public class ShoesHome extends BasePage {

    @FindBy(id = "root-shoes-home")
    private WebElement homeOption;

    @FindBy(id = "root-shoes-menu")
    private WebElement shoesOption;

    public void navigateToShoesMen() {
        click(shoesOption);
    }

    public void navigateToHome() {
        click(homeOption);
    }
}
