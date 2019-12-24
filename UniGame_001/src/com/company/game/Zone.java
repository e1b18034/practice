package com.company.game;

import com.company.card.Card;

public abstract class Zone implements ZoneSize {
    // TODO サブクラスで必ず実装する
    public abstract void addCard(Card card);
    public abstract void removeCard(Card card);
    public abstract void removeCard(int index);
    public abstract Card getCard(int index);
    public abstract int getZoneSize();

    /*
    // 召喚
    public void callToBattleZone(Card card) {
        for(int i = 0; i < 2; i++) {
            if(battleZone[i].equals(null)) {
                battleZone[i] = card;
                break;
            }
        }
        handZone.remove(card);
    }
    
    // 魔力カード追加
    public void addMagicPoint(Card card) {
        this.magicPointZone.add(card);
    }
    
    // 魔力消費
    public void consumeMagicPoint(int point) {
        for(int i = 0; i < point; i++) {
            consumedZone.add(magicPointZone.get(magicPointZone.size() - 1));
            magicPointZone.remove(magicPointZone.size() - 1);
        }
    }
    
    
    // 消費魔力ゾーン追加
    public void addConsumed(Card card) {
        this.consumedZone.add(card);
    }
    */

}
