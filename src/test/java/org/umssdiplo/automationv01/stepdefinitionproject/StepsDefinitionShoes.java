package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.web.ShoesBuy;
import org.umssdiplo.automationv01.core.utils.Shoes.Shoes;

public class StepsDefinitionShoes {
    private ShoesBuy shoesBuy;

    @Given("^'Home Adidas' page is loaded$")
    public void shoesPageIsLoaded() throws Throwable {
        Shoes manager = Shoes.init();

        shoesBuy = manager.getShoesBuy();
    }

    @And("^Hover on 'HOMBRE' option in 'Header menu' of home page$")
    public void hoverOnHOMBREMenuOptionInHeaderMenu() throws Throwable {
        shoesBuy.hoverOverMenMenuOption();
    }

    @And("^Click on 'Futbol' submenu link on 'Tenis' column$")
    public void clickOnFutbolSubmenuLinkOnTenisColumn() throws Throwable {
        shoesBuy.clickFutbolSubMenuLink();
    }

    @And("^Get Price 'Calzado de Fútbol X 18.3 TF' first shoes of gallery$")
    public void getPriceCalzadoDeFútbolXTFFirstShoes() throws Throwable {
        shoesBuy.getPriceShoes();
    }

    @And("^Click on 'Calzado de Fútbol X 18.3 TF' first shoes$")
    public void clickOnCalzadoDeFútbolXTFFirstShoes() throws Throwable {
        shoesBuy.clickSelectShoesFirst();
    }

    @And("^Click on 'Elige tu talle' option$")
    public void clickOnEligeTuTalleOption() throws Throwable {
        shoesBuy.clickSelectSizeOption();
    }

    @And("^Click on 'MX 9.5' size of shoes$")
    public void clickOnMXSizeOfShoes() throws Throwable {
        shoesBuy.clickSelectSize();
    }

    @And("^Click on 'Anadir al carrito' option$")
    public void clickOnAnadirAlCarritoOption() throws Throwable {
        shoesBuy.clickAddToCar();
    }

    @And("^Click on 'Ver carrito' option$")
    public void clickOnVerCarritoOption() throws Throwable {
        shoesBuy.clickSeeCar();
    }


    @Then("^Verify size \"([^\"]*)\" of shoes selected$")
    public void verifySizeOfShoesSelected(String expected) throws Throwable {
        Assert.assertEquals(shoesBuy.getSizeSelected(), expected,
                "ERROR MESSAGE: The shoes selected is not correct, You need verify the size");

    }

    @Then("^Verify quantity \"([^\"]*)\" of 'shoes' selected$")
    public void verifyQuantityOfShoesSelected(String quantityExpected) throws Throwable {
        Assert.assertEquals(shoesBuy.getQuantitySelected(), quantityExpected,
                "ERROR MESSAGE: The quantity selected is not correct, You need verify the quantity selected");
    }

    @Then("^Verify \"([^\"]*)\" price of shoes selected$")
    public void verifyPriceOfShoesSelected(String price) throws Throwable {
        Assert.assertEquals(shoesBuy.getPriceSelected(), price,
                "ERROR MESSAGE: The price is not correct, You need verify the price");

    }

    @Then("^Verify \"([^\"]*)\" total price of shoes$")
    public void verifyTotalPriceOfShoes(String totalPriceExpected) throws Throwable {
        Assert.assertEquals(shoesBuy.getTotalPriceOfShoes(), totalPriceExpected,
                "ERROR MESSAGE: The total price is not correct, You need verify the total price");
    }
}
