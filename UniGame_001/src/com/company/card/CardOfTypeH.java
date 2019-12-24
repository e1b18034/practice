package com.company.card;

public class CardOfTypeH extends Card {
    private static final CardTypeCombie cardTypeCombie = CardTypeCombie.CARD_OF_HP;
    private int hp;

    public CardOfTypeH(int cardId, String cardName, byte cost, byte secondCost, byte thirdCost) {
        super(cardId, cardName, cost, secondCost, thirdCost);
        hp = cost;
    }

    @Override
    public CardTypeCombie getCardTypeCombie() {
        return cardTypeCombie;
    }

    public int getHp() {
        return hp;
    }
}
