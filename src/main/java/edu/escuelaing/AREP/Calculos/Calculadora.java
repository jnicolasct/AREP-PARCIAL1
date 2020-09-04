package edu.escuelaing.AREP.Calculos;

import java.util.ArrayList;

public class Calculadora {

    /**
     * Metodo que calcula la suma de una lista
     * @param listaDob lista a la cual se quieren sumar sus valores
     * @return el valor de la suma
     */
    public static double suma(ArrayList<Double> listaDob) {
        double suma = 0.0;
        for (double valor:listaDob){
            suma = suma + valor;
        }
        return suma;
    }

    /**
     * Metodo que calcula el promedio de la lista
     * @param listaDob lista a la cual se le quiere calcular el promedio
     * @return el promedio de la lista
     */
    public static double promedio(ArrayList<Double> listaDob) {
        double suma = suma(listaDob);
        double promedio = suma/listaDob.size();
        return promedio;
    }
}

