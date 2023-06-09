package com.codurance.katalyst;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class GuessingNumberGameTest {
    
    @Test
    public void the_player_wins_on_the_first_move(){
        Screen screenMock = mock(Screen.class);
        when(screenMock.readNumber()).thenReturn(5);

        NumberGenerator numberGeneratorMock = mock(NumberGenerator.class);
        when(numberGeneratorMock.execute()).thenReturn(Number.create(5));

        GuessingNumberGame game = new GuessingNumberGame(screenMock, numberGeneratorMock);
        game.play();

        verify(screenMock, times(1)).show(GameStates.START);
        verify(screenMock, times(1)).readNumber();
        verify(screenMock, times(1)).show(ComparisonResultBetweenNumbers.EQUALS);
        verify(screenMock, times(1)).show(GameStates.WON);
    }

    @Test
    public void the_player_wins_not_on_the_first_intent(){
        Screen screenMock = mock(Screen.class);
        when(screenMock.readNumber()).thenReturn(10, 1, 5);

        NumberGenerator numberGeneratorMock = mock(NumberGenerator.class);
        when(numberGeneratorMock.execute()).thenReturn(Number.create(5));

        GuessingNumberGame game = new GuessingNumberGame(screenMock, numberGeneratorMock);
        game.play();

        verify(screenMock, times(1)).show(GameStates.START);
        verify(screenMock, times(3)).readNumber();
        verify(screenMock, times(1)).show(ComparisonResultBetweenNumbers.LOWER);
        verify(screenMock, times(1)).show(ComparisonResultBetweenNumbers.HIGHER);
        verify(screenMock, times(1)).show(ComparisonResultBetweenNumbers.EQUALS);
        verify(screenMock, times(1)).show(GameStates.WON);
    }

    @Test
    public void the_player_loses_the_game(){
        Screen screenMock = mock(Screen.class);
        when(screenMock.readNumber()).thenReturn(10, 1, 5);

        NumberGenerator numberGeneratorMock = mock(NumberGenerator.class);
        when(numberGeneratorMock.execute()).thenReturn(Number.create(3));

        GuessingNumberGame game = new GuessingNumberGame(screenMock, numberGeneratorMock);
        game.play();

        verify(screenMock, times(1)).show(GameStates.START);
        verify(screenMock, times(3)).readNumber();
        verify(screenMock, times(2)).show(ComparisonResultBetweenNumbers.LOWER);
        verify(screenMock, times(1)).show(ComparisonResultBetweenNumbers.HIGHER);
        verify(screenMock, times(0)).show(ComparisonResultBetweenNumbers.EQUALS);
        verify(screenMock, times(1)).show(GameStates.LOSE);
    }
}
