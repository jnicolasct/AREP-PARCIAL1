package edu.escuelaing.AREP.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class JavaClient {

    /**
     * Metodo main que crea un cliente java y relaiza la conexion con la aplicacion desplegada en heroku
     * @param args argumentos necesarios en un main
     * @throws Exception arroja si no logra hacer la conexion
     */

    public static void main(String[] args) throws Exception {

        URL url1 = new URL("https://arep-json-server.herokuapp.com/");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url1.openStream()))) {

            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (IOException x) {
            System.err.println(x);
        }

        System.out.println("RESULTADO:");
        URL url2 = new URL("https://arep-json-server.herokuapp.com/results?valores=4%2C3%2C5%2C6%2C9%2C3%2C1");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url2.openStream()))) {

            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (IOException x) {
            System.err.println(x);
        }
    }

}

