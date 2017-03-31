package com.buxlife.chapter4assignment.LSP;

import javax.sound.midi.SysexMessage;

public class RealBattleMonk extends RealMonk {
    @Override
    public void meditate() {
        System.out.println("War");
    }

    public void battle(String attack){  System.out.println(attack);}
}