package com.buxlife.chapter4assignment.LSP;
//This Code Violates LSP

public class Monk {

    public void meditate(){System.out.println("Meditation or Lazy?");}
    public void battle(String attack){  System.out.println(attack);}


}

class SpiritualMonk extends Monk{
    @Override
    public void meditate() {
        super.meditate();
    }

    public void battle(String attack) {
        throw new UnsupportedOperationException();      //This monk does not support the battle operation
    }
}
class BattleMonk extends Monk{
    @Override
    public void meditate() {
        super.meditate();
    }

    public void battle(String attack) {
        super.battle(attack);
    }
}
