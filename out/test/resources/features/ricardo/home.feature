# Accion, lugar del objeto, ubicacion objeto
# Click 'Registrar maquinaria' tab in 'Header page'
Feature: Home

  Background: Home page is displayed
    Given 'Care4You' page is loaded

  Scenario: Safety equipment page is displayed
    And click 'Security' tab in 'Header menu'
    And click 'List Safety equipment' Home option in 'Safety equipment home'
    And click 'Create an Safety equipment' Home option in 'Safety equipment home'