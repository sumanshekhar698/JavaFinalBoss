package dev.codecounty.oops.abstraction;

public class Main {

    public static void main(String[] args) {

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


        BankAccountAbs ac3 =  new BankAccountAbs("Suman", "HDFC78",
                985652L, AccountType.SAVINGS){

            @Override
            void deposit(long... amounts) {//TODO

            }

            @Override
            void withdraw(long amount) {//TODO

            }
        };


    }
}
