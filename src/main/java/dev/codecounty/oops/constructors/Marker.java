package dev.codecounty.oops.constructors;

public class Marker {

    //instance var is initialized while object creation with the default value of the type
    int price;//0
    String color;//null
    String brand;//null


    /*
     * - No Return Type
     * - Name should Exactly match class Name
     * - It will be only triggered once automatically while object creation
     * - You cannot trigger the fn yourself
     * - It's used for initializing things
     * - JVM will create a default constructor in the RUNTIME only and only if you haven't declared your own constructors
     * - this points to the current Object
     * - this can be used for constructor Chaining
     *      # While doing chaining make sure it's the 1st statement
     *      # Avoid Cyclic Chaining ele it will not compile
     * - this holds the address of the current Object
     *  */


    Marker() {//Non Parametrized Constructor
//        this(4,"BOOM");//Avoid Cyclic Recursive Constructor call
        System.out.println("Marker() called");
    }

    Marker(int price, String color) {//Non Parametrized Constructor
        this();
        System.out.println("Marker(int price, String color) ");
        this.price = price;
        this.color = color;
    }

    Marker(int price, String color, String brand) {
        this(price, color);
        System.out.println("Marker(int price, String color, String brand) called");

        // Shadow Problem
        this.price = price;
        this.color = color;
        this.brand = brand;
        System.out.println(this);
    }

    void write() {
        System.out.println("Writing with a " + color + " ink");
    }

    void throwing() {
        System.out.println("Throwing the marker");
    }

    Marker returnMe() {
        return this;
    }


}