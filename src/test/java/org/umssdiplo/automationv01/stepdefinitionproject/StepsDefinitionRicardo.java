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
    public void navigateToSafetyEquipmentsList() throws Throwable {
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

    @And("^Fill 'Safety equipment form' information on 'Create a Safety equipment page'$")
    public void fillCreateSafetyEquipmentsForm(List<SafetyEquipment> safetyEquipmentList) throws Throwable {
        safetyEquipmentCreate.fillSafetyEquipmentsForm(safetyEquipmentList.get(0));
    }


    @And("^click 'submit' button in 'Safety equipments Form'$")
    public void submitCreateSafetyEquipmentsForm() throws Throwable {
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

    @Given("^click 'Edit a Safety equipment' option in 'Safety equipment list'$")
    public void navigateToEditSafetyEquipmentForm() throws Throwable {
        safetyEquipmentHome.openSafetyEquipmentsUpdate();
    }

    @And("^Fill 'Safety equipment form' information on 'Update a Safety equipment page$")
    public void fillEditSafetyEquipmentForm(List<SafetyEquipment> safetyEquipmentList) throws Throwable {
        safetyEquipmentEdit.navigateToEditSafetyEquipment(safetyEquipmentList.get(0));
    }

    @And("^click 'Submit a Safety Equipment updated' form information$")
    public void submitUpdateSafetyEquipmentForm() throws Throwable {
        safetyEquipmentEdit.submitSafetyForm();
    }

    @Then("^The \"([^\"]*)\" of 'Code' field value is displayed in 'Safety equipment list'$")
    public void verifyCodeFieldIsDisplayedInSafetyEquipments(String code) throws Throwable {
        String actualValueName = safetyEquipmentEdit.getFirstCodeUpdated();

        org.testng.Assert.assertEquals(actualValueName, code, "ERROR MESSAGE: The Safety equipment was not created correctly");
    }

    /**
     * Delete Safety Equipment
     */
    @And("^click 'Remove a Safety Equipment' option in 'Safety equipment list'$")
    public void navigateToDeleteModalSafetyEquipment() throws Throwable {
        safetyEquipmentHome.openSafetyEquipmentsDelete();
    }

    @And("^click 'Remove a Safety equipment' option with code \"([^\"]*)\" of 'Safety equipment list'$")
    public void showDeleteModalSpecificElement(String name) throws Throwable {
        safetyEquipmentDelete.showDeleteModalSpecificElement(name);
    }

    @And("^click 'Ok' Option from deletion Safety Equipment$")
    public void deleteOptionSafetyEquipment() throws Throwable {
        safetyEquipmentDelete.deleteASafetyEquipment();
    }

    @And("^click 'Cancel' Option from deletion Safety Equipment$")
    public void cancelModalSafetyEquipment() throws Throwable {
        safetyEquipmentDelete.cancelASafetyEquipment();
    }

    @Then("^verify 'Safety equipment' item with name \"([^\"]*)\" has been deleted of 'Safety equipment list'$")
    public void verifySafetyEquipmentDeleted(String name) {
        org.testng.Assert.assertNull(safetyEquipmentDelete.verifyIncidentDeleted(name));
    }
}
