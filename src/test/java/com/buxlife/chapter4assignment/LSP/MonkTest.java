package com.buxlife.chapter4assignment.LSP;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Bux_Life on 2017/03/31.
 */
public class MonkTest {

    @Test
    public void letTheGamesBegin() throws Exception
    {
        try {
            ArrayList<Monk> monks = new ArrayList<Monk>();
            monks.add(new BattleMonk());
            monks.add(new SpiritualMonk());
            for (Monk monk : monks) {
                monk.meditate();
                monk.battle("Die!!!!!");
            }
        }
        catch(Exception e){
            System.out.println("Spiritual Monk cannot use the attack function. This VIOLATES LSP");
        }
    }

}