package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberTest {
    
    @Test
    public void create_number(){
        assertEquals(5, Number.create(5));
    }
}
