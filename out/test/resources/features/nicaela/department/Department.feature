@all
@department
Feature: Department

  Scenario: Departments list is displayed
    Given 'Care4You' page is loaded
    And click 'Departments' tab in 'Header menu'

  Scenario: Verify options on submenu departments
    Then Verify that exist 'Create a department' option on submenu 'Department'

  #Create
  Scenario Outline:  Create a department form information
    Given click 'Create a department' menu item in 'Departments menu
    Then Verify that 'code field' "This field is required." is required on 'Create department'form
    Then Verify that 'name field' "This field is required." is required on 'Create department'form
    And Enter 'Data of a department' form information
      | code   | name   | description   |
      | <code> | <name> | <description> |
    Then Verify that 'code field' is not empty on form Departments
    Then Verify that 'name field' is not empty on form Departments
    And click 'Submit a department' form information
    Then The "<code>"'code' field value is displayed in 'Departments


    Examples:
      | code                        | name                   | description          |
      | department-machine-recently | Maintenance of machine | Operation of machine |


  Scenario: Verify that department registered has 'edit option' on table departments
    Then Verify that 'department registered' has 'edit' option

  #Edit
  Scenario Outline: Edit a department form information
    Given click 'Edit last department created' form information
    Then Verify that the 'edit' form is visible on 'left panel'
    And Enter 'Data to edit a department' form information
      | code         | name         | description         |
      | <code-value> | <name-value> | <value-description> |
    And click 'Submit a department edited' form information
    Then Verify that "<name-value>" 'name' is edited in 'Departments'

    Examples:
      | code-value                   | name-value       | value-description     |
      | department-edited-recently 1 | Operation edited | My description edited |

  Scenario: Verify that department registered has 'delete option' on table departments
    Then Verify 'department registered' has 'delete' option

  #Delete
  Scenario: Departments form is displayed
    Given 'Care4You' page is loaded
    And click 'Departments' tab in 'Header menu'
    And click 'Create an department' menu item in 'Departments menu

