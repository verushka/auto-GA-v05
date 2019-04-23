package org.umssdiplo.automationv01.core.managepage.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

import static org.umssdiplo.automationv01.core.utils.CommonEvents.clickButton;
import static org.umssdiplo.automationv01.core.utils.CommonEvents.hover;


public class ShoesBuy extends BasePage {


    @FindBy(xpath = "//a[@href='/hombre']")
    private WebElement menMenuOption;

    @FindBy(xpath = "//a[@href='/calzado_de_futbol-hombre']")
    private WebElement futbolSubMenuLink;

    @FindBy(xpath = "//div[@title='Calzado de Fútbol X 18.3 TF']/parent::div//span[contains(@class, 'gl-price__value gl-price__value--sale')]")
    private WebElement valuePriceShoes;

    @FindBy(xpath = "//a[@href='/calzado-de-futbol-x-18.3-tf/BB9398.html']")
    private WebElement selectShoesFirst;

    @FindBy(xpath = "//button[@title='Elige tu talla']")
    private WebElement buttonSelectSizeOption;

    @FindBy(xpath = "//button[@value='BB9398_680']")
    private WebElement buttonSizeShoes;

    @FindBy(xpath = "//button[contains(@aria-label,'Añadir al carrito')]")
    private WebElement buttonAddtoCar;

    @FindBy(xpath = "//a[text()='ver carrito']")
    private WebElement buttonSeeCar;

    @FindBy(xpath = "//a[@title='Calzado de Fútbol X 18.3 TF']")
    private WebElement sizeShoesSelected;

    @FindBy(xpath = "//a[@class='ffSelectButton']//span[text()='1']")
    private WebElement quantitySelectedOfShoes;

    @FindBy(xpath = "//div[@class='cart-widget-block cart-widget-row cart-widget-title cart-widget-maintitle']//div[@class='cart-widget-value']")
    private WebElement priceOfShoesSelected;

    @FindBy(xpath = "//div[@class='cart-widget-row cart-widget-title cart-widget-maintitle cart-products-ordertotal']//div[@class='cart-widget-value']")
    private WebElement totalPriceOfShoes;

    public void hoverOverMenMenuOption() {
        hover(menMenuOption);
    }

    public void clickFutbolSubMenuLink() {
        clickButton(futbolSubMenuLink);
    }

    public String getPriceShoes() {
        return valuePriceShoes.getText();
    }

    public void clickSelectShoesFirst() {
        clickButton(selectShoesFirst);
    }

    public void clickSelectSizeOption() {
        clickButton(buttonSelectSizeOption);
    }

    public void clickSelectSize() {
        clickButton(buttonSizeShoes);
    }

    public void clickAddToCar() {
        clickButton(buttonAddtoCar);
    }

    public void clickSeeCar() {
        clickButton(buttonSeeCar);
    }

    public String getSizeSelected() {
        return sizeShoesSelected.getText();

    }

    public String getQuantitySelected() {
        return quantitySelectedOfShoes.getText();
    }

    public String getPriceSelected() {
        return priceOfShoesSelected.getText();

    }

    public String getTotalPriceOfShoes() {
        return totalPriceOfShoes.getText();

    }
}
