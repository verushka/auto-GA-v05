Feature: Buy shoes of men

  Background: Shoes option menu is displayed
    Given 'Home Adidas' page is loaded

  Scenario: Select shoes of men
    And Hover on 'HOMBRE' option in 'Header menu' of home page
    And Click on 'Futbol' submenu link on 'Tenis' column
    And Get Price 'Calzado de Fútbol X 18.3 TF' first shoes of gallery
    And Click on 'Calzado de Fútbol X 18.3 TF' first shoes
    And Click on 'Elige tu talle' option
    And Click on 'MX 9.5' size of shoes
    And Click on 'Anadir al carrito' option
    And Click on 'Ver carrito' option
    Then Verify size "CALZADO DE FÚTBOL X 18.3 TF" of shoes selected
    Then Verify quantity "1" of 'shoes' selected
    Then Verify "$1,329.00" price of shoes selected
    Then Verify "$1,428.00" total price of shoes

