package dev.codecounty.oops.inheritance;

public class Player {
    String name;
    int age;
    int experience;
    int matchPlayed;
    Gender gender;
    private long payment = 1000000000L;

    public Player(String name, int age, int experience, int matchPlayed, Gender gender) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.matchPlayed = matchPlayed;
        this.gender = gender;
    }

    public String info() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", matchPlayed=" + matchPlayed +
                ", gender=" + gender +
                ", payment=" + payment +
                '}';
    }
}
