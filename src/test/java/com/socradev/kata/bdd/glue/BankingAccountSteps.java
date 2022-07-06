package com.socradev.kata.bdd.glue;

import com.socradev.kata.bank.api.BankAccountAPI;
import com.socradev.kata.bank.domain.bankaccount.BankAccountService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.mockito.Mock;
import spark.Request;
import spark.Response;

import static org.mockito.Mockito.mock;

public class BankingAccountSteps {

    BankAccountService bankAccountService;
    Request request;
    Response response;

    BankAccountAPI bankAccountAPI;
    private Integer balance;

    @Given("I don't have any account")
    public void i_don_t_have_any_account() {
        bankAccountService = mock(BankAccountService.class);
        request = mock(Request.class);
        response = mock(Response.class);
        bankAccountAPI = new BankAccountAPI(bankAccountService);
    }

    @Given("I have a firstname {string}")
    public void i_have_a_firstname(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I have a lastname {string}")
    public void i_have_a_lastname(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("the initial balance is {int}")
    public void the_initial_balance_is(Integer balance) {
        this.balance = balance;
    }

    @When("I open a new account with accountNumber {string}, accountId {int} and openingDate {string}")
    public void i_open_a_new_account_with_account_number_account_id_and_opening_date(String string, Integer int1, String string2) {

        throw new io.cucumber.java.PendingException();
    }

    @Then("I get his accountNumber {string}")
    public void i_get_his_account_number(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I get an Error on First Name, First name is empty")
    public void i_get_an_error_on_first_name_first_name_is_empty() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I get an Error on Last Name, Last name is empty")
    public void i_get_an_error_on_last_name_last_name_is_empty() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I get an Error on Balance, Balance is negative")
    public void i_get_an_error_on_balance_balance_is_negative() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
