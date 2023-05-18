package com.codurance.katalyst;

import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator {

    @Override
    public Number execute() {
        return Number.create(new Random().nextInt(100));
    }
    
}
