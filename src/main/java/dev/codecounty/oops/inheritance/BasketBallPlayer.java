package dev.codecounty.oops.inheritance;

public class BasketBallPlayer extends Player {

    int jerseyNumber;
    boolean isCaptain;
    int points;
    double height;


    public BasketBallPlayer(String name, int age, int experience, int matchPlayed, Gender gender, double height,
                            int points, boolean isCaptain, int jerseyNumber) {
        super(name, age, experience, matchPlayed, gender);
        this.height = height;
        this.points = points;
        this.isCaptain = isCaptain;
        this.jerseyNumber = jerseyNumber;
    }

    void average() {
        System.out.println("Average : " + (points / matchPlayed));
    }

    @Override
    public String toString() {
        return "BasketBallPlayer{" +
                "jerseyNumber=" + jerseyNumber +
                ", isCaptain=" + isCaptain +
                ", points=" + points +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", matchPlayed=" + matchPlayed +
                ", gender=" + gender +
                '}';
    }
}
