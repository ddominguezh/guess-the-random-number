package com.codurance.katalyst;

public interface Screen {
    
    int readNumber();
    void show(GameStates state);
    void show(ComparisonResultBetweenNumbers result);

}
