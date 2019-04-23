Feature: Create and Incident

  Background: Incidents form is displayed
    Given 'Care4You' page is loaded
    And click 'Incidents' tab in 'Header menu'

  #Create
  Scenario Outline: Verify creation of incident
    Given click 'Create an incident' menu item in 'Incidents menu'
    And Fill 'Incident form' information
      | name   | description   | date   | type   | severity   | employeeId   |
      | <name> | <description> | <date> | <type> | <severity> | <employeeId> |
    And click 'submit' button in 'Incidents form'
    Then verify incident item with name "<name>" exist in 'Incidents list'

    Examples:
      | name           | description | date                    | type     | severity | employeeId |
      | Injury by fire | EJEMPLO     | Tuesday, April 16, 2019 | FRACTURE | HIGH     | Juan Pinto |

  #Edit
  Scenario Outline: : Verify edition of incident
    Given click 'Incidents' menu item in 'Incidents menu'
    And click 'Edit an incident' button in element with name "<name>" of 'Incidents list'
    And Fill 'Incident form' information
      | name    | description    | date    | type    | severity    | employeeId    |
      | <ename> | <edescription> | <edate> | <etype> | <eseverity> | <eemployeeId> |
    And click 'submit' button in 'Incidents form'
    Then verify incident item with name "<ename>" exist in 'Incidents list'

    Examples:
      | name           | ename              | edescription          | edate                  | etype    | eseverity | eemployeeId |
      | Injury by fire | My incident EDITED | My description EDITED | Friday, April 19, 2019 | FRACTURE | HIGH      | Juan Pinto  |

  #Delete
  Scenario: Verify deletion of incident
    Given click 'Incidents' menu item in 'Incidents menu'
    And click 'Remove an incident' button in element with name "My incident EDITED" of 'Incidents list'
    And click 'Ok' button from deletion modal
    Then verify incident item with name "My incident EDITED" has been deleted of 'Incidents list'
