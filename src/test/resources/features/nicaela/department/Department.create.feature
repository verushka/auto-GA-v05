Feature: Department

  Background: Departments form is displayed
    Given 'Home' page is loaded
    And click 'Departments' tab in 'Header menu'
    And click 'Create a department' menu item in 'Departments menu

  Scenario Outline:  Departments form is filled
    Given Enter 'Data of a department' form information
      | code    | name    | description    |
      | <scode> | <sname> | <sdescription> |
    And click 'Submit a department' form information
    Then The "<scode>"'Scode' field value is displayed in 'Departments


    Examples:
      | scode                       | sname                  | sdescription         |
      | department-machine-recently | Maintenance of machine | Operation of machine |

