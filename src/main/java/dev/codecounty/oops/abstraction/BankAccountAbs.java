package dev.codecounty.oops.abstraction;

import java.util.logging.Logger;

public abstract class BankAccountAbs {

    String name;
    long balance;
    long accountNumber;
    String ifscCode;
    AccountType accountType;

    Logger logger = Logger.getLogger(BankAccountAbs.class.getName());

    public BankAccountAbs(String name, String ifscCode, long accountNumber,
                          AccountType accountType) {
        this.name = name;
        this.ifscCode = ifscCode;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 1000L;
    }

    abstract void deposit(long... amounts);

    abstract void withdraw(long amount);

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", accountType=" + accountType +
                '}';
    }
}
