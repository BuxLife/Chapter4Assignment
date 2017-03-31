package com.buxlife.chapter4assignment.ISP;

//Bad Example - ISP Principle
interface BadArtist{
        public void rest();
        public void party();
        public void performArt();


}

class BadPainter implements BadArtist{
    public void rest(){
        System.out.println("Lazy");
    }
    public void party(){
        System.out.println("Fun");
    }
    public void performArt(){
        System.out.println("Work Work Work");
    }
}
class BadActor implements BadArtist{
    public void rest(){
        System.out.println("Sleep");
    }
    public void party(){
        System.out.println("Lots of fun");
    }
    public void performArt(){
        System.out.println("Act.. or try to");
    }
}
class BadManager{
    BadArtist artist;

    public void setArtist(BadArtist artist){
        this.artist = artist;
    }

    public void manage(){
        artist.performArt();
        artist.rest();
        artist.party();
        artist.performArt();
    }
}






