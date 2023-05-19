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
        System.out.println("As player");
    }

    @Override
    public void lose() {
        System.out.println("the player loses");
    }

    @Override
    public void won() {
        System.out.println("the player wins");
    }

    @Override
    public void show(ComparisonResultBetweenNumbers result) {
        System.out.println(String.format(result.message(), this.lastNumber));
    }
    
}
