package dev.codecounty.oops.abstraction.interfaces;

public class Main2 {

    public static void main() {


        // 1
        LokSabhaImpl l1 = new LokSabhaImpl();
        l1.elect(5);
        l1.locationOfLokSabha();

        // 2
        Loksabha l2 = new Loksabha() {

            @Override
            public void elect(int candidate) {
                System.out.println("Election is near");
            }
        };

        l2.elect(8);
        l2.locationOfLokSabha();

        Loksabha l3 = (candidate) -> {
            System.out.println("Election is live");
        };
        l3.locationOfLokSabha();
        l3.elect(8);




    }
}
