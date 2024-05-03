/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package GUI;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author farfa
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSuma() {
        System.out.println("suma");
        double producto1 = 2.0;
        double producto2 = 2.0;
        double suma = 4.0;
        Calculadora instance = new Calculadora();
        double expResult = 4.0;
        double result = instance.suma(2, 2, 4);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testResta() {
        System.out.println("resta");
        double producto1 = 12.0;
        double producto2 = 7.0;
        double resta = 5.0;
        Calculadora instance = new Calculadora();
        double expResult = 5.0;
        double result = instance.resta(12, 7, 5);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        double producto1 = 13.0;
        double producto2 = 45.0;
        double multiplicacion = 585.0;
        Calculadora instance = new Calculadora();
        double expResult = 585.0;
        double result = instance.multiplicacion(13, 45, 585);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testDivision() {
        System.out.println("division");
        double producto1 = 54.0;
        double producto2 = 5.0;
        double division = 10.8;
        Calculadora instance = new Calculadora();
        double expResult = 10.8;
        double result = instance.division(54, 5, 10.8);
        assertEquals(expResult, result, 0);
    }  
}
