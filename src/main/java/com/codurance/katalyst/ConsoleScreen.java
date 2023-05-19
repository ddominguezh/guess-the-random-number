package com.codurance.katalyst;

import java.util.Scanner;

public class ConsoleScreen implements Screen {

    private int lastNumber;

    @Override
    public int readNumber() {
        Scanner scanner = new Scanner(System.in);
        this.lastNumber = scanner.nextInt();
        scanner.close();
        return this.lastNumber;
    }

    @Override
    public void start() {
        System.out.println(GameStates.START.message());
    }

    @Override
    public void lose() {
        System.out.println(GameStates.LOSE.message());
    }

    @Override
    public void won() {
        System.out.println(GameStates.WON.message());
    }

    @Override
    public void show(ComparisonResultBetweenNumbers result) {
        System.out.println(String.format(result.message(), this.lastNumber));
    }
    
}
