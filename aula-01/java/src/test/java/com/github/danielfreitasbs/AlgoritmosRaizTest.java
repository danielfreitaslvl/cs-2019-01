package com.github.danielfreitasbs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosRaizTest {
     
      @Test
      public void raizCasoClassico() {
          assertEquals(2, Algoritmos.raiz(4, 25));
      }

      @Test
      public void raizBasePequena() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.raiz(-1, 2));
      }
    }