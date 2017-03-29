package com.buxlife.chapter4assignment;

public class Player{

    private int id;
    private String gamerTag;
    private String email;
    private boolean premiumStatus;

    public Player(String firstName, String lastName, String gender, int age, int id, String gamertag, boolean premiumStatus){

        Person newPlayer = new Person(firstName, lastName, gender, age);
        this.id = id;
        this.gamerTag = gamertag;
        this.premiumStatus = premiumStatus;

    }


    public void setId(int id) {
        this.id = id;
    }

    public void setGamertag(String gamertag) {
        this.gamerTag = gamertag;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPremiumStatus(boolean premiumStatus) {
        this.premiumStatus = premiumStatus;
    }

    public boolean isPremiumStatus() {
        return premiumStatus;
    }

    public int getId() {
        return id;
    }

    public String getGamertag() {
        return gamerTag;
    }

    public String getEmail() {
        return email;
    }
}