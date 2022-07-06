package com.socradev.kata.bank;

import com.socradev.kata.bank.api.BankAccountAPI;
import com.socradev.kata.bank.domain.bankaccount.BankAccountService;

import static spark.Spark.get;
import static spark.Spark.options;
import static spark.Spark.post;

public class Routes {

    private BankAccountAPI bankAccountAPI;

    public void create() {
        createAPIs();
        swaggerRoutes();
        openAPIRoutes();
    }

    private void createAPIs() {
        BankAccountService bankAccountService = new BankAccountService();

        bankAccountAPI = new BankAccountAPI(bankAccountService);
    }

    private void openAPIRoutes() {
        get("status", (req, res) -> "OpenAPI: OK!");
        post("bankaccount", (req, res) -> bankAccountAPI.openAccount(req, res));
    }

    private void swaggerRoutes() {
        options("bankaccount/:accountId/deposit", (req, res) -> "OK");
        options("bankaccount/:accountId/withdraw", (req, res) -> "OK");
        options("bankaccount/:accountId/balance", (req, res) -> "OK");
    }
}
