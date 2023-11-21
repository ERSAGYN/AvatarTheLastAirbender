package org.example.bendings;

public class Earthbending implements IBending {
    double earthPower;
    @Override
    public double getBendingPower() {
        return earthPower;
    }

    @Override
    public void setBendingPower(double bendingPower) {
        this.earthPower = bendingPower;
    }

    @Override
    public String getBendingName() {
        return "earth";
    }
}
