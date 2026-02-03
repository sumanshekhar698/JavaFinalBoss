package dev.codecounty.oops.abstraction.interfaces;

import dev.codecounty.oops.abstraction.AccountType;
import dev.codecounty.oops.abstraction.BankAccount;
import dev.codecounty.oops.abstraction.BankAccountAbs;
import dev.codecounty.oops.abstraction.BankAccountAbsImpl;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        //Interfaces
        BankInterface bankInterface = new BankInterfaceImpl("Suman", 1000, 564552L,
                "HDFC78", AccountType.SAVINGS);


        BankInterface ac4 = new BankInterface() {//Anonymous Inner Type

            @Override
            public void deposit(long... amounts) {

                System.out.println("depositing :" + Arrays.toString(amounts));
            }

            @Override
            public void withdraw(long amount) {
                System.out.println("Withdrawing :" + amount);


            }
        };
        ac4.withdraw(1000);
        ac4.deposit(1000, 2000);

        ComplexCaseImpl c1 = new ComplexCaseImpl();
        c1.ring();
        c1.ring1();
//        ComplexCase.call1();


    }
}
