package spaces.boris.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.bootstrap.managepage.BasePage;
import org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents;
import org.umssdiplo.automationv01.core.bootstrap.utils.Constants;
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
        String name1 = Constants.name1;
        CommonEvents.setInputField(names, name1);
        CommonEvents.clickButton(submit);
    }

    public void registerMachine(){
        CommonEvents.clickButton(newMachine);
    }

    public void fillName (){
        String name = Constants.name;
        CommonEvents.setInputField(names, name);
    }

    public void fillMark (){
        String mark = Constants.mark;
        CommonEvents.setInputField(marks, mark);
    }

    public void fillModel (){
        String model = Constants.model;
        CommonEvents.setInputField(models, model);
    }

    public void fillPrice (){
        String price = Constants.price;
        CommonEvents.setInputField(prices, price);
    }

    public void fillCapacity (){
        CommonEvents.clickButton(capacity);
        CommonEvents.clickButton(medium);
    }

    public void fillDescription (){
        String description = Constants.description;
        CommonEvents.setInputField(descriptions, description);
    }

    public void selectSubmit () {
        CommonEvents.clickButton(submit);
    }

}
