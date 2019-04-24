Feature: Create and Incident

  Background: Incidents form is displayed
    Given 'Care4You' page is loaded
    And click 'Incidents' tab in 'Header menu'
    And click 'Create an incident' menu item in 'Incidents menu'

  Scenario Outline: Verify creation of incident
    Given Fill 'Safety equipment form' information on 'Create an Safety equipment page'
      | code   | name   | description   | stock   | image   |
      | <code> | <name> | <description> | <stock> | <image> |
    And click 'submit' button in 'Safety equipments Form'
    Then verify incident item with name "<name>" exist in 'Incidents list'

    Examples:
      | code   | name   | description   | stock   | image   |
      | Code-00A1 | Safety fires  | Safety Equipment for fires | 10 | image001  |
