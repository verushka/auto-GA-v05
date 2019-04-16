# Accion, lugar del objeto, ubicacion objeto
# Click 'Registrar maquinaria' tab in 'Header page'
Feature: Home

  Background: Home page is displayed
    Given 'Care4You' page is loaded

  Scenario: Incidents page is displayed
    And click 'Incidents' tab in 'Header menu'