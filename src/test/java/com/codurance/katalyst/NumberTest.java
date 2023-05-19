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
        assertEquals(ComparisonResultBetweenNumbers.EQUALS, Number.create(5).compareTo(Number.create(5)));
    }

    @Test
    public void is_higher_that(){
        assertEquals(ComparisonResultBetweenNumbers.HIGHER, Number.create(5).compareTo(Number.create(4)));
    }

    @Test
    public void is_lower_that(){
        assertEquals(ComparisonResultBetweenNumbers.LOWER, Number.create(5).compareTo(Number.create(10)));
    }
}
