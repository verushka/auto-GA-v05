Feature: Edit a Safety equipment

  Background: Safety equipment form is open
    Given 'Care4You' page is loaded
    And click 'Edit a Safety equipment' option in 'Safety equipment list'

  Scenario Outline: Verify Safety equipment updated
    Given Fill 'Safety equipment form' information on 'Update a Safety equipment page
      |  code  |  name  |  description  |  stock   |  image  |
      |  <se-code>  | <se-name> | <se-description> | <se-stock> | <se-image> |
    And click 'Submit a Safety Equipment updated' form information
    Then The "<se-code>" of 'Code' field value is displayed in 'Safety equipment list'
    Examples:
      |  se-code  |  se-name  |  se-description  |  se-stock  |  se-image  |
      |  SE-001 EDIT |  Safety to fire EDIT |  descriptions updated  |  100  |  b  |
