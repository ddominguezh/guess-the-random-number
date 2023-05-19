package com.codurance.katalyst;

public enum GameStates {
    START("As player"),
    WON("the player wins"),
    LOSE("the player loses");
    private String message;
    GameStates(String message){
        this.message  = message;
    }
    public String message(){
        return this.message;
    }
}
