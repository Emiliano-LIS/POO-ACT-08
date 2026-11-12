# Actividad 08 - Pruebas Unitarias con JUnit 5

## Datos del estudiante:
- Nombre: Jorge Emiliano Hernandez Martinez
- Matricula: S25018133
- Grupo: LIS 301

## 1. Instrucciones
En esta actividad tendremos que realizar 5 pruebas a cada uno de los metodos de @ArrayOperations.java, los cuales serán con JUnit con el proposito de probar la funcionalidad de esta clase y que los metodos esten implementados correctamente, además no necesariamente todas las pruebas deberán pasar sino que el proposito general es verlas en acción

## 2. Tecnologías utilizadas

- **Java 21:** lenguaje de programación utilizado para desarrollar el proyecto.
- **Maven:** herramienta para administrar dependencias y construir el proyecto.
- **JUnit 5.12.3:** framework utilizado para implementar y ejecutar pruebas unitarias.
- **IntelliJ IDEA:** entorno de desarrollo utilizado para programar y ejecutar las pruebas.

## 3. Estructura del proyecto

El proyecto utiliza la estructura convencional de Maven:

```text
Actividad-08/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/ArrayOperations/
│   │   │       └── ArrayOperations.java
│   │   └── resources/
│   │
│   └── test/
│       └── java/
│           └── com/ArrayOperations/
│               └── ArrayOperationsTest.java
│
├── target/
├── README.md
└── pom.xml
```
### 4. ¿Cómo funcionan las pruebas?

Las pruebas unitarias se implementan mediante métodos que utilizan la anotación `@Test`.

Cada prueba realiza tres operaciones principales:

1. Define los datos de entrada.
2. Ejecuta el método que se desea evaluar.
3. Compara el resultado obtenido con el esperado mediante una aserción.

Por ejemplo:

```java
@Test
void ArrayOneTwoThreeReturnsZero() {
    int resultado = ArrayOperations.numZero(new int[]{1, 2, 3});
    assertEquals(0, resultado);
}
```

En este caso:

- Se proporciona el arreglo `[1, 2, 3]`.
- Se ejecuta el método `numZero()`.
- Se comprueba que el resultado sea `0`.

La función `assertEquals()` compara el resultado esperado con el resultado obtenido. Si ambos coinciden, la prueba se considera exitosa; de lo contrario, JUnit registra un fallo.

## 5. Métodos evaluados y casos de prueba

Se realizaron cinco pruebas unitarias para cada uno de los siguientes métodos.

### 5.1. numZero()

Cuenta la cantidad de elementos cuyo valor es cero dentro de un arreglo de enteros.

| Prueba | Entrada | Resultado esperado |
|:---:|:---|:---:|
| 1 | `[1, 2, 3]` | 0 |
| 2 | `[1, 0, 2, 0]` | 2 |
| 3 | `[0, 0, 0]` | 3 |
| 4 | `[]` | 0 |
| 5 | `[1, 1, 2, 4, 5]` | 0 |

### 5.2. findLast()

Busca la última aparición de un elemento específico dentro de un arreglo y devuelve su índice. Si el elemento no existe, devuelve `-1`.

| Prueba | Entrada | Valor buscado | Resultado esperado |
|:---:|:---|:---:|:---:|
| 1 | `[1, 1, 1]` | 1 | 2 |
| 2 | `[1, 2, 1, 3, 4, 1]` | 1 | 5 |
| 3 | `[2, 4, 5]` | 2 | 0 |
| 4 | `[1, 2, 5, 6]` | 10 | -1 |
| 5 | `[]` | 2 | -1 |

### 5.3. countPositive()

Cuenta la cantidad de elementos positivos presentes en un arreglo de enteros.

| Prueba | Entrada | Resultado esperado |
|:---:|:---|:---:|
| 1 | `[1, 1, 2, 3, -1, -2]` | 4 |
| 2 | `[2, 4, 5]` | 3 |
| 3 | `[-1, 0, 1]` | 1 |
| 4 | `[]` | 0 |
| 5 | `[1]` | 1 |

### 5.4. lastZero()

Busca la última aparición del número cero dentro de un arreglo y devuelve su índice. Si no existe ningún cero, devuelve `-1`.

| Prueba | Entrada | Resultado esperado |
|:---:|:---|:---:|
| 1 | `[0, 1, 1, 1]` | 0 |
| 2 | `[1, 1, 1, 2, 3]` | -1 |
| 3 | `[0, 1, 0, 0, 2, 4, 0]` | 6 |
| 4 | `[0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0]` | 10 |
| 5 | `[]` | -1 |

### 5.5. oddOrPos()

Cuenta los elementos que cumplen al menos una de las siguientes condiciones:

- El elemento es impar.
- El elemento es positivo.

| Prueba | Entrada | Resultado esperado |
|:---:|:---|:---:|
| 1 | `[-3, -2, 0, 1, 4]` | 3 |
| 2 | `[-1, -2, -3]` | 2 |
| 3 | `[0, 0, 0]` | 0 |
| 4 | `[1, 2, 3, 4]` | 4 |
| 5 | `[-5, -4, -3, -2]` | 2 |

## 6. Resultados esperados

El proyecto contiene un total de **25 pruebas unitarias**, distribuidas de la siguiente manera:

| Método evaluado | Número de pruebas |
|:---|:---:|
| `numZero()` | 5 |
| `findLast()` | 5 |
| `countPositive()` | 5 |
| `lastZero()` | 5 |
| `oddOrPos()` | 5 |
| **Total** | **25** |


## 7. Conclusión

La actividad permitió aplicar los fundamentos de las pruebas unitarias en Java mediante el framework JUnit 5.

A través de 25 casos de prueba se evaluaron cinco métodos encargados de realizar operaciones sobre arreglos de enteros, considerando diferentes escenarios de entrada, como números positivos, negativos, ceros, arreglos vacíos y elementos inexistentes.

El uso de `@Test` permitió definir pruebas independientes, mientras que `assertEquals()` facilitó la comparación entre los resultados obtenidos y los esperados.

Finalmente, la integración de JUnit con Maven permitió automatizar la ejecución de las pruebas y obtener reportes que facilitan la identificación de errores y la verificación del comportamiento del código.

## 8. Uso de la IA y reflexión

En esta actividad la IA se uso para dudas relacionadas a los package y instalación de JUnit (En dependencies) y también para generar un archivo markdown legible y completo, verificando la estructura de este y depurandolo de cosas innecesarias.