package com.mytechathon.auto.test.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
    @Given("one thing")
    public void one_thing() {
        System.out.println("one thing");
    }
    @Given("another thing")
    public void another_thing() {
        System.out.println("another thing");
    }
    @Given("and another thing")
    public void and_another_thing() {
        System.out.println("and another thing");
    }
    @When("I open my eyes")
    public void i_open_my_eyes() {
        System.out.println("I open my eyes");
    }
    @Then("I should see something")
    public void i_should_see_something() {
        System.out.println("I should see something");
    }
    @Then("I shouldn't see something else")
    public void i_shouldn_t_see_something_else() {
        System.out.println("I shouldn't see something else");
    }
}
