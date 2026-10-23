# Laboratorio: Interfaces e Inyección de Dependencias – Cafetería en problemas

## Integrantes

- Diana Ocampo
- Diana Hinestroza
- Alan Giraldo

## Descripción

Una cafetería tiene un sistema para preparar bebidas de forma automatizada, pero el código original está fuertemente acoplado a dos equipos concretos (`Cafetera` y `Licuadora`). Cambiar de marca, agregar una máquina de té o reemplazar un equipo obliga a modificar el preparador central.

En este laboratorio refactorizamos el sistema usando **interfaces** e **inyección de dependencias por constructor**, de modo que el preparador pueda trabajar con cualquier equipo que cumpla el contrato, sin modificar su código.

## Objetivos

- Identificar código fuertemente acoplado y explicar por qué es un problema.
- Diseñar una interfaz que actúe como contrato entre el preparador y los equipos.
- Refactorizar clases concretas para que implementen la interfaz.
- Crear nuevas implementaciones con comportamientos distintos.
- Aplicar inyección de dependencias por constructor para desacoplar el preparador.
- Verificar que el mismo preparador funciona con distintas combinaciones de equipos.

## Estructura del proyecto

| Archivo | Descripción |
|---|---|
| `TestAnalisis.java` | Ejecuta el código original y deja documentado el problema de acoplamiento. |
| `EquipoCocina.java` | Interfaz (contrato) con `encender()`, `apagar()`, `preparar()` y `ajustarIntensidad()`. |
| `Cafetera.java` | Implementa `EquipoCocina` (refactorizada). |
| `Licuadora.java` | Implementa `EquipoCocina` (refactorizada). |
| `MaquinaTe.java` | Nueva implementación: máquina de té. |
| `Exprimidor.java` | Nueva implementación: exprimidor de frutas. |
| `PreparadorBebidas.java` | Preparador refactorizado; recibe dos `EquipoCocina` por constructor. |
| `TestPreparadorBebidas.java` | Prueba tres configuraciones distintas de equipos. |
| `PreparadorBebidasV2.java` | Segunda versión; recibe una `List<EquipoCocina>` y controla todos los equipos. |
| `TestPreparadorBebidasV2.java` | Prueba la V2 con una lista de cuatro equipos. |

## Resumen por partes

1. **Análisis del código actual:** el preparador creaba con `new` una `Cafetera` y una `Licuadora`, quedando amarrado a ellas.
2. **Diseño de la interfaz:** se creó `EquipoCocina` con los cuatro métodos comunes a todos los equipos.
3. **Refactorización de las implementaciones:** `Cafetera` y `Licuadora` ahora implementan `EquipoCocina` con `@Override`.
4. **Inyección de dependencias:** `PreparadorBebidas` depende de la interfaz y recibe los equipos por constructor, sin usar `new` en su interior.
5. **Nuevas implementaciones:** se agregaron `MaquinaTe` y `Exprimidor`, cada una con su propio comportamiento.
6. **Prueba de flexibilidad:** el mismo `PreparadorBebidas` funciona con Cafetera + Licuadora, Máquina de té + Exprimidor y otras combinaciones, sin modificarlo.
7. **Segunda versión:** `PreparadorBebidasV2` recibe una lista de equipos y los enciende, prepara y apaga recorriéndola con un ciclo.

## Cómo compilar y ejecutar

Desde la carpeta donde están los archivos:

```bash
javac *.java
java TestAnalisis
java TestPreparadorBebidas
java TestPreparadorBebidasV2
```

## Conceptos aplicados

- **Interfaces:** definen un contrato que las clases concretas deben cumplir.
- **Polimorfismo:** el preparador trata a todos los equipos como `EquipoCocina`, y cada uno se comporta según su implementación.
- **Inyección de dependencias por constructor:** las dependencias llegan desde afuera, lo que reduce el acoplamiento y facilita agregar o cambiar equipos.
