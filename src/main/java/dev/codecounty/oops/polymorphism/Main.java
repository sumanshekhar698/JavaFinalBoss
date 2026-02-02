package dev.codecounty.oops.polymorphism;

public class Main {


    public static void main(String args) {//We can have many main method because of polymorphic
        // but only one psvm with String args will execute;

        System.out.println("Main 2 << ");
    }


    public static void main(String[] args) {
        System.out.println("Main 2 << ");
        Shape shape = new Shape();
        System.out.println(shape.parallelogram(0.5f, 8));
        System.out.println(shape.circle(10.0f));
        System.out.println(shape.square(8));
        System.out.println(shape.triangle(9, 0.5f));

        System.out.println();
        ShapePolymorhic shapePolymorhic = new ShapePolymorhic();
        System.out.println(shapePolymorhic.area(0.5f, 8));
        System.out.println(shapePolymorhic.area(10.0f));
        System.out.println(shapePolymorhic.area(8));
        System.out.println(shapePolymorhic.area(9, 0.5f));
    }
}