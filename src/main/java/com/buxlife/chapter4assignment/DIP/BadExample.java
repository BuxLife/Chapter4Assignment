package com.buxlife.chapter4assignment.DIP;

//Dependency Inversion Principle - Bad Example (Violation)
//DIP Requires that we add an abstraction Layer.

class BadApprentice{
    public void learn(){
        System.out.println("Learning slowly.");
    }
}

class BadMaster{
    BadApprentice apprentice;

    public void setWorker(BadApprentice apprentice) {
        this.apprentice = apprentice;
    }

    public BadApprentice getWorker() {
        return apprentice;
    }

    public void teach()
    {
        apprentice.learn();
    }
}

class BadDesciple{
    public void learn(){
        System.out.println("Learning at a greater pace.");
    }
}



