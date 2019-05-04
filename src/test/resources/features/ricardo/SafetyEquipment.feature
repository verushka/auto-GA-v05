Feature: Safety Equipment

  Background: Home safety equipment page is displayed
    Given 'Care4You' for 'Safety equipment page' is loaded
    And click 'Security' tab in 'Header menu'
    And click 'List Safety equipment' Home option in 'Safety equipment home'

  #Create
  Scenario Outline: Verify Safety equipment created
    Given click 'Add safety equipment' option in 'safety equipment list'
    And Fill 'Safety equipment form' information on 'Create a Safety equipment page'
      |  code       |  name       |  description       |  stock       |  image       |
      |  <se-code>  |  <se-name>  |  <se-description>  |  <se-stock>  |  <se-image>  |
    And click 'submit' button in 'Safety equipments Form'
    Then verify safety Equipment item with code "<se-code>" exist in 'Safety equipments list'

    Examples:
      | se-code | se-name        | se-description       | se-stock | se-image |
      | SE-001  | Safety to fire | descriptions created | 10       | a        |

  #Update
  Scenario Outline: Verify Safety equipment updated
    Given click 'Edit a Safety equipment' option in 'Safety equipment list'
    And Fill 'Safety equipment form' information on 'Update a Safety equipment page
      | code        | name        | description        | stock        | image      |
      | <e-se-code> | <e-se-name> | <e-se-description> | <e-se-stock> | <e-se-image> |
    And click 'Submit a Safety Equipment updated' form information
    Then The "<e-se-code>" of 'Code' field value is displayed in 'Safety equipment list'
    Examples:
      |  e-se-code    |  e-se-name            |  e-se-description      | e-se-stock  |  e-se-image  |
      |  SE-001 EDIT  |  Safety to fire EDIT  |  descriptions updated  |  100        |  b           |

  #Delete
  Scenario: Safety equipment list page is displayed
    Given click 'Remove a Safety Equipment' option in 'Safety equipment list'
    And click 'Ok' Option from deletion Safety Equipment
    Then verify 'Safety equipment' item with name "Safety to fire EDIT" has been deleted of 'Safety equipment list'