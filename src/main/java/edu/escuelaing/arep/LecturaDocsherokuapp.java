package edu.escuelaing.arep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static java.lang.Double.parseDouble;

public class LecturaDocsherokuapp {


        public  void leerDocumento() {
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;



            try {
                // Apertura del fichero y creacion de BufferedReader para poder
                // hacer una lectura comoda (disponer del metodo readLine()).
                archivo = new File ("lecturaArchivo.txt");
                fr = new FileReader (archivo);
                br = new BufferedReader(fr);

                ListaEnlazaheroku capturarDatos = new ListaEnlazaheroku();


                // Lectura del fichero
                String linea;
                while((linea=br.readLine())!=null)
                    capturarDatos.insertar(parseDouble(linea));
                    System.out.println(linea);
            }
            catch(Exception e){
                e.printStackTrace();
            }finally{
                // En el finally cerramos el fichero, para asegurarnos
                // que se cierra tanto si todo va bien como si salta
                // una excepcion.
                try{
                    if( null != fr ){
                        fr.close();
                    }
                }catch (Exception e2){
                    e2.printStackTrace();


                }
            }
        }

    public Object read(String arg) {
        return null;
    }

    public ListaEnlazaheroku readinList(Object read) {
        return null;
    }
}

