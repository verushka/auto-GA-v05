package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
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

    @Then("^Verify that 'code field' \"([^\"]*)\" has a message error when pressing submit button and the value is empty$")
    public void verifyThatHasAMessageErrorWhenIsEmpty(String messageError) throws Throwable {
        Assert.assertEquals(departmentCreate.getMessageErrorCode(), messageError, "ERROR MESSAGE: The message error is not found");
    }

    @Then("^Verify that 'name field' \"([^\"]*)\" has a message error when pressing submit button and the value is empty$")
    public void verifyThatNameFieldHasAMessageErrorWhenPressingSubmitButtonAndTheValueIsEmpty(String messageError) throws Throwable {
        Assert.assertEquals(departmentCreate.getMessageErrorName(), messageError, "ERROR MESSAGE: The message error is not found");
    }

    @Then("^Verify that exist \"([^\"]*)\" option 'menu on header'$")
    public void verifyThatExistOptionMenuOnHeader(String option) throws Throwable {
        Assert.assertEquals(home.getOptionDepartment(), option, "The option Departments is not found");
    }

    @Then("^Verify that 'code field' is not empty on form Departments$")
    public void verifyThatCodeFieldIsNotEmptyOnFormDepartments() {
        Assert.assertNotNull(departmentCreate.getContentCode(), "The value of code is not empty on department form");
    }

    @Then("^Verify that 'name field' is not empty on form Departments$")
    public void verifyThatNameFieldIsNotEmptyOnFormDepartments() {
        Assert.assertNotNull(departmentCreate.getContentName(), "The value of name is not empty on department form");
    }

    @Then("^Verify that exist 'Create a department' option on submenu 'Department'$")
    public void verifyThatExistCreateADepartmentOptionOnSubmenuDepartment() {
        Assert.assertNotNull(departmentCreate.getContentCreateDepartmentOption(), "The option create department on submenu department is not exist");
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

    @Then("^Verify 'edit option' of department created on 'departments' table$")
    public void verifyEditOptionOfDepartmentCreatedOnDepartmentsTable() {
        Assert.assertTrue(departmentEdit.existOptionEditDepartment(), "The edit option is not exist");
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

    @Then("^Verify 'delete option' of department created on 'departments' table$")
    public void verifyDeleteOptionOfDepartmentCreatedOnDepartmentsTable() {
        Assert.assertTrue(departmentDelete.existOptionDelete());
    }

    @Then("^Verify that the 'edit form' is visible on 'department screen'$")
    public void verifyThatTheEditFormIsVisibleOnDepartmentScreen() {
        Assert.assertTrue(departmentEdit.isVisibleFormToEditDepartment(), "The update form is not visible");
    }
}
