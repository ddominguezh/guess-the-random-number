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
    public void isLower() {
        System.out.println(String.format("I play a %d. The number is lower", this.lastNumber));
    }

    @Override
    public void isHigher() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isHigher'");
    }

    @Override
    public void lose() {
        System.out.println("the player loses");
    }

    @Override
    public void won() {
        System.out.println("the player wins");
    }
    
}
