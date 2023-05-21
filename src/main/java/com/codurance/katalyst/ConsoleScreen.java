package com.codurance.katalyst;

import java.util.Scanner;

public class ConsoleScreen implements Screen {

    private int lastNumber;
    private Scanner scanner;
    public ConsoleScreen(){
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int readNumber() {
        this.lastNumber = scanner.nextInt();
        return this.lastNumber;
    }

    @Override
    public void show(GameStates state){
        System.out.println(state.message());
        if(GameStates.LOSE.equals(state) || GameStates.WON.equals(state))
        {
            close();
        }
    }

    @Override
    public void show(ComparisonResultBetweenNumbers result) {
        System.out.println(String.format(result.message(), this.lastNumber));
    }

    private void close() {
        this.scanner.close();
    }
    
}
