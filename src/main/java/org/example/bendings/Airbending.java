package org.example.bendings;

public class Airbending implements IBending {
    double airPower;
    @Override
    public double getBendingPower() {
        return airPower;
    }

    @Override
    public void setBendingPower(double bendingPower) {
        this.airPower = bendingPower;
    }

    @Override
    public String getBendingName() {
        return "air";
    }
}
