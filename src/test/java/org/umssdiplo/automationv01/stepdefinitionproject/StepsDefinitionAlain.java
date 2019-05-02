package org.umssdiplo.automationv01.stepdefinitionproject;

import org.testng.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import spaces.alain.core.Care4You;
import spaces.alain.core.Exceptions;
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

    @Then("^verify that 'Incidents' tab exists in 'Header menu'$")
    public void verifyIncidentsTabExist() throws Throwable {
        WebElement createIncidentOption = home.getIncidentTab();
        Assert.assertNotNull(createIncidentOption, Exceptions.NULL_ELEMENT.getException());
    }

    @And("^click on 'Incidents' tab in 'Header menu'$")
    public void navigateToIncidents() throws Throwable {
        home.navigateToIncidents();
    }

    @Given("^click 'Incidents' menu item in 'Incidents menu'$")
    public void openIncidentsList() throws Throwable {
        incidentHome.openIncidentsList();
    }

    @Then("^verify that 'Create an incident' menu item exists in 'lateral Incidents menu'$")
    public void verifyCreateAnIncidentItemExist() throws Throwable {
        WebElement createIncidentOption = incidentHome.getCreateAnIncidentOption();
        Assert.assertNotNull(createIncidentOption, Exceptions.NULL_ELEMENT.getException());
    }

    @And("^click on 'Create an incident' menu item from 'lateral Incidents menu'$")
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
        Assert.assertNotEquals(element, null, Exceptions.ITEM_NOT_FOUND.getException(name));
    }

    /**
     * Creation
     */
    @And("^Fill 'Incident form' information$")
    public void enterIncidentsFormInformation(List<Incident> incident) throws Throwable {
        incidentCreate.fillIncidentsForm(incident.get(0));
    }

    @Then("^verify that 'submit' button from 'Incidents form' exist$")
    public void verifySubmitIncidentBtnExist() throws Throwable {
        WebElement submitButton = incidentCreate.getSubmitButton();
        Assert.assertNotNull(submitButton, Exceptions.NULL_ELEMENT.getException());
    }

    @And("^click on 'submit' button from 'Incidents form'$")
    public void submitIncidentsForm() throws Throwable {
        incidentCreate.submitIncidentsForm();
    }

    @Then("^verify that field 'Name' is required in 'Incidents form'$")
    public void verifyNameFieldFromIncidents() throws Throwable {
        WebElement label = incidentCreate.getNameLabelRequired();
        Assert.assertNotNull(label, Exceptions.NULL_ELEMENT.getException());
        Assert.assertEquals(label.getText(), incidentCreate.getFieldRequiredLabel(), Exceptions.NOT_EQUALS.getException());
    }

    @Then("^verify that field 'Date' is required in 'Incidents form'$")
    public void verifyDateFieldFromIncidents() throws Throwable {
        WebElement label = incidentCreate.getDateLabelRequired();
        Assert.assertNotNull(label, Exceptions.NULL_ELEMENT.getException());
        Assert.assertEquals(label.getText(), incidentCreate.getFieldRequiredLabel(), Exceptions.NOT_EQUALS.getException());
    }

    @Then("^verify that field 'Type' is required in 'Incidents form'$")
    public void verifyTypeFieldFromIncidents() throws Throwable {
        WebElement label = incidentCreate.getTypeLabelRequired();
        Assert.assertNotNull(label, Exceptions.NULL_ELEMENT.getException());
        Assert.assertEquals(label.getText(), incidentCreate.getFieldRequiredLabel(), Exceptions.NOT_EQUALS.getException());
    }

    @Then("^verify that field 'Severity' is required in 'Incidents form'$")
    public void verifySeverityFieldFromIncidents() throws Throwable {
        WebElement label = incidentCreate.getSeverityLabelRequired();
        Assert.assertNotNull(label, Exceptions.NULL_ELEMENT.getException());
        Assert.assertEquals(label.getText(), incidentCreate.getFieldRequiredLabel(), Exceptions.NOT_EQUALS.getException());
    }

    @Then("^verify that field 'Employee' is required in 'Incidents form'$")
    public void verifyEmployeeFieldFromIncidents() throws Throwable {
        WebElement label = incidentCreate.getEmployeeLabelRequired();
        Assert.assertNotNull(label, Exceptions.NULL_ELEMENT.getException());
        Assert.assertEquals(label.getText(), incidentCreate.getFieldRequiredLabel(), Exceptions.NOT_EQUALS.getException());
    }


    /**
     * Edition
     */

    @And("^click 'Edit an incident' button in element with name \"([^\"]*)\" of 'Incidents list'$")
    public void navigateToEditIncident(String name) throws Throwable {
        incidentEdit.navigateToEditIncident(name);
    }

    /**
     * Deletion
     */
    @And("^click 'Remove an incident' button in element with name \"([^\"]*)\" of 'Incidents list'$")
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
        Assert.assertNull(incidentDelete.verifyIncidentDeleted(name), Exceptions.NOT_NULL_ELEMENT.getException());
    }
}
