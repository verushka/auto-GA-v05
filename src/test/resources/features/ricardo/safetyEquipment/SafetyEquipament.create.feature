Feature: Create and Safety equipment

  Background: Safety equipment form is open
    Given 'Care4You' page is loaded
    And click 'Create an Safety equipment' Home option in 'Safety equipment home'

  Scenario Outline: Verify Safety equipment creation
    Given Fill 'Safety equipment form' information on 'Create an Safety equipment page'
      |  code  |  name  |  description  |  stock   |  image  |
      |  <code>  | <name> | <description> | <stock> | <image> |
    And click 'submit' button in 'Safety equipments Form'
    Then verify safety Equipment item with code "<code>" exist in 'Safety equipments list'

    Examples:
      | name           | description | date                    | type     | severity |
      | Injury by fire | EJEMPLO     | Tuesday, April 16, 2019 | FRACTURE | HIGH     |
