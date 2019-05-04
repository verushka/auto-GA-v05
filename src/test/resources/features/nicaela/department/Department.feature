Feature: Department

  Background: Departments list is displayed
    Given 'Home' page is loaded
    Then Verify that exist "Departments" option 'menu on header'
    And click 'Departments' tab in 'Header menu'

  Scenario: Verify options on submenu departments
    Then Verify that exist 'Create a department' option on submenu 'Department'

  #Create
  Scenario Outline:  Create a department form information
    Given click 'Create a department' menu item in 'Departments menu
    Then Verify that 'code field' "This field is required." has a message error when pressing submit button and the value is empty
    Then Verify that 'name field' "This field is required." has a message error when pressing submit button and the value is empty
    And Enter 'Data of a department' form information
      | code    | name    | description    |
      | <scode> | <sname> | <sdescription> |
    Then Verify that 'code field' is not empty on form Departments
    Then Verify that 'name field' is not empty on form Departments
    And click 'Submit a department' form information
    Then The "<scode>"'Scode' field value is displayed in 'Departments


    Examples:
      | scode                       | sname                  | sdescription         |
      | department-machine-recently | Maintenance of machine | Operation of machine |


  Scenario: Verify that department registered has 'edit option' on table departments
    Then Verify 'edit option' of department created on 'departments' table

  #Edit
  Scenario Outline: Edit a department form information
    Given click 'Edit last department created' form information
    Then Verify that the 'edit form' is visible on 'department screen'
    And Enter 'Data to edit a department' form information
      | code         | name         | description         |
      | <code-value> | <name-value> | <value-description> |
    And click 'Submit a department edited' form information
    Then The "<name-value>"'Name-value' field value is edited in 'Departments

    Examples:
      | code-value                   | name-value       | value-description     |
      | department-edited-recently 1 | Operation edited | My description edited |

  Scenario: Verify that department registered has 'delete option' on table departments
    Then Verify 'delete option' of department created on 'departments' table

  #Delete
  Scenario: Departments form is displayed
    And click 'Delete last department created' form information
    And click 'Delete a department with ok' information