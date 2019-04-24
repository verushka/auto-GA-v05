
Feature: Home

  Background: Home safety equipment page is displayed
    Given 'Care4You' for 'Safety equipment page' is loaded

  Scenario: Safety equipment list page is displayed
    And click 'Security' tab in 'Header menu'
    And click 'List Safety equipment' Home option in 'Safety equipment home'

  Scenario: Create safety equipment page is displayed
    And click 'Security' tab in 'Header menu'
    And click 'Create an Safety equipment' Home option in 'Safety equipment home'

  Scenario: Add safety equipment page is displayed
    And click 'Security' tab in 'Header menu'
    And click 'List Safety equipment' Home option in 'Safety equipment home'
    And click 'Add safety equipment' option in 'safety equipment list'