Feature: Edit and Incident

  Background: Incidents form is displayed
    Given 'Care4You' page is loaded
    And click 'Incidents' tab in 'Header menu'
    And click 'Incidents' menu item in 'Incidents menu'

  Scenario Outline: : Verify edition of incident
    Given click 'Edit an incident' button in element with name "<name>" of 'Incidents list'
    And Fill 'Incident form' information
      | name    | description    | date    | type    | severity    | employeeId    |
      | <ename> | <edescription> | <edate> | <etype> | <eseverity> | <eemployeeId> |
    And click 'submit' button in 'Incidents menu'
    Then verify incident item with name "<ename>" exist in 'Incidents list'

    Examples:
      | name           | ename              | edescription          | edate                  | etype    | eseverity | eemployeeId |
      | Injury by fire | My incident EDITED | My description EDITED | Friday, April 19, 2019 | FRACTURE | HIGH      | Juan Pinto  |