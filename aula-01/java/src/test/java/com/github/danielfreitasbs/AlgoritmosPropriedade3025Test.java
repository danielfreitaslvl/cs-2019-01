package com.github.danielfreitasbs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosPropriedade3025Test {

    @Test
    public void propriedade3025isTrue() {
        assertEquals(true, Algoritmos.propriedade3025(3025));
    }

     @Test
    public void propriedade3025isfalse() {
        assertEquals(false, Algoritmos.propriedade3025(3024));
    }

     @Test
    public void propriedade3025Pequeno() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade3025(-1));
    }

     @Test
    public void propriedade3025Grande() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade3025(10000));
    }
}