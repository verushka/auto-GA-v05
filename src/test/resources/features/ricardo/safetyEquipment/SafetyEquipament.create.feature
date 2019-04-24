Feature: Create and Safety equipment

  Background: Safety equipment form is open
    Given 'Care4You' page is loaded
    And click 'Create an Safety equipment' Home option in 'Safety equipment home'

  Scenario Outline: Verify Safety equipment creation
    Given Fill 'Incident form' information
      | name   | description   | date   | type   | severity   | employeeId   |
      | <name> | <description> | <date> | <type> | <severity> | <employeeId> |
    And click 'submit' button in 'Incidents menu'
    Then verify incident item with name "<name>" exist in 'Incidents list'

    Examples:
      | name           | description | date                    | type     | severity | employeeId |
      | Injury by fire | EJEMPLO     | Tuesday, April 16, 2019 | FRACTURE | HIGH     | Juan Pinto |
