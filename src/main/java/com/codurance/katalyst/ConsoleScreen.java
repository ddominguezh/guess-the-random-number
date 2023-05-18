package com.codurance.katalyst;

import java.util.Scanner;

public class ConsoleScreen implements Screen {

    @Override
    public int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        scanner.close();
        return value;
    }

    @Override
    public void start() {
        System.out.println("As player");
    }

    @Override
    public void isLower() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isLower'");
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
