package dev.codecounty.oops.inheritance;

class Animal {

    boolean isExtinct;

    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Bird extends Animal {
    int wingSpan;

    void fly() {
        System.out.println("The bird is flying high!");
    }
}

public class TypeCasting {
    public static void main(String[] args) {
//        Animal myAnimal = new Bird(); // Upcasting (Always safe) ans i IMPLICIT
        Bird b1 = new Bird();
        b1.eat();
        b1.fly();
        System.out.println(b1.wingSpan);
        System.out.println(b1.isExtinct);

        // Upcasting (Always safe)
        Animal a2 = b1;//while upcasting, a2 will lose access to Bird specific properties and methods
//        System.out.println(a2.wingSpan);
        a2.eat();
        System.out.println(a2.isExtinct);

        Animal a3 = new Bird(); // Upcasting

// Downcasting is EXPLICIT and is tricky and should be handled with care
        Animal a4 = new Animal();
//        Bird b2 = (Bird) a4;

//         1. Check if a3 is actually a Bird
        if (a4 instanceof Bird) {

            // 2. Safely Typecast Animal to Bird
            Bird myBird = (Bird) a4;

            // 3. Now we can use Bird-specific methods
            myBird.fly();
            myBird.eat();
        } else {
            System.out.println("This animal cannot fly. Downcasting failed.");
        }


        Animal a5 = new Bird();
        if (a5 instanceof Bird b) {
            b.fly();
            b.eat();
        }
    }

}

