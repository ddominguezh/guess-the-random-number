package com.codurance.katalyst;

public class GuessingNumberGame {
    
    private static final int MAX_STEPS = 3;
    private Screen screen;
    private NumberGenerator generator;
    public GuessingNumberGame(Screen screen, NumberGenerator generator){
        this.screen = screen;
        this.generator = generator;
    }
    public void play() {
        this.screen.show(GameStates.START);
        int step = 0;
        Number numberToFind = this.generator.execute();
        GameStates state = GameStates.LOSE;
        do {
            Number chosenNumber = Number.create(this.screen.readNumber());
            ComparisonResultBetweenNumbers result = numberToFind.compareTo(chosenNumber);
            this.screen.show(result);
            if(ComparisonResultBetweenNumbers.EQUALS.equals(result)){
                state = GameStates.WON;
            }
            step++;
        } while(step < MAX_STEPS && GameStates.LOSE.equals(state));
        this.screen.show(state);
    }
}
