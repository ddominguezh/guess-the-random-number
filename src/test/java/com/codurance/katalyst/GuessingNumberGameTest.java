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

        verify(screenMock, times(1)).start();
        verify(screenMock, times(1)).readNumber();
        verify(screenMock, times(1)).won();
    }
}
