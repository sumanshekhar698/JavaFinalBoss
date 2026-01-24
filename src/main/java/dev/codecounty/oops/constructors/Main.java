package dev.codecounty.oops.constructors;

public class Main {


    public static void main(String[] args) {

        Marker m1 = new Marker();
        Marker m2 = new Marker();
        System.out.println(m1.brand);
        System.out.println(m1.color);
        System.out.println(m1.price);

        m1.brand = "Luxar";
        m1.color = "Black";
        m1.price = 30;


        System.out.println(m1.brand);
        System.out.println(m1.color);
        System.out.println(m1.price);


        System.out.println(m2.brand);
        System.out.println(m2.color);
        System.out.println(m2.price);

        Marker m3 = m2;
        System.out.println(m3.color);

        m2.color = "RED";
        System.out.println(m3.color);

//        System.out.println(m3);
        m3.write();
        m3.throwing();
//        System.out.println(m3.hashCode());

        m1 = null;
//        Marker m4;

//        System.gc();

        m3 = null;


    }
}