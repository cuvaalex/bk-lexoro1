package com.socradev.kata.bank.api;

import com.socradev.kata.bank.domain.bankaccount.BankAccountService;
import spark.Request;
import spark.Response;

public class BankAccountAPI {
    private final BankAccountService bankAccountService;

    public BankAccountAPI(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }

    public String openAccount(Request request, Response response) {
        throw new UnsupportedOperationException();
    }
}
