# demoJuego

#### Recursos empleados####
Proyecto creado en IDE: 
- Apache Netbeans 12.3
se construye como un proyecto de:
- maven Spring Boot Initializr Project
Dependencies:
- Spring Data JPA
- MySQL Driver
Verision JDK 16 (para modificar version 
cambiar linea 17 del archivo pom.xml en Netbeans)
pom.xml= juego/projectFiles/pom.xml
Lenguaje de programación JAVA

####Para la creacion de la DB###
se emplea lenguaje SQL
"script_juego"
para la visualización del código dirigirse a carpeta SQL

### configurar contraseña DB desde Netbeans###
Juego/other Sources/src/main/resources/default package/
application.properties(modificar linea 3 "password")

###Descripcion general (FUNCIONALIDAD)## 
La GUI esta compuesta de 3 pestañas (Jugar,Historial,configuración)

- para JUGAR es necesario ingresar nombre, cedula y presionar el boton Iniciar. 
en cualquier momento puede reponder o abandonar la partida. 
-> si responde de forma correcta seguira en la siguiente ronda (ronda max 5)
-> si responde de forma incorrecta se irá de la plataforma con puntaje 0.
-> si abandona la competencia el sistema guarda el puntaje obtenido previamente. 
(En cualquiera de los 3 casos, puede volver a Jugar)

- La pestaña HISTORIAL permite conocer y enlistar a traves de una tabla
informacion de los jugadores y sus resultados en el juego, puede pulsar en cualquier
momento el botón ACTUALIZAR

-la pestaña CONFIGURACIÓN permite crear nuevas preguntas


### INFORMACION CONTACTO ###
Nombre: Juan Esteban Pineda Angel
Correo: Jpinedaangel@Gmail.com
Celular: 3004866544
Teléfono: (604)5831361 medellín