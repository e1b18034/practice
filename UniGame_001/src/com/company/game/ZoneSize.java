package com.company.game;

public interface ZoneSize {
    int BATTLE_ZONE_SIZE = 2;
    int INIT_HAND_SIZE = 3;

    default int getBattleZoneSize(){
        return BATTLE_ZONE_SIZE;
    }

    default int getInitHandSize() {
        return INIT_HAND_SIZE;
    }
}
