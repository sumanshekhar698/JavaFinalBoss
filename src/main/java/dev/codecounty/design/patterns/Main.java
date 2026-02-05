package dev.codecounty.design.patterns;

public class Main {

    public static void main() {

/*        PrimeMinister pm1 = new PrimeMinister("Mr Modi", 68);
        System.out.println(pm1);
        System.out.println(pm1.hashCode());


        PrimeMinister pm2 = new PrimeMinister("Mr Rahul", 50);
        System.out.println(pm2);
        System.out.println(pm2.hashCode());*/

        PrimeMinister pm1 = PrimeMinister.declarePM("Mr Modi", 68);
        System.out.println(pm1);
        System.out.println(pm1.hashCode());


        PrimeMinister pm2 = PrimeMinister.declarePM("Mr Rahul", 50);
        System.out.println(pm2);
        System.out.println(pm2.hashCode());


    }
}
