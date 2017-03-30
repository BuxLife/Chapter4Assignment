package com.buxlife.chapter4assignment;

class Duty{

    private String position, description;
    private double bonus = 0;
    private boolean leader;

    public Duty(String pos, String description, double bonus, boolean leader ){
        this.position = pos;
        this.description = description;
        this.bonus = bonus;
        this.leader = leader;
    }

    public boolean isLeader() {
        return leader;
    }

    public void setLeader(boolean leader) {
        this.leader = leader;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getPosition() {
        return position;
    }

    public String getDescription() {
        return description;
    }

    public double getBonus() {
        return bonus;
    }

}