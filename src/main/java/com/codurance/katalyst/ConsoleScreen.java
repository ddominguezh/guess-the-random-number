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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lower'");
    }

    @Override
    public void won() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'won'");
    }
    
}
