package dev.codecounty.basics;

public class Test3 {

    static void main() {
        String str = "Hey  ";
        str.trim();
        System.out.println(str);
    }


    static void call() {
        System.out.println("Calling");
    }

}

class Parvez {

    int x = 10;

    int y = 8;

    // 9,11
    void print(int x, int y) {
        System.out.println(x + y);
        System.out.println(this.x + this.y);
    }
}