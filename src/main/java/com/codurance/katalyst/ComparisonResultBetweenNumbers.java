package com.codurance.katalyst;

public enum ComparisonResultBetweenNumbers {
    LOWER("I play a %d. The number is lower."),
    EQUALS("I play a %d."),
    HIGHER("I play a %d. The number is higher.");
    private String message;
    ComparisonResultBetweenNumbers(String message){
        this.message  = message;
    }
    public String message(){
        return this.message;
    }
}
