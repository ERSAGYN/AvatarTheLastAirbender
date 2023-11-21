package org.example.bendings;

public class Firebending implements IBending{

    double firePower;
    @Override
    public double getBendingPower() {
        return firePower;
    }

    @Override
    public void setBendingPower(double bendingPower) {
        this.firePower = bendingPower;
    }

    @Override
    public String getBendingName() {
        return "fire";
    }
}
