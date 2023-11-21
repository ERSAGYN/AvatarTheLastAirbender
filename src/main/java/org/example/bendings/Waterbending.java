package org.example.bendings;

public class Waterbending implements IBending {

    double waterPower;

    @Override
    public double getBendingPower() {
        return waterPower;
    }

    @Override
    public void setBendingPower(double bendingPower) {
        this.waterPower = bendingPower;
    }

    @Override
    public String getBendingName() {
        return "water";
    }
}
