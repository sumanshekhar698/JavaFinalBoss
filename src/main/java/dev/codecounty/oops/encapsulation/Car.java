package dev.codecounty.oops.encapsulation;

public class Car {

//    final variables should be either initialized directly or in the constructor
//    final private String name = "Hilux";
    final private String name;

    private String noPlate;
    private float mielage;


    public Car(String name, float mielage, String noPlate) {
        this.name = name;
        this.mielage = mielage;
        this.noPlate = noPlate;
    }

    public String getName() {
        return name;
    }

    public String getNoPlate() {
        return noPlate;
    }

    public float getMielage() {
        return mielage;
    }

    public void setNoPlate(String noPlate) {
        this.noPlate = noPlate;
    }

    public void setMielage(float mielage) {
        this.mielage = mielage;
    }
}
