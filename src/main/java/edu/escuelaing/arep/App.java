package edu.escuelaing.arep;


import spark.Request;
import spark.Response;
import static spark.Spark.*;

public class App 
{
    public static void main(String[] args) {
        port(getPort());
        get("/", (request, response) -> paginaInicial(request, response));
    }


    private static Object paginaInicial (Request req, Response res) {
        String crearDatos = "<!DOCTYPE html>"
                +"<html>"
                + "<title> Calculadora</title>"
                + "<body>"
                +"<h1>Ingrese la lista</h1>"
                +"</body>"
                +"</html>";
        return crearDatos;
    }


    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }



}

