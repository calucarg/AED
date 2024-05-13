package aed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CoberturaTests {
    Cobertura cobertura = new Cobertura();

    @Test
    void testFizzBuzz() {
        assertEquals("FizzBuzz" ,cobertura.fizzBuzz(0));
        assertEquals("FizzBuzz" ,cobertura.fizzBuzz(15));
        assertEquals("Fizz", cobertura.fizzBuzz(9));
        assertEquals("Buzz", cobertura.fizzBuzz(20));
        assertEquals("17", cobertura.fizzBuzz(17));
    }

    @Test
    void testNumeroCombinatorio() {
        assertEquals(1, cobertura.numeroCombinatorio(0, 0));
        assertEquals(1, cobertura.numeroCombinatorio(10, 10));
        assertEquals(1, cobertura.numeroCombinatorio(10, 0));
        assertEquals(10, cobertura.numeroCombinatorio(10, 1));
        assertEquals(252, cobertura.numeroCombinatorio(10, 5));
    }

    @Test
    void testRepeticionesConsecutivas() {
        assertEquals(0, cobertura.repeticionesConsecutivas(new int[]{}));
        assertEquals(6, cobertura.repeticionesConsecutivas(new int[]{5,5,5,5,5,5}));
        assertEquals(0, cobertura.repeticionesConsecutivas(new int[]{5}));
        assertEquals(1, cobertura.repeticionesConsecutivas(new int[]{1,2,3,4,5}));
        assertEquals(5, cobertura.repeticionesConsecutivas(new int[]{1,1,1,1,1,2,2,2,2,2,3,3,3,5,5,5}));
        assertEquals(2, cobertura.repeticionesConsecutivas(new int[]{1,2,3,4,4,5,6,7}));
    }
}
