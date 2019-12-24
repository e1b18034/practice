package com.company.game;

import com.company.card.Card;

import java.util.ArrayList;

public class HandCard extends Zone {
    private ArrayList<Card> handCards;

    public HandCard(Zone deck) {
        for(int i = 1; i <= 3; i++) {
            try {
                handCards.add(deck.getCard(0));
                // getメソッドに対する例外処理
            }catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    @Override
    public void addCard(Card card) {
        this.handCards.add(card);
    }

    @Override
    public void removeCard(Card card) {
        this.handCards.remove(card);
    }

    @Override
    public void removeCard(int index) {
        try {
            this.handCards.remove(index);
        }catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Card getCard(int index) {
        Card card = null;
        try {
            card = this.handCards.get(index);
        }catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        return card;
    }

    @Override
    public int getZoneSize() {
        return this.handCards.size();
    }

    // ドロー
    public void draw(Zone deck) {
        handCards.add(deck.getCard(deck.getZoneSize() - 1));
    }
}
