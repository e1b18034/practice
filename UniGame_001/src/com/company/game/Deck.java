package com.company.game;

import com.company.card.Card;
import com.company.other.GetRandom;

import java.util.ArrayList;

public class Deck extends Zone {
    private ArrayList<Card> deckStack;

    public Deck(){
        this(null);     // TODO デッキを生成(或いは取得)し代入
    }

    public Deck(ArrayList<Card> deckStack) {
        this.deckStack = deckStack;
    }

    @Override
    public void addCard(Card card) {
        this.deckStack.add(card);
    }

    @Override
    public void removeCard(int index) {
        try {
            this.deckStack.remove(index);
        }catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeCard(Card card) {
        this.deckStack.remove(card);
    }

    @Override
    public Card getCard(int index) {
        Card card = null;

        try{
            card = this.deckStack.get(index);
        }catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        return card;
    }

    @Override
    public int getZoneSize() {
        return this.deckStack.size();
    }

    // デッキシャッフル
    public void shuffleDeck() {
        GetRandom gr = new GetRandom();
        int deckSize = deckStack.size();
        int[] cardPermutation = new int[deckSize];
        // カードの新規位置決定
        for(int i = 0; i < deckSize; i++) {
            int index = gr.getRandom(0, deckSize);
            for(int j = 0; j < deckSize; j++) {
                if(index == cardPermutation[j]) {
                    index = (index + 1) % deckSize;
                    j = -1;
                }
            }
            cardPermutation[i] = index;
        }

        // カードの並べ替え
        ArrayList<Card> newDeck = new ArrayList<>();
        for(int index : cardPermutation) {
            newDeck.add(deckStack.get(index));
        }

        // 更新
        deckStack = newDeck;
    }
}
