package com.bl.stock_account.mngmt;

public class TestAccount
{
    public static void main(String[] args) {
        Account account = new Account(1000.0);

        System.out.println("Initial balance: " + account.getBalance());

        account.credit(500.0);
        System.out.println("Balance after credit of 500: " + account.getBalance());

        account.debit(200.0);
        System.out.println("Balance after debit of 200: " + account.getBalance());

        account.debit(2000.0);
        System.out.println("Balance after debit of 2000: " + account.getBalance());
    }
}

