Antonia Cáceres - 22.050.742-4 - antoniacaceress
Benjamín Carrasco - 21.983.969-3 - benjamincarrasco02-lab

# Taller 3 Benjamín Carrasco y Antonia Cáceres
## Descripción del proyecto

Se creó un programa en Java basado en un mundo de magia, donde distintos magos dominan una variedad de hechizos pertenecientes a los elementos Fuego, Tierra, Planta y Agua.
El sistema permite administrar tanto los magos como los hechizos, además de generar distintos reportes y análisis sobre la información almacenada.
Toda la información del programa se almacena en archivos de texto, permitiendo mantener la persistencia de los datos incluso después de cerrar la aplicación.

El programa se divide en dos paneles principales:
### Administrador
Permite gestionar toda la información almacenada en el sistema mediante las siguientes opciones:
* Agregar magos.
* Modificar magos.
* Eliminar magos.
* Agregar hechizos.
* Modificar hechizos.
* Eliminar hechizos.

Todos los cambios realizados son almacenados automáticamente en los archivos.

### Panel Analista
Permite visualizar y analizar la información registrada mediante las siguientes opciones:
* Mostrar todos los hechizos registrados.
* Mostrar todos los los magos registrados.
* Mostrar todos los hechizos junto a su puntuación.
* Mostrar todos los magos junto a su puntuación.
* Mostrar el Top 10 de mejores hechizos.
* Mostrar el Top 3 de mejores magos.

Las puntuaciones se calculan según las fórmulas establecidas para cada tipo de hechizo.

## Estructura del proyecto
El proyecto fue desarrollado utilizando Programación Orientada a Objetos, herencia e interfaces.

### Hechizo
Clase base que contiene los atributos comunes de todos los hechizos:
* Nombre.
* Tipo.
* Daño.

Además contiene los métodos de acceso correspondientes.

### Fuego
Hereda de Hechizo e incorpora:
* Duración de quemadura.

### Tierra
Hereda de Hechizo e incorpora:
* Mejora de defensa.

### Planta
Hereda de Hechizo e incorpora:
* Duración de stun.
* Cantidad de plantas.

### Agua
Hereda de Hechizo e incorpora:
* Cantidad de curación.
* Presión del agua.

### Mago
Representa a cada mago registrado en el sistema.
Contiene:
* Nombre del mago.
* Lista de hechizos dominados.

### Administrador
Implementa las funcionalidades relacionadas con la administración y modificación de la información almacenada.

### Analista
Implementa las funcionalidades relacionadas con los reportes, rankings y cálculos de puntuación.

### LectorArchivos
Clase encargada de:
* Leer los archivos de magos y hechizos.
* Cargar la información al iniciar el programa.
* Sobrescribir los archivos cuando se realizan modificaciones.

### SistemaAdm
Interfaz que define las operaciones disponibles para el panel Administrador.

### SistemaAn
Interfaz que define las operaciones disponibles para el panel Analista.

### App
Clase principal del programa.
Contiene:
* Menú principal.
* Menú Administrador.
* Menú Analista.

Además coordina la interacción entre el usuario y el sistema.


El programa utiliza dos archivos de texto:
### Magos.txt
Almacena el nombre de cada mago junto con los hechizos que domina.
NombreMago;Hechizo1|Hechizo2|HechizoN

### Hechizos.txt
Almacena los datos de cada hechizo.
NombreHechizo;Tipo;Daño;AtributosEspeciales

Los atributos especiales dependen del tipo de hechizo.

## Instrucciones de ejecución
1. Abrir el proyecto en un entorno de desarrollo compatible con Java.
2. Verificar que los archivos Magos.txt y Hechizos.txt se encuentren correctamente asociados al proyecto.
3. Ejecutar la clase App.
4. Seleccionar el panel al que se desea ingresar:
   * Administrador.
   * Analista.
5. Utilizar las opciones disponibles según el panel seleccionado.
6. Todos los cambios realizados se almacenarán automáticamente en los archivos de texto correspondientes.

## Consideraciones
* El proyecto fue desarrollado utilizando Programación Orientada a Objetos.
* Se utilizó herencia para representar los distintos tipos de hechizos.
* Se utilizaron interfaces para separar las funcionalidades de administración y análisis.
* La información es persistente mediante archivos de texto.
* Se utilizaron colecciones dinámicas mediante ArrayList para almacenar magos y hechizos.
