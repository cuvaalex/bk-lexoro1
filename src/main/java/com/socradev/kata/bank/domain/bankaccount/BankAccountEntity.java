package com.socradev.kata.bank.domain.bankaccount;


import java.time.LocalDate;


public class BankAccountEntity {
    public final int accountId;
    public final String accountNumber;
    public final LocalDate openingDate;
    public int balance;

    public BankAccountEntity(int accountId, String accountNumber, LocalDate openingDate, int balance) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.openingDate = openingDate;
        this.balance = balance;
    }

    public BankAccountEntity(BankAccountEntity other) {
        this(other.accountId, other.accountNumber, other.openingDate, other.balance);
    }

}
