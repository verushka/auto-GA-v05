Feature: Create a Safety equipment

  Background: Safety equipment form is open
    Given 'Care4You' page is loaded
    And click 'Create an Safety equipment' Home option in 'Safety equipment home'

  Scenario Outline: Verify Safety equipment created
    Given Fill 'Safety equipment form' information on 'Create a Safety equipment page'
      |  code  |  name  |  description  |  stock   |  image  |
      |  <se-code>  | <se-name> | <se-description> | <se-stock> | <se-image> |
    And click 'submit' button in 'Safety equipments Form'
    Then verify safety Equipment item with code "<code>" exist in 'Safety equipments list'

    Examples:
      |  se-code  |  se-name  |  se-description  |  se-stock  |  se-image  |
      | SE-001 | Injury by fire | descriptions created  |  10  |  a  |
