# Mini Proyecto de Gestión de Ventas 📊

Creado por: [Jael]

## Descripción del Proyecto 📝

Este es un sencillo programa en Java diseñado para gestionar un conjunto de ventas. Permite al usuario ingresar una cantidad determinada de ventas y luego buscar y mostrar aquellas ventas que superen un valor específico ingresado por el usuario. También cuenta el total de ventas que cumplen con este criterio.

## Funcionalidades Principales ✨

* **Ingreso de Ventas**: El usuario puede especificar cuántas ventas desea registrar.
* **Registro de Montos**: El sistema solicita el monto para cada una de las ventas.
* **Búsqueda Filtrada**: El usuario puede ingresar un valor y el programa mostrará todas las ventas cuyo monto sea superior a dicho valor.
* **Conteo de Ventas Filtradas**: Informa cuántas ventas superaron el valor de búsqueda.

## Estructura del Código JAVA

El proyecto está organizado en dos clases principales:

* `Main.java`: Contiene el método `main` que inicia la ejecución del programa. Se encarga de interactuar con el usuario para obtener la cantidad total de ventas y el valor de referencia para la búsqueda.
* `Clases/Ventas.java`: Define la clase `Ventas` que encapsula la lógica para almacenar, registrar y filtrar las ventas.

### Clase `Ventas`

#### Atributos

* `double[] ventas`: Un arreglo para almacenar los montos de las ventas.
* `Scanner scanner`: Un objeto `Scanner` para leer la entrada del usuario.

#### Métodos

* `Ventas(int v)`: Constructor que inicializa el arreglo `ventas` con el tamaño especificado.
* `void setVentas()`: Solicita al usuario que ingrese el monto para cada venta y los almacena.
* `void verVentaMayorA(int c)`: Itera sobre las ventas y muestra aquellas que son mayores que el valor `c`. También imprime el total de estas ventas.
* `void setVentas(int lugar, double venta)`: Asigna un monto de venta a una posición específica del arreglo.
* `double getScanner()`: Lee un valor `double` ingresado por el usuario.
* `double getVenta(int lugar)`: Devuelve el monto de la venta en una posición específica.

## Cómo Ejecutar el Proyecto 🚀

1.  **Compilación**:
    Abre una terminal o línea de comandos y navega hasta el directorio raíz del proyecto (donde se encuentra el archivo `Main.java` y la carpeta `Clases`).
    Ejecuta el siguiente comando para compilar los archivos Java:
    ```bash
    javac Main.java Clases/Ventas.java
    ```

2.  **Ejecución**:
    Una vez compilado sin errores, ejecuta el programa con el siguiente comando:
    ```bash
    java Main
    ```

3.  **Interacción**:
    El programa te guiará para:
    * Ingresar la cantidad total de ventas.
    * Ingresar el monto de cada venta una por una.
    * Ingresar el valor de la venta mayor a buscar.

## Ejemplo de Uso ⌨️
    Ingresa la cantidad de ventas: 3
    Ingrese la venta numero: 1: 150.75
    Ingrese la venta numero: 2: 200.00
    Ingrese la venta numero: 3: 99.50
    Ingrese el valor de la venta mayor a buscar: 100
    La venta numero 1 es mayor a 100 Teniendo un valor de :150.75
    La venta numero 2 es mayor a 100 Teniendo un valor de :200.0
    El total de ventas mayores a 100 es: 2


