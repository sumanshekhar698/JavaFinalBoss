package dev.codecounty.oops.abstraction;

public class BankAccountAbsImpl extends BankAccountAbs {

    public BankAccountAbsImpl(String name, String ifscCode,
                              long accountNumber, AccountType accountType) {
        super(name, ifscCode, accountNumber, accountType);
    }


    @Override
    void deposit(long... amounts) {

        for (long amt : amounts) {
            if (amt <= 0) {
                logger.warning("Invalid amounts");
            } else
                balance += amt;
        }

        logger.info("New balance is " + balance);

    }


    @Override
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
}
