package com.codurance.katalyst;

public class GuessingNumberGame {
    
    private Screen screen;
    private NumberGenerator generator;
    public GuessingNumberGame(Screen screen, NumberGenerator generator){
        this.screen = screen;
        this.generator = generator;
    }
    public void play() {
        this.screen.start();
        this.screen.readNumber();
        this.screen.won();
    }
}
