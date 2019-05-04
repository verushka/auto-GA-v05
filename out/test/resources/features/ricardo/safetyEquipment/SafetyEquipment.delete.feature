Feature: Delete a Safety equipment

  Background: Home safety equipment page is displayed
    Given 'Care4You' for 'Safety equipment page' is loaded

  Scenario: Safety equipment list page is displayed
    And click 'Security' tab in 'Header menu'
    And click 'List Safety equipment' Home option in 'Safety equipment home'
    And click 'Remove a Safety Equipment' option in 'Safety equipment list'
    And click 'Ok' Option from deletion Safety Equipment
    Then verify 'Safety equipment' item with name "Safety to fire EDIT" has been deleted of 'Safety equipment list'