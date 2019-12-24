package com.company.card;

public class CardOfTypeA extends Card{
    private static final CardTypeCombie cardTypeCombie = CardTypeCombie.CARD_OF_AP;
    private int power;

    public CardOfTypeA(int cardId, String cardName, byte cost, byte secondCost, byte thirdCost) {
        super(cardId, cardName, cost, secondCost, thirdCost);
        power = cost;
    }

    @Override
    public CardTypeCombie getCardTypeCombie() {
        return cardTypeCombie;
    }

    public int getPower() {
        return power;
    }
}
