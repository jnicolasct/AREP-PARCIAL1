package edu.escuelaing.AREP.Calculos;

import java.util.ArrayList;

public class BubbleSort {


    /**
     * Metodo de ordenamiento de una lista
     * @param listaInt lista la cual se quiere ordenar
     * @return lista ordenada
     */
    public static ArrayList<Double> sort(ArrayList<Double> listaInt) {
        boolean swap = true;
        while(swap){
            swap = false;
            for (int i=0;i+1<listaInt.size();i++){
                double actual = listaInt.get(i);
                double siguiente = listaInt.get(i+1);
                if(actual>siguiente){
                    swap = true;
                    double temp = siguiente;
                    listaInt.set((i+1), actual);
                    listaInt.set(i, temp);
                }
            }
        }
        return listaInt;
    }
}
