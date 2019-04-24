Feature: machine

  Background:
    Given 'Care4You' page is loaded in main page
    And click on 'Machine' option from the 'Top Menu' of the main page

  Scenario:  Register a machine
    Given click on 'Register new machine' from lateral menu in 'Machine' page
    Then verify that the 'Machine' is register

  Scenario: Edit a machine
    Given click on 'edit' option from 'list of machine' in the 'Machine' page
    Then verify that the 'Machine' is edit

  Scenario: Delete a machine
    Given click on 'delete' option from 'list of machine' in the 'Machine' page
    Then verify that the 'Machine' is delete

  Scenario: List machines
    Given click on 'Machine' option from the 'Top Menu' of the main page Care4You
    Then Verify that the 'Machines' are listed