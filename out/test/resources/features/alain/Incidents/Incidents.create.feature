Feature: Create and Incident

  Background: Incidents form is displayed
    Given 'Care4You' page is loaded
    And click 'Incidents' tab in 'Header menu'
    And click 'Create an incident' menu item in 'Incidents menu'

  Scenario Outline: Verify creation of incident
    Given Fill 'Incident form' information
      | name   | description   | date   | type   | severity   | employeeId   |
      | <name> | <description> | <date> | <type> | <severity> | <employeeId> |
    And click 'submit' button in 'Incidents menu'
    Then verify incident item with name "<name>" exist in 'Incidents list'

    Examples:
      | name           | description | date                    | type     | severity | employeeId |
      | Injury by fire | EJEMPLO     | Tuesday, April 16, 2019 | FRACTURE | HIGH     | Juan Pinto |
