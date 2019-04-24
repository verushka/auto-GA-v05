# Accion, lugar del objeto, ubicacion objeto
# Click 'Registrar maquinaria' tab in 'Header page'
Feature: Home

  Background: Home page is displayed
    Given 'Care4You' page is loaded

  Scenario: Departments page is displayed
    And click 'Departments' tab in 'Header menu'
