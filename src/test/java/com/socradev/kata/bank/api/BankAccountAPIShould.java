package com.socradev.kata.bank.api;

import com.eclipsesource.json.JsonObject;
import com.socradev.kata.bank.domain.bankaccount.BankAccountEntity;
import com.socradev.kata.bank.domain.bankaccount.BankAccountBuilder;
import com.socradev.kata.bank.domain.bankaccount.BankAccountService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import spark.Request;
import spark.Response;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class BankAccountAPIShould {

    private final BankAccountEntity BANKACCOUNT_DATA = BankAccountBuilder.bankAccount().withBalance(200).build();
    @Mock
    Request request;
    @Mock
    Response response;

    @Mock
    BankAccountService bankAccountService;

    private BankAccountAPI bankAccountAPI;

    @BeforeEach
    public void initialise(){
        MockitoAnnotations.openMocks(this);
        bankAccountAPI = new BankAccountAPI(bankAccountService);
    }

    @DisplayName("create a new bank account with account number = GB41OMQP68570038161775")
    @Test
    public void create_new_bank_account_with_accountnumber_GB41OMQP68570038161775() {
        given(request.body()).willReturn(jsonContaining(BANKACCOUNT_DATA));
        bankAccountAPI.openAccount(request, response);

        verify(bankAccountService).openAccount(BANKACCOUNT_DATA);
    }

    private String jsonContaining(BankAccountEntity bankAccount) {
        return new JsonObject()
                .add("balance", bankAccount.balance)
                .toString();
    }

}
