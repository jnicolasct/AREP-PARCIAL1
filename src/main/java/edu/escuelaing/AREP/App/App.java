package edu.escuelaing.AREP.App;

import static spark.Spark.*;

import com.google.gson.Gson;
import edu.escuelaing.AREP.Calculos.BubbleSort;
import edu.escuelaing.AREP.Calculos.Calculadora;
import spark.Response;
import spark.Request;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        port(getPort());
        get("/hello", (req, res) -> "Hello Heroku");
        get("/", (req, res) -> inputDataPage(req, res));
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));

    }

    /**
     * Metodo el cual hace el envio de los datos a evaluar
     * @param req Solicitud hecha por spark
     * @param res Solicitud hecha por spark
     * @return un string que contiene el esquema de una pagina web
     */
    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<Center>"
                + "<h2>Ordenamiento de una lista</h2>"
                + "<p>Esta pagina ordena los datos que se ingresen</p>"
                + "<p>Ingrese los datos separados por coma</p>"
                + "<form action=\"/results\">"
                + "  Valores:<br>"
                + "  <input type=\"text\" name=\"valores\">"
                + "  <br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "</Center>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    /**
     * Metodo que ordena la lista enviada y calcula la suma y el promedio de dicha lista
     * @param req Solicitud hecha por spark
     * @param res Solicitud hecha por spark
     * @return un string que contiene el esquema de una pagina web
     */
    private static String resultsPage(Request req, Response res) {
        String lista[] = req.queryParams("valores").split(",");
        ArrayList<Double> listaDob = new ArrayList<Double>();
        for (int i=0;i<lista.length;i++){
            listaDob.add(Double.parseDouble(lista[i]));
        }
        ArrayList<Double> ordenada = BubbleSort.sort(listaDob);
        double suma = Calculadora.suma(ordenada);
        double promedio = Calculadora.promedio(ordenada);

        ObjetoJson nuevo = new ObjetoJson(ordenada, suma,promedio );
        String json = new Gson().toJson(nuevo);


        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<Center>"
                + "<h2>Datos ordenados, suma y promedio</h2>"
                + "<form action=\"/inputdata\">"
                + json
                + "  <br>"
                + "  <br>"
                + "  <input type=\"submit\" value=\"Volver\">"
                + "</form>"
                + "</Center>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    /**
     * Metodo que retorna el puerto por el cual esta corriendo la aplicacion
     * @return un entero que refiere al puerto
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }
}
