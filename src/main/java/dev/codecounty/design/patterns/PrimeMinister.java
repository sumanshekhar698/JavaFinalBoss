package dev.codecounty.design.patterns;

public class PrimeMinister {

    String name;
    int age;
    //    2. Declare a static private variable of the same class
    private static PrimeMinister pm;

    //1. Make the constructor private
    private PrimeMinister(String name, int age) {
//    public PrimeMinister(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    3. Make a static fn that will create an object for you
    static PrimeMinister declarePM(String name, int age) {
        if (pm == null) {
            pm = new PrimeMinister(name, age);
        }

        return pm;

    }


    @Override
    public String toString() {
        return "PrimeMinister{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
