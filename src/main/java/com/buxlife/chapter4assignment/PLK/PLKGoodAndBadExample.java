package com.buxlife.chapter4assignment.PLK;
//An example of the Principle of Least Knowledge AKA The Demeter Law

class Artist{
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}