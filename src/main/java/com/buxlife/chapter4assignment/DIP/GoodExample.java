package com.buxlife.chapter4assignment.DIP;

interface Pupil{
    public void learn();
}
class Apprentice implements Pupil{
    public void learn(){
        System.out.println("The Apprentice learns slowly");
    }
}
class Desciple implements Pupil{
    public void learn() {
        System.out.println("The Desciple learns quickly");
    }
}
class Master{
    Pupil pupil;

    public void setPupil(Pupil pupil) {
        this.pupil = pupil;
    }

    public void teach(){
        pupil.learn();
    }
}

class TestDIP{

    public static void main(String[]args)
    {
        Pupil apprentice = new Apprentice();
        Pupil desciple = new Desciple();

        Master sensei = new Master();
        sensei.setPupil(apprentice);
        sensei.teach();
        sensei.setPupil(desciple);
        sensei.teach();
    }
}