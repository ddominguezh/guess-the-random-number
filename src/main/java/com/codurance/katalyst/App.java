package com.codurance.katalyst;

public class App {
    
    public static void main(String[] args) {
        GuessingNumberGame game = new GuessingNumberGame(new ConsoleScreen(), new RandomNumberGenerator());
        game.play();
    }

}
