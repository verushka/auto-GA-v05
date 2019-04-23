package org.umssdiplo.automationv01.stepdefinitionproject;

import org.testng.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import spaces.alain.core.Care4You;
import spaces.alain.domain.Incident;
import spaces.alain.web.Incident.IncidentCreate;
import spaces.alain.web.Incident.IncidentDelete;
import spaces.alain.web.Incident.IncidentEdit;
import spaces.alain.web.Incident.IncidentHome;
import spaces.alain.web.home.Home;

import java.util.List;

public class StepsDefinitionAlain {
    private Home home;
    private IncidentHome incidentHome;
    private IncidentCreate incidentCreate;
    private IncidentEdit incidentEdit;
    private IncidentDelete incidentDelete;

    @Given("^'Care4You' page is loaded$")
    public void care4YouPageIsLoaded() throws Throwable {
        Care4You manager = Care4You.init();
        home = manager.getHome();
        incidentHome = manager.getIncidentHome();
        incidentCreate = manager.getIncidentCreate();
        incidentEdit = manager.getIncidentEdit();
        incidentDelete = manager.getIncidentDelete();

    }

    /**
     * Home
     */

    @And("^click 'Incidents' tab in 'Header menu'$")
    public void navigateToIncidents() throws Throwable {
        home.navigateToIncidents();
    }

    @And("^click 'Incidents' menu item in 'Incidents menu'$")
    public void openIncidentsList() throws Throwable {
        incidentHome.openIncidentsList();
    }

    @And("^click 'Create an incident' menu item in 'Incidents menu'$")
    public void openIncidentsForm() throws Throwable {
        incidentHome.openIncidentsForm();
    }

    @And("^click 'Generate Report' menu item in 'Incidents menu$")
    public void openIncidentsReport() throws Throwable {
        incidentHome.openIncidentsReport();
    }

    /**
     * Commons
     */

    @Then("^verify incident item with name \"([^\"]*)\" exist in 'Incidents list'$")
    public void verifyIncidentItemWithNameExistInIncidentsList(String name) throws Throwable {
        WebElement element = incidentCreate.getElement(name);
        Assert.assertNotEquals(element, null);
    }

    /**
     * Creation
     */
    @And("^Fill 'Incident form' information$")
    public void enterIncidentsFormInformation(List<Incident> incident) throws Throwable {
        incidentCreate.fillIncidentsForm(incident.get(0));
    }


    @And("^click 'submit' button in 'Incidents menu'$")
    public void submitIncidentsForm() throws Throwable {
        incidentCreate.submitIncidentsForm();
    }

    /**
     * Edition
     */

    @Given("^click 'Edit an incident' button in element with name \"([^\"]*)\" of 'Incidents list'$")
    public void navigateToEditIncident(String name) throws Throwable {
        incidentEdit.navigateToEditIncident(name);
    }

    /**
     * Deletion
     */
    @Given("^click 'Remove an incident' button in element with name \"([^\"]*)\" of 'Incidents list'$")
    public void showDeleteModalSpecificElement(String name) throws Throwable {
        incidentDelete.showDeleteModalSpecificElement(name);
    }

    @And("^click 'Ok' button from deletion modal$")
    public void deleteIncident() throws Throwable {
        incidentDelete.deleteIncident();
    }

    @And("^click 'Cancel' button from deletion modal$")
    public void cancelIncident() throws Throwable {
        incidentDelete.cancelIncident();
    }

    @Then("^verify incident item with name \"([^\"]*)\" has been deleted of 'Incidents list'$")
    public void verifyIncidentDeleted(String name) {
        WebElement element = incidentDelete.verifyIncidentDeleted(name);
        Assert.assertNull(element);
    }
}
