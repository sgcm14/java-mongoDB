Fixture web
---

Proyecto para la casa de apuestas.

Para esta etapa vas a modelar los partidos.

Ya que el acceso a esta información será de forma masiva y recurrente, vas a utilizar una base de datos no relacional, en este caso **MongoDB**.
Luego del relevamiento obtuviste que un partido está compuesto por:

* ID.
* Estado (Calendario, Por comenzar, En vivo, Finalizado).
* Resultado
* Equipo local.
    - ID.
    - Nombre.
    - País.
* Equipo visitante
    - ID.
    - Nombre.
    - País.


**¿Cuáles son los requerimientos?**

* Configurar la conexión en application.properties para conectarte a la base de datos “apuestas”.
* Agregar las clases necesarias (Model, Controller, Service, Repository).
* La API de los partidos deberá permitirte:
    - Agregar partidos.
    - Listar todos los partidos.
    - Listar partidos en vivo.

Abrir MongoDB y crear la BD
![](https://raw.githubusercontent.com/sgcm14/java-mongoDB/main/src/docs/Captura1.PNG)
> Pantalla de mongoDB

Desde Postman se pueden enviar la información para guardar de la siguiente manera:
![](https://raw.githubusercontent.com/sgcm14/java-mongoDB/main/src/docs/Captura2.PNG)
> Pantalla de postman

Desde localhost del aplicativo:
![](https://raw.githubusercontent.com/sgcm14/java-mongoDB/main/src/docs/Captura3.PNG)
> Pantalla de consumo de API

Desde localhost del aplicativo:
![](https://raw.githubusercontent.com/sgcm14/java-mongoDB/main/src/docs/Captura4.PNG)
> Pantalla de de consumo de API

**Realizado por :** Sammy Gigi Cantoral Montejo (sgcm14)

<img src ="https://raw.githubusercontent.com/sgcm14/sgcm14/main/sammy.jpg" width="200">
