package dev.codecounty.oops.inheritance;

public class IPLPlayer {
    String name;
    int age;
    int runs;
    int experience;
    int matchPlayed;
    Gender gender;
    int jerseyNumber;
    boolean isAllRounder;
    boolean isCaptain;

    public IPLPlayer(String name, int age, int runs, int experience, int matchPlayed, Gender gender,
                     int jerseyNumber, boolean isAllRounder, boolean isCaptain) {
        this.name = name;
        this.age = age;
        this.runs = runs;
        this.experience = experience;
        this.matchPlayed = matchPlayed;
        this.gender = gender;
        this.jerseyNumber = jerseyNumber;
        this.isAllRounder = isAllRounder;
        this.isCaptain = isCaptain;
    }

    void average() {
        System.out.println("Average : " + (runs / matchPlayed));
    }


    public String info() {
        return "IPLPlayer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", runs=" + runs +
                ", experience=" + experience +
                ", matchPlayed=" + matchPlayed +
                ", gender=" + gender +
                ", jerseyNumber=" + jerseyNumber +
                ", isAllRounder=" + isAllRounder +
                ", isCaptain=" + isCaptain +
                '}';
    }
}
