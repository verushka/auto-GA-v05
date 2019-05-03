Feature: Safety Equipment

  Background: Home safety equipment page is displayed
    Given 'Care4You' for 'Safety equipment page' is loaded

  Scenario: Add safety equipment page is displayed
    And click 'Security' tab in 'Header menu'
    And click 'List Safety equipment' Home option in 'Safety equipment home'
    And click 'Add safety equipment' option in 'safety equipment list'

  #Create
  Scenario Outline: Verify Safety equipment created
    Given Fill 'Safety equipment form' information on 'Create a Safety equipment page'
      | code      | name      | description      | stock      | image      |
      | <se-code> | <se-name> | <se-description> | <se-stock> | <se-image> |
    And click 'submit' button in 'Safety equipments Form'
    Then verify safety Equipment item with code "<code>" exist in 'Safety equipments list'

    Examples:
      | se-code | se-name        | se-description       | se-stock | se-image |
      | SE-001  | Injury by fire | descriptions created | 10       | a        |

  #Update
  Scenario Outline: Verify Safety equipment updated
    Given click 'Edit a Safety equipment' option in 'Safety equipment list'
    And Fill 'Safety equipment form' information on 'Update a Safety equipment page
      | code      | name      | description      | stock      | image      |
      | <se-code> | <se-name> | <se-description> | <se-stock> | <se-image> |
    And click 'Submit a Safety Equipment updated' form information
    Then The "<se-code>" of 'Code' field value is displayed in 'Safety equipment list'
    Examples:
      | se-code     | se-name             | se-description       | se-stock | se-image |
      | SE-001 EDIT | Injury by fire EDIT | descriptions updated | 100      | b        |

  #Delete
  Scenario: Safety equipment list page is displayed
    Given click 'Remove a Safety Equipment' option in 'Safety equipment list'
    And click 'Ok' button from deletion modal
    Then verify 'Safety equipment' item with name "Injury by fire EDIT" has been deleted of 'Safety equipment list'