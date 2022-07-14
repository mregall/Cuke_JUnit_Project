package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
    //@Before is from Cuke.  It runs before each scenario.
    @Before
    public void setUpScenario(){
        System.out.println("This is from @Before in Hooks");
    }

    //@After also from Cuke.  It runs before each scenario.
    @After
    public void teardownScenario(){
        System.out.println("This is from @After in Hooks");
    }

}
