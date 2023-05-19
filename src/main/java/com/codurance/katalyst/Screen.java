package com.codurance.katalyst;

public interface Screen {
    
    int readNumber();
    void start();
    void lose();
    void won();
    void show(ComparisonResultBetweenNumbers result);
}
