package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.bootstrap.utils.CommonEvents;
import spaces.boris.core.LoadPage;
import spaces.boris.web.Machine;


public class StepsDefinitionBoris {
    private Machine machine;


    @Given("^click on 'Register new machine' from lateral menu in 'Machine' page$")
    public void goRegisterSection() {
        machine.registerMachine();
    }

    @And("^click on 'Machine' option from the 'Top Menu' of the main page$")
    public void goToMachineSection() throws Throwable {
        machine.machineSection();
    }

    @Given("^click on 'Machine' option from the 'Top Menu' of the main page Care4You$")
    public void goToMachine() throws Throwable {
        machine.machineSection();
    }

    @Given("^click on 'delete' option from 'list of machine' in the 'Machine' page$")
    public void deleteAMachine() throws Throwable{
        machine.deleteMachine();
    }

    @Given("^click on 'edit' option from 'list of machine' in the 'Machine' page$")
    public void editAMachine() {
        machine.editMachine();
    }

    @Given("^'Care4You' page is loaded in main page$")
    public void theUserEnterToHome() {
        machine= LoadPage.loginPage();
    }


    @Then("^verify that the 'Machine' is register$")
    public void theMachineWasRegistered() {

       String URL = CommonEvents.getCurrentUrl();
       Assert.assertEquals(URL, "http://localhost:4200/machines/create" );
    }

    @Then("^verify that the 'Machine' is edit$")
    public void theMachineWasEdited() {

       String URL = CommonEvents.getCurrentUrl();
       Assert.assertEquals(URL, "http://localhost:4200/machines/update" );
    }

    @Then("^verify that the 'Machine' is delete$")
    public void theMachineWasDeleted() {
        String URL = CommonEvents.getCurrentUrl();
        Assert.assertEquals(URL, "http://localhost:4200/machines/list" );
    }

    @Then("^Verify that the 'Machines' are listed$")
    public void verifyThatTheMachinesAreListed() {
        String URL = CommonEvents.getCurrentUrl();
        Assert.assertEquals(URL, "http://localhost:4200/machines/list");
    }

    @And("^fill the 'Name' option from forms in 'New Machine' page$")
    public void fillTheNameOptionFromFormsInNewMachinePage() {
        machine.fillName();
    }

    @And("^fill the 'Mark' option from forms in 'New Machine' page$")
    public void fillTheMarkOptionFromFormsInNewMachinePage() {
        machine.fillMark();
    }

    @And("^fill the 'Model' option from forms in 'New Machine' page$")
    public void fillTheModelOptionFromFormsInNewMachinePage() {
        machine.fillModel();
    }

    @And("^fill the 'Price' option from forms in 'New Machine' page$")
    public void fillThePriceOptionFromFormsInNewMachinePage() {
        machine.fillPrice();
    }

    @And("^fill the 'Capacity' option from forms in 'New Machine' page$")
    public void fillTheCapacityOptionFromFormsInNewMachinePage() {
        machine.fillCapacity();
    }

    @And("^fill the 'Description' option from forms in 'New Machine' page$")
    public void fillTheDescriptionOptionFromFormsInNewMachinePage() {
        machine.fillDescription();
    }

    @And("^click on 'Submit' option from forms in 'New Machine' page$")
    public void clickOnSubmitOptionFromFormsInNewMachinePage() {
        machine.selectSubmit();
    }
}
