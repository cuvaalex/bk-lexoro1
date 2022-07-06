package com.socradev.kata.bank.domain.bankaccount;

import java.time.LocalDate;

public class BankAccountBuilder {
    public static BankAccountBuilder bankAccount() {
        return new BankAccountBuilder();
    }
    private int accountId;
    private String accountNumber;
    private LocalDate openingDate;
    private int balance;

    public BankAccountBuilder withAccountId(int accountId) {
        this.accountId = accountId;
        return this;
    }

    public BankAccountBuilder withAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public BankAccountBuilder withOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
        return this;
    }

    public BankAccountBuilder withBalance(int balance) {
        this.balance = balance;
        return this;
    }

    public BankAccountEntity build() {
        return new BankAccountEntity(accountId, accountNumber, openingDate, balance);
    }


}
