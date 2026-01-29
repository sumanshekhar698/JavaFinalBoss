package dev.codecounty.oops.polymorphism;

public class Shape {

    int square(int side) {
        return side * side;
    }

    int rectangle(int len, int breadth) {
        return len * breadth;
    }

    float triangle(int height, float base) {
        return 0.5f * height * base;
    }

    double circle(float radius) {
//        return 3.14159f * radius * radius;
        return Math.PI * radius * radius;
    }

    float parallelogram(float base, int height) {
        return base * height;
    }
}