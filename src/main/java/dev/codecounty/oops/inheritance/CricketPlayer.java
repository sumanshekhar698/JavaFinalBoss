package dev.codecounty.oops.inheritance;

public class CricketPlayer extends Player{

    int runs;
    int jerseyNumber;
    boolean isAllRounder;
    boolean isCaptain;

    public CricketPlayer(String name, int age, int experience, int matchPlayed, Gender gender, int runs,
                         int jerseyNumber, boolean isAllRounder, boolean isCaptain) {
        super(name, age, experience, matchPlayed, gender);
        this.runs = runs;
        this.jerseyNumber = jerseyNumber;
        this.isAllRounder = isAllRounder;
        this.isCaptain = isCaptain;
    }

    void average() {
        System.out.println("Average : " + (runs / matchPlayed));
    }


    @Override
    public String toString() {
        return "CricketPlayer{" +
                "runs=" + runs +
                ", jerseyNumber=" + jerseyNumber +
                ", isAllRounder=" + isAllRounder +
                ", isCaptain=" + isCaptain +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", matchPlayed=" + matchPlayed +
                ", gender=" + gender +
                '}';
    }
}
