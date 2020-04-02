package com.politecnico.calculadora;

import com.politecnico.division.Division;
import com.politecnico.multiplicacion.Multiplicacion;
import com.politecnico.resta.Resta;
import com.politecnico.suma.Suma;

public class calculadora {
    public static void main(String[] args) {
        Suma suma = new Suma();
        Resta resta = new Resta();
        Division division = new Division();
        Multiplicacion multiplicacion = new Multiplicacion();

        System.out.println(suma.sumar(1,2));
        System.out.println(resta.restar(1,2));
        System.out.println(division.dividir(1,2));
        System.out.println(multiplicacion.multiplicar(1,2));
    }
}
