# Práctica DOO

> ##### [Máster en Ingeniería Web por la Universidad Politécnica de Madrid (miw-upm)](http://miw.etsisi.upm.es)
> ##### Asignatura: *Ingeniería Web: Visión General*

### Estado del código

[![Build Status](https://travis-ci.org/AngelicaGuaman/IWVG.SwC.AngelicaGuaman.svg?branch=master)](https://travis-ci.org/AngelicaGuaman/IWVG.SwC.AngelicaGuaman)

![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=es.upm.miw:IWVG.SwC.AngelicaGuaman&metric=alert_status)


### Tecnologías necesarias
* Java
* Maven
* GitHub
* Travis-ci
* Sonarcloud


### Descripción de la práctica

### Master Mind
* Solicitará al usuario por consola si desea jugar contra la máquina (partida) o que juegue la máquina sola (demo)
* En cualquier caso, generará automáticamente el código secreto
* Para la partida, solicitará al usuario por consola la combinación que desea intentar y mostrará
automáticamente el número de muertos (acierto en posición y color) y de heridos (acierto en color y no en posición)
* Para la demo, se generarán intentos automáticos aleatoriamente
* Cuando termine la partida tras 10 intentos fallidos o victoria al coincidir el intento con el secreto, preguntará si desea continuar

### Interfaz
Interfaz de texto parecido a:
1. Partida
2. Demo
Opicón? 1<enter>
Secreto: ****
Intento? [cuatro letras de entre A-amarillo, R-rojo, V-verde, Z-azul, B-blanco, N-negro] AARR<enter>
0 muertos y 2 heridos
Intento? [cuatro letras de entre A-amarillo, R-rojo, V-verde, Z-azul, B-blanco, N-negro] NBAA<enter>
4 muertos!!! Victoria

