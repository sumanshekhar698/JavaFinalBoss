package dev.codecounty.oops.abstraction.interfaces;

public class LokSabhaImpl implements Loksabha {

    @Override
    public void elect(int candidate) {
        System.out.println("Election is coming for candidates: " + candidate);
    }
}
