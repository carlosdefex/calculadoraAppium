# language: es
Característica: Operar calculadora

  Esquema del escenario: Operación Suma
    Cuando se suman los siguientes numeros <numero1> <numero2>
    Entonces el resultado sera <resultado>
    Ejemplos:
      | numero1 | numero2 | resultado |
      | 5       | 6       | 11        |

  Esquema del escenario: Operación Resta
    Cuando se restan los siguientes numeros <numero1> <numero2>
    Entonces el resultado sera <resultado>
    Ejemplos:
      | numero1 | numero2 | resultado |
      | 4       | 1       | 3         |

  Esquema del escenario: Operación Multiplicación
    Cuando se multiplican los siguientes numeros <numero1> <numero2>
    Entonces el resultado sera <resultado>
    Ejemplos:
      | numero1 | numero2 | resultado |
      | 1       | 9       | 9         |

  Esquema del escenario: Operación División
    Cuando se dividen los siguientes numeros <numero1> <numero2>
    Entonces el resultado sera <resultado>
    Ejemplos:
      | numero1 | numero2 | resultado |
      | 8       | 2       | 4       |