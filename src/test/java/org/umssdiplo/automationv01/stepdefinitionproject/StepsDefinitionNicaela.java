package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import spaces.nicaela.core.Care4You;
import spaces.nicaela.domain.Department;
import spaces.nicaela.web.department.DepartmentCreate;
import spaces.nicaela.web.department.DepartmentDelete;
import spaces.nicaela.web.department.DepartmentEdit;
import spaces.nicaela.web.department.DepartmentHome;
import spaces.nicaela.web.home.Home;

import java.util.List;

public class StepsDefinitionNicaela {
    private Home home;
    private DepartmentHome departmentHome;
    private DepartmentCreate departmentCreate;
    private DepartmentEdit departmentEdit;
    private DepartmentDelete departmentDelete;

    @Given("^'Home' page is loaded$")
    public void care4YouPageIsLoaded() throws Throwable {
        Care4You manager = Care4You.init();
        departmentHome = manager.getDepartment();
        departmentCreate = manager.getDepartmentCreate();
        departmentEdit = manager.getDepartmentEdit();
        departmentDelete = manager.getDepartmentDelete();
        home = manager.getHome();
    }

    @And("^click 'Departments' tab in 'Header menu'$")
    public void navigateToDepartments() throws Throwable {
        home.navigateToDepartments();
    }

    @And("^click 'Departments' menu item in 'Departments menu'$")
    public void openDepartmentsList() throws Throwable {
        departmentHome.openDepartmentsList();
    }

    //Create a department
    @And("^click 'Create a department' menu item in 'Departments menu$")
    public void openDepartmentsForm() throws Throwable {
        departmentHome.openDepartmentsForm();
    }

    @And("^Enter 'Data of a department' form information$")
    public void enterDepartmentsFormInformation(List<Department> department) throws Throwable {
        departmentCreate.enterInformationDepartmentForm(department.get(0));
    }

    @And("^click 'Submit a department' form information$")
    public void submitDepartmentInformationForm() throws Throwable {
        departmentCreate.submitDepartmentsForm();
    }

    @Then("^The \"([^\"]*)\"'Scode' field value is displayed in 'Departments$")
    public void verifyCodeFieldValueIsDisplayedInDepartments(String code) throws Throwable {
        String actualValueCode = departmentCreate.getLastCodeAdded();

        Assert.assertEquals(actualValueCode, code, "ERROR MESSAGE: The information of department was not created correctly");
    }

    @Then("^The \"([^\"]*)\"'Name-value' field value is edited in 'Departments$")
    public void verifyCodeFieldValueEditedInDepartments(String name) throws Throwable {
        String actualValueName = departmentEdit.getLastNameEdited();

        Assert.assertEquals(actualValueName, name, "ERROR MESSAGE: The information of department was not edited correctly");
    }

    //Edit a department
    @Given("^click 'Edit a department' form information$")
    public void editDepartmentInformationForm() throws Throwable {
        departmentEdit.optionEditDepartmentForm();
    }

    @Given("^click 'Edit last department created' form information$")
    public void editLastDepartmentCreatedInformationForm() throws Throwable {
        departmentEdit.optionLastLasDepartmentCreated();
    }

    @And("^Enter 'Data to edit a department' form information$")
    public void editDepartmentsFormInformation(List<Department> department) throws Throwable {
        departmentEdit.editInformationDepartmentForm(department.get(0));
    }

    @And("^click 'Submit a department edited' form information$")
    public void submitDepartmentEditedInformationForm() throws Throwable {
        departmentEdit.submitDepartmentsForm();
    }

    // Delete a department
    @And("^click 'Delete a department' form information$")
    public void deleteDepartmentInformationForm() throws Throwable {
        departmentDelete.optionDeleteDepartmentForm();
    }

    @And("^click 'Delete last department created' form information$")
    public void deleteLasItemCreated() throws Throwable {
        departmentDelete.optionDeleteLasItemCreated();
    }

    @And("^click 'Delete a department with ok' information$")
    public void deleteDepartmentOkForm() throws Throwable {
        departmentDelete.deleteDepartmentOkForm();
    }
}
