package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsoleScreenTest {
    
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setUp(){
        this.outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(this.outputStream));
    }

    @Test
    public void get_number(){
        ByteArrayInputStream inputStrem = new ByteArrayInputStream("5".getBytes());
        System.setIn(inputStrem);
        ConsoleScreen screen = new ConsoleScreen();
        assertEquals(5, screen.readNumber());
    }

    @Test
    public void start(){
        ConsoleScreen screen = new ConsoleScreen();
        screen.start();
        assertEquals("As player\n", this.outputStream.toString());
    }

    @Test
    public void lose(){
        ConsoleScreen screen = new ConsoleScreen();
        screen.lose();
        assertEquals("the player loses\n", this.outputStream.toString());
    }

    @Test
    public void won(){
        ConsoleScreen screen = new ConsoleScreen();
        screen.won();
        assertEquals("the player wins\n", this.outputStream.toString());
    }

    @Test
    public void is_lower(){
        ByteArrayInputStream inputStrem = new ByteArrayInputStream("3".getBytes());
        System.setIn(inputStrem);
        ConsoleScreen screen = new ConsoleScreen();
        screen.readNumber();
        screen.isLower();
        assertEquals("I play a 3. The number is lower\n", this.outputStream.toString());
    }
}
