Feature: machine

  Background: Initialize
    Given 'Care4You' page is loaded in main page
    And click on 'Machine' option from the 'Top Menu' of the main page

  Scenario:  Register a machine
    Given click on 'Register new machine' from lateral menu in 'Machine' page
    And click on 'Submit' option from forms in 'New Machine' page
    Then Verify that 'Name' option is required
    Then Verify that 'Mark' option is required
    Then Verify that 'Model' option is required
    Then Verify that 'Price' option is required
    Then Verify that 'Description' option is required
    And fill the 'Name' option from forms in 'New Machine' page
    And fill the 'Mark' option from forms in 'New Machine' page
    And fill the 'Model' option from forms in 'New Machine' page
    And fill the 'Price' option from forms in 'New Machine' page
    And fill the 'Capacity' option from forms in 'New Machine' page
    And fill the 'Description' option from forms in 'New Machine' page
    And click on 'Submit' option from forms in 'New Machine' page
    Then verify that the 'Machine' is registered


  Scenario: Edit a machine
    Given click on 'edit' option from 'list of machine' in the 'Machine' page
    Then verify that the 'Machine' is edit

  Scenario: Delete a machine
    Given click on 'delete' option from 'list of machine' in the 'Machine' page
    Then verify that the 'Machine' is delete

  Scenario: List machines
    Given click on 'Machine' option from the 'Top Menu' of the main page Care4You
    Then Verify that the 'Machines' are listed