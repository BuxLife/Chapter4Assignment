package com.buxlife.chapter4assignment.ISP;

//Good Example of Interface Segregation Principle (ISP)
interface ArtPerformance {
    public void performArt();
}
interface BreakTime{
    public void takeBreak();
}

class Artist implements ArtPerformance, BreakTime{
    public void performArt() {
        System.out.println("Artist paints a picture");
    }

    public void takeBreak() {
        System.out.println("Artist admires Art");
    }
}
class Musician implements ArtPerformance, BreakTime{
    public void performArt() {
        System.out.println("Musician sings");
    }

    public void takeBreak() {
        System.out.println("Musician listens to music");
    }
}
class Actor implements ArtPerformance, BreakTime{
    public void performArt() {
        System.out.println("Actor acts");
    }

    public void takeBreak() {
        System.out.println("Actor watches TV");
    }
}


class DemoISP{

    public static void main(String[]args)
    {
        Actor actor = new Actor();
        Artist artist = new Artist();
        Musician musician = new Musician();

        actor.performArt();
        actor.takeBreak();

        artist.performArt();
        artist.takeBreak();

        musician.performArt();
        musician.takeBreak();
    }

}