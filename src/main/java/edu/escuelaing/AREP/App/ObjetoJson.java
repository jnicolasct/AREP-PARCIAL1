package edu.escuelaing.AREP.App;

import edu.escuelaing.AREP.Calculos.BubbleSort;
import edu.escuelaing.AREP.Calculos.Calculadora;

import java.util.ArrayList;

public class ObjetoJson {
    private ArrayList<Double> ordenada;
    private double suma;
    private double promedio;

    /**
     * Metodo contructor de unaonjeto que va a ser json
     * @param ordenada lista ordenada de valores
     * @param suma suma de la lista ordenada
     * @param promedio promedio de la lista ordenada
     */
    public ObjetoJson(ArrayList<Double> ordenada, double suma, double promedio) {
        this.ordenada = ordenada;
        this.suma = suma;
        this.promedio = promedio;
    }

    public ArrayList<Double> getOrdenada() {
        return ordenada;
    }

    public void setOrdenada(ArrayList<Double> ordenada) {
        this.ordenada = ordenada;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
