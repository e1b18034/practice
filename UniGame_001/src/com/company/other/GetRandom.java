package com.company.other;

import java.util.Random;

public class GetRandom {
    private Random random;

    public GetRandom() {
        this(System.currentTimeMillis());
    }

    public GetRandom(long randomSeed) {
        random = new Random(randomSeed);
    }

    public int getRandom(int min, int max) {
        max -= min - 1;
        return random.nextInt(max) + min;
    }

    public double getRandom() {
        return random.nextDouble();
    }
}
