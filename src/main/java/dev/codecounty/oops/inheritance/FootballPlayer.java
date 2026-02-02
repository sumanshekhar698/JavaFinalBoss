package dev.codecounty.oops.inheritance;

public class FootballPlayer {
    String name;
    int age;
    int experience;
    int matchPlayed;
    Gender gender;
    int jerseyNumber;
    int goal;
    boolean isCaptain;


    void average() {
        System.out.println("Average : " + (goal / matchPlayed));
    }

    public FootballPlayer(String name, int age, int experience, int matchPlayed, Gender gender, int jerseyNumber,
                          int goal, boolean isCaptain) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.matchPlayed = matchPlayed;
        this.gender = gender;
        this.jerseyNumber = jerseyNumber;
        this.goal = goal;
        this.isCaptain = isCaptain;
    }

    public FootballPlayer() {

    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", matchPlayed=" + matchPlayed +
                ", gender=" + gender +
                ", jerseyNumber=" + jerseyNumber +
                ", goal=" + goal +
                ", isCaptain=" + isCaptain +
                '}';
    }
}
