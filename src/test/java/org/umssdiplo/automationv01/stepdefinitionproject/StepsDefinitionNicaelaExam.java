package org.umssdiplo.automationv01.stepdefinitionproject;


import cucumber.api.java.en.Given;

import spaces.nicaela.core.Shoes;

import spaces.nicaela.web.shoes.ShoesHome;


public class StepsDefinitionNicaelaExam {
    private ShoesHome shoesHome;



    @Given("^'Home' page of shoes is loaded$")
    public void shoesPageIsLoaded() throws Throwable {
        Shoes manager = Shoes.init();

        shoesHome = manager.getShoesHome();
    }


}
