# Ejemplo 5: ContDownLatch

Se tendrá un hilo que representa la conferencia propiamente dicha asociado a un objeto de una
clase llamada Videoconference y diez hilos que representarán diez participantes (asociados a objetos
de la clase Participant). En el objeto de Videoconference (llamado conference) se inicializará me-
diante el constructor un CountDownLatch llamado controller con el valor diez, indicando que deben
realizarse diez operaciones para que su contador llegue a cero. El código del método run() de con-
ference no se ejecutará hasta que se realicen las diez operaciones ya que contiene la instrucción
controller.await();

Los participantes por su parte ejecutarán conference.arrive() luego de haber dormido durante un
tiempo aleatorio. En el método arrive() de la clase Videoconference se ejecuta controller.countDown()
de manera que los hilos asociados a los participantes irán decrementando el contador del Count-
DownLatch y cuando este sea cero el hilo asociado a la conferencia podrá seguir con su ejecución.
