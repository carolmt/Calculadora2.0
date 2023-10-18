package com.example.calculadora20;

import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTest {
    @Test
   public void test1() {
            Calculator calculator = new Calculator();
            float resultado = calculator.calcular(5, 3, "+");
            float esperado = 8;
            assertEquals(esperado, resultado, 0.01); //el 3er argumento es un delta, es un margen de error que se usa en decimales.
        }
        //no hago el test 2 porque mi calculadora no me permite operar con 3
   public void test3() {
        Calculator calculator = new Calculator();
        float resultado = calculator.calcular(4,2,"*");
        float esperado = 8;
        assertEquals("Error", esperado, resultado, 0.01);
    }
}