package dev.codecounty.oops.inheritance;

public class MultiLevelInheritance {

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.x);
        c.display();
        c.show();
    }
}

class A {
    int x = 9;
    private int y = 20;

    void show() {
        System.out.println(x);
    }
}


class B extends A {
    int x = 10;

    @Override
    void show() {
        System.out.println(x);
    }
}

class C extends B {
    int x = 11;

    void display() {
        System.out.println(x);
        System.out.println(super.x);//super can be used to access the IMMEDIATE parent clas members
        System.out.println(this.x);
//        System.out.println(super.super.x );//ILLEGAL
    }
}
