package dev.codecounty.oops.abstraction.interfaces;

import dev.codecounty.oops.abstraction.AccountType;
import dev.codecounty.oops.abstraction.OfflineBank;
import dev.codecounty.oops.abstraction.RBI;

public class BankInterfaceImpl extends OfflineBank implements BankInterface, RBI {

    String name;
    long balance;
    long accountNumber;
    String ifscCode;
    AccountType accountType;


    public BankInterfaceImpl(String name, long balance, long accountNumber, String ifscCode, AccountType accountType) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.accountType = accountType;
    }

    @Override
    public void deposit(long... amounts) {

        for (long amt : amounts) {
            if (amt <= 0) {
                logger.warning("Invalid amounts");
            } else
                balance += amt;
        }

        logger.info("New balance is " + balance);

    }


    @Override
    public void withdraw(long amount) {
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
    public boolean isLicensed() {
        return true;
    }
}
