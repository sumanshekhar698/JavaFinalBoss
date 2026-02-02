package dev.codecounty.oops.inheritance;

public class MethodOverriding extends Object {


    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.run();
        tiger.name = "Royal Bengal";
        tiger.age = 5;
        System.out.println(tiger);

    }


}

class Beast {
    String name;

    void run() {
        System.out.println("Beast is running");
    }

}

class Tiger extends Beast {

    int age;

    @Override
    void run() {//run is overridden
        System.out.println("Tiger is running");
    }

    void eat() {
        System.out.println("Tiger is eating");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
