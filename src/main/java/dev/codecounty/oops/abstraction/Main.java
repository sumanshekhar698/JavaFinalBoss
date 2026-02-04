package dev.codecounty.oops.abstraction;

import dev.codecounty.oops.abstraction.interfaces.BankInterface;
import dev.codecounty.oops.abstraction.interfaces.BankInterfaceImpl;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String tr = "sumaan  ";
        tr.trim();

        BankAccount ac1 = new BankAccount("Suman", "HDFC78",
                985652L, AccountType.SAVINGS);

        System.out.println(ac1);
        ac1.deposit(32, 3, 2323, 2, -9);
        System.out.println(ac1);

        ac1.withdraw(400);
        System.out.println(ac1);


//        BankAccountAbs ac2 = new BankAccountAbs("Suman", "HDFC78",
//                985652L, AccountType.SAVINGS);


        BankAccountAbs ac2 = new BankAccountAbsImpl("Suman", "HDFC78",
                985652L, AccountType.SAVINGS);

        // Anonymous Inner Type
        BankAccountAbs ac3 = new BankAccountAbs("Suman", "HDFC78",
                985652L, AccountType.SAVINGS) {

            @Override
            void deposit(long... amounts) {//TODO

            }

            @Override
            void withdraw(long amount) {//TODO

            }
        };

        //Interfaces
        BankInterface bankInterface = new BankInterfaceImpl("Suman", 1000, 564552L,
                "HDFC78", AccountType.SAVINGS);


        BankInterface ac4 = new BankInterface() {//Annonymous Inner Type

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


    }
}
