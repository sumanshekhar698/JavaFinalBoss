package dev.codecounty.oops.abstraction.interfaces;

import java.util.logging.Logger;

public interface BankInterface {


    // Whatever you declare as variable sthey are public static final by default
    public static final Logger logger = Logger.getLogger(BankInterface.class.getName());



    // Only abstract functions are allowed

     void deposit(long... amounts);

    abstract void withdraw(long amount);


}
