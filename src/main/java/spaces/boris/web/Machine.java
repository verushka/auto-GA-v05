package spaces.boris.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.bootstrap.managepage.BasePage;
import org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents;
import spaces.boris.domain.PropertyAccessor;

public class Machine extends BasePage {
    @FindBy(id = "machines")
    private WebElement machineSection;

    @FindBy(id = "newMachine")
    private WebElement newMachine;

    @FindBy(id = "name")
    private WebElement names;

    @FindBy(id = "mark")
    private WebElement marks;

    @FindBy(id = "model")
    private WebElement models;

    @FindBy(id = "capacity")
    private WebElement capacity;

    @FindBy( css = "#capacity>option:nth-child(2)")
    private WebElement medium;

    @FindBy(id = "price")
    private WebElement prices;

    @FindBy(id = "description")
    private WebElement descriptions;

    @FindBy(id = "submit")
    private WebElement submit;

    @FindBy(id = "deleteMachine")
    private WebElement deleteIcon;

    @FindBy(id = "editMachine")
    private WebElement editIcon;

    @FindBy(id = "ok")
    private WebElement ok;

    public void machineSection() {
        CommonEvents.clickButton(machineSection);
    }

    public void deleteMachine() {
        CommonEvents.clickButton(deleteIcon);
        CommonEvents.clickButton(ok);
    }

    public void editMachine() {
        CommonEvents.clickButton(editIcon);
        String name1 = PropertyAccessor.getInstance().getName1();
        CommonEvents.setInputField(names, name1);
        CommonEvents.clickButton(submit);
    }

    public void registerMachine(){
        CommonEvents.clickButton(newMachine);
        String name = PropertyAccessor.getInstance().getName();
        String mark = PropertyAccessor.getInstance().getMark();
        String model = PropertyAccessor.getInstance().getModel();
        String price = PropertyAccessor.getInstance().getPrice();
        String description = PropertyAccessor.getInstance().getDescription();
        CommonEvents.setInputField(names, name);
        CommonEvents.setInputField(marks, mark);
        CommonEvents.setInputField(models, model);
        CommonEvents.clickButton(capacity);
        CommonEvents.clickButton(medium);
        CommonEvents.setInputField(prices, price);
        CommonEvents.setInputField(descriptions, description);
        CommonEvents.clickButton(submit);
    }
}
