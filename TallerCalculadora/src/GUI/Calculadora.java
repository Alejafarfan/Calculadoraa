/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author farfa
 */
public class Calculadora {

    private double producto1;
    private double producto2;

    public Calculadora() {
    }

    public Calculadora(double producto1, double producto2) {
        this.producto1 = 0;
        this.producto2 = 0;
    }

    public double suma(double producto1, double producto2, double suma) {
        suma = producto1 + producto2;
        return suma;
    }

    public double resta(double producto1, double producto2, double resta) {
        resta = producto1 - producto2;
        return resta;
    }

    public double multiplicacion(double producto1, double producto2, double multiplicacion) {
        multiplicacion = producto1 * producto2;
        return multiplicacion;
    }

    public double division(double producto1, double producto2, double division) {
        if (producto2 != 0) {
            division = producto1 / producto2;
            return division;
        } else {
            return 0;
        }
    }

    public double getProducto1() {
        return producto1;
    }

    public void setProducto1(double producto1) {
        this.producto1 = producto1;
    }

    public double getProducto2() {
        return producto2;
    }

    public void setProducto2(double producto2) {
        this.producto2 = producto2;
    }

}
