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
        boolean won = false;
        Number numberToFind = this.generator.execute();
        while(step < MAX_STEPS && !won){
            Number chosenNumber = Number.create(this.screen.readNumber());
            ComparisonResultBetweenNumbers result = numberToFind.compareTo(chosenNumber);
            this.screen.show(result);
            if(ComparisonResultBetweenNumbers.EQUALS.equals(result)){
                won = true;
            }
            step++;
        }
        if(won){
            this.screen.show(GameStates.WON);
        }else{
            this.screen.show(GameStates.LOSE);
        }
    }
}
