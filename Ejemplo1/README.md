# Ejemplo de mal manejo de memoria compartida

El siguiente código consta de 4 clases

- Variable
- Process1
- Process2
- Main

En la clase Variable se definen 3 variables compartidas, las cuales son modificadas por los procesos 1 y 2. El proceso 1 modifica la variable 1 y el proceso 2 modifica la variable 2. El proceso 1 y 2 modifican la variable 3.

La variable a la que le prestaremos mas atención es inCritical, ya que es la que se modifica por ambos procesos. A la cual se le asigna un valor de 0 y se le suma y resta uno en cada ciclo de los procesos 1 y 2 respectivamente. Si no tuvieramos en cuenta la sincronización de los procesos, el valor de inCritical debería ser 0, ya que se le suma y resta 1 en cada ciclo. Pero si ejecutamos el programa, el valor de inCritical en un momento llega a ser 1. Esto se debe a que no se sincronizan los hilos, por lo que el valor de inCritical se modifica por ambos hilos al mismo tiempo.

Resultando asi en que el programa es inconsistente, ya que el valor de inCritical no es el esperado.

> [!NOTE]
> ver estos efectos puede tardar bastante tiempo.
