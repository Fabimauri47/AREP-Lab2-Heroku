# ***Lab # 2 Taller Heroku Calculadora***

## Comenzando

En este laboratorio 2 de introducci´on al dise˜no de sistemas inform´aticos, se procedi´o a desarrollar un programa que permitiera calcular dos operaciones: La
desviaci´on est´andar y la media en un conjunto de
n´umeros reales, proporcionados por el usuario. El programa lee n´umeros reales desde una p´agina web, en la
cual tiene acceso el usuario, con el fin de que pueda
hacer el c´alculo de sus operaciones correspondientes.

Para realizar estos c´alculos correspondientes se
necesito una estructura de datos de tipo ”Linked List”,
con la aplicaci´on de Java, para que estas pudieran ser
desplegadas. Se necesito adquirir el conocimiento para
uso framework Spark, el cual es necesario para poder
desarrollar la aplicaci´on. Realizar la validaci´on de un
despliegue continuo con CircleCI.



### Pre-Requisitos

* [Java 8.0](https://www.java.com/es/) - Codificación
* [Spark](https://spark.apache.org/downloads.html) - Micro Framework para crear aplicaciones web en Java 8.0
* [Maven](https://maven.apache.org/) - Manejo de Dependencias
* [JUnit](https://junit.org/junit5/) - Pruebas de Unidad
* [Git](https://github.com/) - Control de Sistemas de veriones.


### Despliegue con Heroku App


### Integracion Continua con Circle CI

### Guia de Instalación

1. Primero se dbe clonar el repositorio, con el siguiente comando descrito:

    - git clone https://github.com/Fabimauri47/AREP-Lab2-Heroku
    
    ![texto cualquiera por si no carga la imagen](https://github.com/Fabimauri47/AREP-Lab1-Calculadora/blob/main/Imagenes/clonar%20repositorio.png)

2. Luego proceda abrir el cmd (Ventana de comandos) en donde tiene el repositorio alojado y ejecute el siguiente comando:

    - mvn package
    
    ![texto cualquiera por si no carga la imagen](https://github.com/Fabimauri47/AREP-Lab1-Calculadora/blob/main/Imagenes/comando%20mvn%20package.png)

3. Ejecutamos el programa con el siguiente comando:

   - mvn exec:java -D "exec.mainClass"="edu.escuelaing.arem.designprimer.SparkWebApp"
     In your browser: http://localhost:4567
   
   ![texto cualquiera por si no carga la imagen](https://github.com/Fabimauri47/AREP-Lab1-Calculadora/blob/main/Imagenes/ejecutar%20comando%203.png)

4. Gereramos la documentación con el siguiente comando ejecutandolo desde consola:

   - mvn javadoc:javadoc
   
   ![texto cualquiera por si no carga la imagen](https://github.com/Fabimauri47/AREP-Lab1-Calculadora/blob/main/Imagenes/generando%20documentacion.png)
   
 5. Para ver la aplicacion de la calculadora, de manera web, presione en el siguiente enlace:
        -[Calculadora en Heroku](https://pure-bayou-45076.herokuapp.com/)


## Corriendo Pruebas

Para correr las pruebas, usamos el siguiente comando en una terminal CMD o en una terminal GIT:

  * mvn test

   ![texto cualquiera por si no carga la imagen](https://github.com/Fabimauri47/AREP-Lab1-Calculadora/blob/main/Imagenes/corrida%20pruebas.png)


## Desarrollo e Informe

- Para conocer mas sobre el desarrollo del proyecto, descargue el proyecto como se explica arriba o revise el informe:

    -[Presione Aqui para revisar documento](https://github.com/Fabimauri47/AREP-Lab2-Heroku/blob/main/Lab2__INTRODUCTION_TO_COMPUTER_SYSTEM_DESIGN.pdf)

## Construido con

* [Java 8.0](https://www.java.com/es/) - Codificación
* [Spark](https://spark.apache.org/downloads.html) - Micro Framework para crear aplicaciones web en Java 8.0
* [Maven](https://maven.apache.org/) - Manejo de Dependencias


## Autor

* **Fabián Mauricio Ramirez Pinto** [Fabimauri47](https://github.com/Fabimauri47)


## Licencia

Este proyecto cuenta con la licencia GNU: General Public License - see the [LICENSE.md](https://github.com/Fabimauri47/AREP-Lab1-Calculadora/blob/main/LICENSE.txt) 
