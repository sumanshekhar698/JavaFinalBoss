package dev.codecounty.oops.abstraction;

import java.util.logging.Logger;

public class BankAccount {

    String name;
    long balance;
    long accountNumber;
    String ifscCode;
    AccountType accountType;

    Logger logger = Logger.getLogger(BankAccount.class.getName());

    public BankAccount(String name, String ifscCode, long accountNumber,
                       AccountType accountType) {
        this.name = name;
        this.ifscCode = ifscCode;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 1000L;
    }

    void deposit(long... amounts) {

        for (long amt : amounts) {
            if (amt <= 0) {
                logger.warning("Invalid amounts");
            } else
                balance += amt;
        }

        logger.info("New balance is " + balance);

    }

    void withdraw(long amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
            }
        } else {
            logger.warning("Invalid amount");
        }

        logger.info("New balance is " + balance);


    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", accountType=" + accountType +
                '}';
    }
}
