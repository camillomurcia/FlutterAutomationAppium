#language:es

Característica: Contador App

  Escenario: Incrementar contador
    Cuando Camilo incrementa el contador a 10
    Entonces el debe observar el contador en 10

  Escenario: Disminuir contador
    Dado que Camilo quiere incrementar el contador a 10
    Cuando el disminuye el contador a 4
    Entonces el debe observar el contador en 6

  Escenario: Reiniciar contador
    Dado que Camilo quiere incrementar el contador a 50
    Cuando el reinicia el contador
    Entonces el debe observar el contador en 0