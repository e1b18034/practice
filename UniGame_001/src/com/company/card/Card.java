package com.company.card;

public abstract class Card {
    private int cardId;
    private String cardName;
    private byte cost;
    private byte secondCost;
    private byte thirdCost;

    public Card(int cardId, String cardName, byte cost, byte secondCost, byte thirdCost) {
        this.cardId = cardId;
        this.cardName = cardName;
        this.cost = cost;
        this.secondCost = secondCost;
        this.thirdCost = thirdCost;
    }

    public final int getCardId() {
        return cardId;
    }

    public final String getCardName() {
        return cardName;
    }

    public final byte getCost() {
        return cost;
    }

    public final byte getSecondCost() {
        return secondCost;
    }

    public final byte getThirdCost() {
        return thirdCost;
    }

    public abstract CardTypeCombie getCardTypeCombie();
}
