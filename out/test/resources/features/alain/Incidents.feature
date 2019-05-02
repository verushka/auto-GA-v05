Feature: Create and Incident

  Background: Incidents form is displayed
    Given 'Care4You' page is loaded
    Then verify that 'Incidents' tab exists in 'Header menu'
    And click on 'Incidents' tab in 'Header menu'

  #Create
  Scenario Outline: Verify creation of an incident
    Then verify that 'Create an incident' menu item exists in 'lateral Incidents menu'
    And click on 'Create an incident' menu item from 'lateral Incidents menu'
    And click on 'submit' button from 'Incidents form'
    Then verify that field 'Name' is required in 'Incidents form'
    Then verify that field 'Date' is required in 'Incidents form'
    Then verify that field 'Type' is required in 'Incidents form'
    Then verify that field 'Severity' is required in 'Incidents form'
    Then verify that field 'Employee' is required in 'Incidents form'
    And Fill 'Incident form' information
      | name   | description   | date   | type   | severity   | employeeId   |
      | <name> | <description> | <date> | <type> | <severity> | <employeeId> |
    Then verify that 'submit' button from 'Incidents form' exist
    And click on 'submit' button from 'Incidents form'
    Then verify incident item with name "<name>" exist in 'Incidents list'

    Examples:
      | name           | description | date                  | type     | severity | employeeId |
      | Injury by fire | EJEMPLO     | Thursday, May 2, 2019 | FRACTURE | HIGH     | Juan Pinto |

  #Edit
  Scenario Outline: : Verify edition of incident
    Given click 'Incidents' menu item in 'Incidents menu'
    And click 'Edit an incident' button in element with name "<name>" of 'Incidents list'
    And Fill 'Incident form' information
      | name    | description    | date    | type    | severity    | employeeId    |
      | <ename> | <edescription> | <edate> | <etype> | <eseverity> | <eemployeeId> |
    And click on 'submit' button from 'Incidents form'
    Then verify incident item with name "<ename>" exist in 'Incidents list'

    Examples:
      | name           | ename              | edescription          | edate                | etype    | eseverity | eemployeeId |
      | Injury by fire | My incident EDITED | My description EDITED | Friday, May 17, 2019 | FRACTURE | HIGH      | Juan Pinto  |

  #Delete
  Scenario: Verify deletion of incident
    Given click 'Incidents' menu item in 'Incidents menu'
    And click 'Remove an incident' button in element with name "My incident EDITED" of 'Incidents list'
    And click 'Ok' button from deletion modal
    Then verify incident item with name "My incident EDITED" has been deleted of 'Incidents list'
