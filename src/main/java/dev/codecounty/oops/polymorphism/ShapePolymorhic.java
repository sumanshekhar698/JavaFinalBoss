package dev.codecounty.oops.polymorphism;

public class ShapePolymorhic {

//    1. Mo of paramters

    int area(int side) {
        return side * side;
    }

    int area(int len, int breadth) {
        return len * breadth;
    }

    float area(int height, float base) {
        return 0.5f * height * base;
    }

    double area(float radius) {
//        return 3.14159f * radius * radius;
        return Math.PI * radius * radius;
    }

    float area(float base, int height) {
        return base * height;
    }
}