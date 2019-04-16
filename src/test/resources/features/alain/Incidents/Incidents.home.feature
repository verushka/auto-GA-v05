Feature: Incident

  Scenario: Incidents list is displayed
    Given 'Care4You' page is loaded
    And click 'Incidents' tab in 'Header menu'
    And click 'Incidents' menu item in 'Incidents menu'

  Scenario: Incidents form is displayed
    Given 'Care4You' page is loaded
    And click 'Incidents' tab in 'Header menu'
    And click 'Create an incident' menu item in 'Incidents menu'

  Scenario: Incidents report is displayed
    Given 'Care4You' page is loaded
    And click 'Incidents' tab in 'Header menu'
    And click 'Generate Report' menu item in 'Incidents menu
