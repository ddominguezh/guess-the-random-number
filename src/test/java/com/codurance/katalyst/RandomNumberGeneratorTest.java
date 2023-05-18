package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RandomNumberGeneratorTest {
    
    @Test
    public void generate_number_greater_than_zero(){
        RandomNumberGenerator generator = new RandomNumberGenerator();
        assertTrue(generator.execute().isHigherThat(Number.create(0)));
    }

    @Test
    public void generate_diferent_random_values(){
        RandomNumberGenerator generator = new RandomNumberGenerator();
        assertNotEquals(generator.execute(), generator.execute());
    }
}
