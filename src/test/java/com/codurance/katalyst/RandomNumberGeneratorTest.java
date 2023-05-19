package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RandomNumberGeneratorTest {
    
    @Test
    public void generate_number_greater_than_zero(){
        RandomNumberGenerator generator = new RandomNumberGenerator();
        boolean found = false;
        for( int i = 0 ; i < 100 ; i++ ){
            if(generator.execute().equals(Number.create(0))){
                found = true;
            }
        }
        assertFalse(found);
    }

    @Test
    public void generate_diferent_random_values(){
        RandomNumberGenerator generator = new RandomNumberGenerator();
        assertNotEquals(generator.execute(), generator.execute());
    }

    @Test
    public void generate_number_less_or_equal_ten(){
        RandomNumberGenerator generator = new RandomNumberGenerator();
        assertEquals(ComparisonResultBetweenNumbers.LOWER, generator.execute().compareTo(Number.create(11)));
    }

    @Test
    public void generate_number_equal_ten(){
        RandomNumberGenerator generator = new RandomNumberGenerator();
        boolean found = false;
        for( int i = 0 ; i < 100 ; i++ ){
            if(generator.execute().equals(Number.create(10))){
                found = true;
            }
        }
        assertTrue(found);
    }
}
