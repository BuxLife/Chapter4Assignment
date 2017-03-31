package com.buxlife.chapter4assignment.PLK;
//An example of the Principle of Least Knowledge AKA The Demeter Law


//Generic Classes
class Artist{
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Musician getMusician(Musician m){
        return m;
    }
}
class Musician{
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class Production{

    private Artist artist       = new Artist();
    private Musician musician   =  new Musician();

    public String getProductionDetails(){

        String details = "";
        String artistName =     "Artist:     " + artist.getName();
        String musicianName =   "Musician:   " + musician.getName();
        details = artistName + musicianName;
        return details;
    }


}

class DemoPLK{


    public static void main(String[]args)
    {
        Artist artist       = new Artist();
        Musician musician   =  new Musician();

        //THE BELOW STATEMENT VIOLATES THE PRINCIPLE

        //DO NOT MAKE CHAIN STATEMENTS
        String musicianName = artist.getMusician(musician).getName();

        //The Correct way
        artist.getName();
        musician.getName();

    }


}
