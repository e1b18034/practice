package com.company.game;

import com.company.card.Card;

import java.util.ArrayList;

public class Battle extends Zone{
    private ArrayList<Card> battleZone;

    public Battle(){
        battleZone = new ArrayList<Card>(BATTLE_ZONE_SIZE);
    }

    @Override
    public void addCard(Card card) {
        this.battleZone.add(card);
    }

    @Override
    public void removeCard(Card card) {
        this.battleZone.remove(card);
    }

    @Override
    public void removeCard(int index) {
        try {
            this.battleZone.remove(index);
        }catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getZoneSize() {
        return this.battleZone.size();
    }

    @Override
    public Card getCard(int index) {
        Card card = null;

        try {
            card = this.battleZone.get(index);
        }catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        return card;
    }
}
