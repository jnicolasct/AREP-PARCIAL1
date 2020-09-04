# AREP-PARCIAL1

[![CircleCI](https://circleci.com/gh/jnicolasct/AREP-PARCIAL1.svg?style=svg)](https://circleci.com/gh/jnicolasct/AREP-PARCIAL1)

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://arep-json-server.herokuapp.com/)

## Insatalacion y compilacion

Para instalar el programa se debe clonar el proyecto con el comando git clone URL del proyecto o descargar el zip de este y extraer los archivos en su computador y finalamente abrirlo desde cualquier IDE

Para la compilacion, dentro del directorio del proyecto desde la cmd ejecutar el comando mvn package.

### Requisitos

  - JDK instalado
  - maven instalado
  
 
## Uso

Para el uso de la aplicacion se debe ingresar al link de heroku, anteriomente dado, ingresar los datos, separados por coma y dar click en el boton submit:

![prHI](https://github.com/jnicolasct/AREP-PARCIAL1/blob/master/src/main/Resources/prHI.PNG)

esto lo redirije a una pagina donde muestra en formato JSON los datos anteriormente dados ordenados en una lista, la suma de estos y su promedio

![prHR](https://github.com/jnicolasct/AREP-PARCIAL1/blob/master/src/main/Resources/prHR.PNG)


Para el uso de java client se debe ejecutar el siguiente comando :

java -cp target/Parcial-1.0-SNAPSHOT.jar edu/escuelaing/AREP/Client/JavaClient

el resultado de ejecutar este comando se muestra en la siguiente imagen

![prJC](https://github.com/jnicolasct/AREP-PARCIAL1/blob/master/src/main/Resources/prJC.PNG)

## Autor

Johan Nicolas Cortes Torres
