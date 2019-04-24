package org.umssdiplo.automationv01.stepdefinitionproject;

import com.sun.tools.javac.util.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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
            Assert.error("Verification Exception: safetyEquipment with name: " + code + " not exists in safetyEquipment list.");
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
}
