package com.codurance.katalyst;

public class RandomNumberGenerator implements NumberGenerator {

    @Override
    public Number execute() {
        return Number.create(1);
    }
    
}
