package edu.escuelaing.AREP.Calculos;

import java.util.ArrayList;

public class Calculadora {


    public static double suma(ArrayList<Double> listaDob) {
        double suma = 0.0;
        for (double valor:listaDob){
            suma = suma + valor;
        }
        return suma;
    }

    public static double promedio(ArrayList<Double> listaDob) {
        double suma = suma(listaDob);
        double promedio = suma/listaDob.size();
        return promedio;
    }
}

