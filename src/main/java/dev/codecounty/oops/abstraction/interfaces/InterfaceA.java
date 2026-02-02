package dev.codecounty.oops.abstraction.interfaces;

interface InterfaceA {
    default void sayHello() {
        System.out.println("Hello from A");
    }
}

interface InterfaceB {
    default void sayHello() {
        System.out.println("Hello from B");
    }
}

// This class will fail to compile unless we resolve the conflict
class MyClass implements InterfaceA, InterfaceB {

    @Override
    public void sayHello() {
        // Option 1: Provide a brand new implementation
        System.out.println("Hello from MyClass");

        // Option 2: Explicitly call one of the interface methods
        // Syntax: InterfaceName.super.methodName();
        InterfaceA.super.sayHello();
    }
}