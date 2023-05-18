package com.codurance.katalyst;

public class Number {
    
    private int value;
    protected Number(int value){
        this.value = value;
    }
    public static Number create(int value){
        return new Number(value);
    }
    public int value(){
        return this.value;
    }
    @Override
    public boolean equals(Object otherValue){
        if(otherValue == null || !(otherValue instanceof Number)){
            return false;
        }
        return this.value == ((Number)otherValue).value;
    }
    public boolean isHigherThat(Number otherValue) {
        assert(otherValue != null);
        return this.value > otherValue.value;
    }
    public boolean isLowerThat(Number otherValue) {
        assert(otherValue != null);
        return this.value < otherValue.value;
    }
}
