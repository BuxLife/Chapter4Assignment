package com.buxlife.chapter4assignment.LSP;

import java.util.ArrayList;

public class DemoLSP{
    public static void main(String[] args) {
        /*This code just demonstrates the violated LSP
        ArrayList<Monk> monkList = new ArrayList<Monk>();
        monkList.add(new BattleMonk());
        monkList.add(new SpiritualMonk());
        letTheGamesBegin(monkList);
        */

        //Valid LSP
        RealBattleMonk war = new RealBattleMonk();
        RealSpiritualMonk peace = new RealSpiritualMonk();

        war.meditate();
        war.battle("Time for Battle");
        peace.meditate();
        peace.cease();


    }

    public static void letTheGamesBegin(ArrayList<Monk> monks)
    {
        for (Monk monk : monks){
            monk.meditate();
            monk.battle("Die!!!!!");
        }
    }
}

