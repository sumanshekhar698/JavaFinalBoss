package dev.codecounty.oops.inheritance;

/*
*
*
* final: The hierarchy ends here. No one can extend this child.

sealed: This child is also restricted and must provide its own permits list.

non-sealed: This child "breaks" the seal. Anyone can extend this class (it reverts to standard Java behavior).
*
* */


// The parent class defines its allowed children
public sealed class Shape permits Circle, Square, Rectangle, Polygon {
    // Shared logic here
}

// Children must be 'final', 'sealed', or 'non-sealed'
final class Circle extends Shape {
    double radius;
}

final class Square extends Shape {
    double side;
}

non-sealed class Rectangle extends Shape {// non-sealed breaks the seal
    double length, width;
}

sealed class Polygon extends Shape permits Triangle, Hexagon {
    int sides;
}

non-sealed class Triangle extends Polygon {
    double base, height;
}

final class Hexagon extends Polygon {
    double side;
}