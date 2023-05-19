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
        this.screen.start();
        int step = 0;
        boolean won = false;
        Number numberToFind = this.generator.execute();
        while(step < MAX_STEPS && !won){
            Number chosenNumber = Number.create(this.screen.readNumber());
            if(numberToFind.isHigherThat(chosenNumber)){
                this.screen.isHigher();
            }else if(numberToFind.isLowerThat(chosenNumber)){
                this.screen.isLower();
            }else{
                this.screen.isEquals();
                won = true;
            }
            step++;
        }
        if(won){
            this.screen.won();
        }else{
            this.screen.lose();
        }
    }
}
