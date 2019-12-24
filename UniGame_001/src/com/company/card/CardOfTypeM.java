package com.company.card;

public class CardOfTypeM extends Card {
    private static final CardTypeCombie cardTypeCombie = CardTypeCombie.CARD_OF_MP;
    private int mp;

    public CardOfTypeM(int cardId, String cardName, byte cost, byte secondCost, byte thirdCost) {
        super(cardId, cardName, cost, secondCost, thirdCost);
        mp = cost;
    }

    @Override
    public CardTypeCombie getCardTypeCombie() {
        return cardTypeCombie;
    }

    public int getMp() {
        return mp;
    }
}
