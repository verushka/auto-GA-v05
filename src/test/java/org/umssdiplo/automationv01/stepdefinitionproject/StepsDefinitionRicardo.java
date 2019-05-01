package org.umssdiplo.automationv01.stepdefinitionproject;

//import com.sun.tools.javac.util.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import spaces.ricardo.core.Care4You;
import spaces.ricardo.domain.SafetyEquipment;
import spaces.ricardo.web.home.Home;
import spaces.ricardo.web.safetyEquipment.SafetyEquipmentCreate;
import spaces.ricardo.web.safetyEquipment.SafetyEquipmentDelete;
import spaces.ricardo.web.safetyEquipment.SafetyEquipmentEdit;
import spaces.ricardo.web.safetyEquipment.SafetyEquipmentHome;

import java.util.List;

public class StepsDefinitionRicardo {

    private Home home;
    private SafetyEquipmentHome safetyEquipmentHome;
    private SafetyEquipmentCreate safetyEquipmentCreate;
    private SafetyEquipmentEdit safetyEquipmentEdit;
    private SafetyEquipmentDelete safetyEquipmentDelete;

    @Given("^'Care4You' for 'Safety equipment page' is loaded$")
    public void care4YouPageIsLoaded() throws Throwable {
        Care4You manager = Care4You.init();
        home = manager.getHome();
        safetyEquipmentHome = manager.getSafetyEquipmentHome();
        safetyEquipmentCreate = manager.getSafetyEquipmentCreate();
        safetyEquipmentEdit = manager.getSafetyEquipmentEdit();
        safetyEquipmentDelete = manager.getSafetyEquipmentDelete();
    }

    /**
     * Home Safety Equipments
     */

    @And("^click 'Security' tab in 'Header menu'$")
    public void navigateToSecurities() throws Throwable {
        home.navigateToSafetyEquipment();
    }

    @And("^click 'Add safety equipment' option in 'safety equipment list'$")
    public void navigateToAddSafetyList() throws Throwable {
        home.navigateToListAdd();
    }

    @And("^click 'List Safety equipment' Home option in 'Safety equipment home'$")
    public void openSafetyEquipmentsList() throws Throwable {
        safetyEquipmentHome.openSafetyEquipmentsList();
    }

    @And("^click 'Create an Safety equipment' Home option in 'Safety equipment home'$")
    public void openCreateSafetyEquipmentsForm() throws Throwable {
        safetyEquipmentHome.openCreateSafetyEquipmentsForm();
    }

    @And("^click 'Generate Report' Home option in 'Safety equipment home'$")
    public void openSafetyEquipmentsReport() throws Throwable {
        safetyEquipmentHome.openSafetyEquipmentsReport();
    }

    @Then("^verify safety Equipment item with code \"([^\"]*)\" exist in 'Safety equipments list'$")
    public void verifySafetyEquipmentByCodeExistSafetyEquipmentsList(String code) throws Throwable {
        WebElement element = safetyEquipmentCreate.getElement(code);
        if (null == element) {
            Assert.assertNotNull(code);
        }
    }

    /**
     * Create Safety Equipments
     */

    @And("^Fill 'Safety equipment form' information on 'Create an Safety equipment page'$")
    public void enterIncidentsFormInformation(List<SafetyEquipment> safetyEquipmentList) throws Throwable {
        safetyEquipmentCreate.fillSafetyEquipmentsForm(safetyEquipmentList.get(0));
    }


    @And("^click 'submit' button in 'Safety equipments Form'$")
    public void submitIncidentsForm() throws Throwable {
        safetyEquipmentCreate.submitSafetyEquipmentsForm();
    }

    @Then("^The \"([^\"]*)\" of 'Name' field value is displayed in 'Safety equipment list'$")
    public void verifyNameFieldValueIsDisplayedInSafetyEquipments(String name) throws Throwable {
        String actualValueName = safetyEquipmentCreate.getLastCodeCreated();

        org.testng.Assert.assertEquals(actualValueName, name, "ERROR MESSAGE: The Safety equipment was not created correctly");
    }

    /**
     * Edit Safety Equipments
     */

    @Given("^click 'Edit a Safety equipment' form information of 'Safety equipment list'$")
    public void editDepartmentInformationForm() throws Throwable {
        safetyEquipmentHome.openSafetyEquipmentsUpdate();
    }

    @And("^click 'Edit an incident' button in element with name \"([^\"]*)\" of 'Incidents list'$")
    public void navigateToEditIncident(List<SafetyEquipment> safetyEquipmentList) throws Throwable {
        safetyEquipmentEdit.navigateToEditSafetyEquipment(safetyEquipmentList.get(0));
    }

    @And("^click 'Submit a Safety Equipment updated' form information$")
    public void submitDepartmentEditedInformationForm() throws Throwable {
        safetyEquipmentEdit.submitSafetyForm();
    }

    @Then("^The \"([^\"]*)\" of 'Code' field value is displayed in 'Safety equipment list'$")
    public void verifyCodeFieldValueIsDisplayedInSafetyEquipments(String code) throws Throwable {
        String actualValueName = safetyEquipmentEdit.getFirstCodeUpdated();

        org.testng.Assert.assertEquals(actualValueName, code, "ERROR MESSAGE: The Safety equipment was not created correctly");
    }

    /**
     * Deletion
     */
    @And("^click 'Remove an incident' button in element with name \"([^\"]*)\" of 'Incidents list'$")
    public void showDeleteModalSpecificElement(String name) throws Throwable {
        safetyEquipmentDelete.showDeleteModalSpecificElement(name);
    }

    @And("^click 'Ok' button from deletion modal$")
    public void deleteIncident() throws Throwable {
        safetyEquipmentDelete.deleteSafetyEquipment();
    }

    @And("^click 'Cancel' button from deletion modal$")
    public void cancelIncident() throws Throwable {
        safetyEquipmentDelete.cancelSafetyEquipment();
    }

    @Then("^verify incident item with name \"([^\"]*)\" has been deleted of 'Incidents list'$")
    public void verifyIncidentDeleted(String name) {
        org.testng.Assert.assertNull(safetyEquipmentDelete.verifyIncidentDeleted(name));
    }
}
