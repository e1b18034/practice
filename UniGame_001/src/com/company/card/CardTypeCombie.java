package com.company.card;

public enum CardTypeCombie {
    CARD_OF_AP(CardType.AP, null),
    CARD_OF_HP(CardType.HP, null),
    CARD_OF_MP(CardType.MP, null),
    CARD_OF_APHP(CardType.AP, CardType.HP),
    CARD_OF_APMP(CardType.AP, CardType.MP),
    CARD_OF_MPHP(CardType.MP, CardType.HP);

    private CardType cardType1;
    private CardType cardType2;

    private CardTypeCombie(CardType cardType1, CardType cardType2) {
        this.cardType1 = cardType1;
        this.cardType2 = cardType2;
    }
}
