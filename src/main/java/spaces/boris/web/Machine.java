package spaces.boris.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.bootstrap.managepage.BasePage;
import org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents;
import org.umssdiplo.automationv01.core.bootstrap.utils.Constants;

import static org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents.findByXPath;

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

    @FindBy(css = "body > ssi-root > article > section.ssi-body > machines-root > article > section.machines-root-body > machines-create > form > section:nth-child(1) > small.form-text.text-danger")
    private WebElement alertName;

    @FindBy(css = "body > ssi-root > article > section.ssi-body > machines-root > article > section.machines-root-body > machines-create > form > section:nth-child(2) > small.form-text.text-danger")
    private WebElement alertMark;

    @FindBy(css = "body > ssi-root > article > section.ssi-body > machines-root > article > section.machines-root-body > machines-create > form > section:nth-child(3) > small.form-text.text-danger")
    private WebElement alertModel;

    @FindBy(css = "body > ssi-root > article > section.ssi-body > machines-root > article > section.machines-root-body > machines-create > form > section:nth-child(5) > small.form-text.text-danger")
    private WebElement alertPrice;

    @FindBy(css = "body > ssi-root > article > section.ssi-body > machines-root > article > section.machines-root-body > machines-create > form > section:nth-child(6) > small")
    private WebElement alertDescription;

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

    public String nameGetText (){
        return CommonEvents.getTextContent(alertName);
    }

    public String markGetText (){
        return CommonEvents.getTextContent(alertMark);
    }

    public String modelGetText (){
        return CommonEvents.getTextContent(alertModel);
    }

    public String priceGetText (){
        return CommonEvents.getTextContent(alertPrice);
    }

    public String descriptionGetText (){
        return CommonEvents.getTextContent(alertDescription);
    }
}
