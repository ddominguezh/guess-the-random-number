package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NumberTest {
    
    @Test
    public void create_number(){
        assertEquals(5, Number.create(5).value());
    }

    @Test
    public void equals_number(){
        assertEquals(Number.create(5), Number.create(5));
    }

    @Test
    public void is_higher_that(){
        assertTrue(Number.create(5).isHigherThat(Number.create(4)));
        assertFalse(Number.create(4).isHigherThat(Number.create(5)));
    }

    @Test
    public void is_lower_that(){
        assertTrue(Number.create(5).isLowerThat(Number.create(10)));
        assertFalse(Number.create(10).isLowerThat(Number.create(5)));
    }
}
