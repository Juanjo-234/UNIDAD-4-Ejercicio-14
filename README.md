Resolución del ejercicio N°14 de la unidad 4 de programación 2.
El programa simulates un sistema de control de vencimientos y gestión de préstamos bibliotecarios aplicando los principios de la Programación Orientada a Objetos (POO). Su propósito principal es demostrar el uso de interfaces y polimorfismo para calcular de manera unificada las multas por retraso en la devolución de diferentes recursos de la biblioteca (libros, revistas, tesis), cada uno con su propia tarifa o regla de penalización por día de atraso.

Clases y Componentes Utilizados
Prestable (Interfaz)

Propósito: Define el contrato obligatorio para cualquier material que pueda ser prestado. Declara el método abstracto double calcularMultaDemora(int diasAtraso) que estipula cómo debe calcularse el costo de la multa según los días de demora.

LibroPrestamo (Clase Concreta)

Propósito: Modela el préstamo de un libro. Implementa la interfaz definiendo una tarifa base específica por cada día de retraso aplicable a los libros.

RevistaPrestamo (Clase Concreta)

Propósito: Modela el préstamo de una revista. Sobrescribe el método de cálculo de multas implementando una penalización diferenciada (por ejemplo, una tarifa más baja o acelerada según el tipo de publicación).

TesisPrestamo (Clase Concreta)

Propósito: Modela el préstamo de una tesis académica o documento de investigación. Aplica su propia regla de negocio para el cálculo de la multa, reflejando el valor o la restricción particular de este material.

ControlVencimientos (Clase Coordinadora)

Propósito: Funciona como el administrador del sistema de devoluciones. Contiene el método procesarDevolucion(Prestable material, int dias) que acepta cualquier objeto que implemente la interfaz Prestable de manera polimórfica, permitiendo procesar el cálculo de la multa sin importar la clase concreta del recurso.
<img width="560" height="737" alt="Captura de pantalla 2026-10-29 152750" src="https://github.com/user-attachments/assets/2f311ace-63fa-40b1-b2e1-43a6451328ae" />
