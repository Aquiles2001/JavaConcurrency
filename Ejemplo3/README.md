# Ejemplo 3: Semaphores

El siguiente código simula una cola de impresión. Diez hilos deben imprimir documentos en la
misma impresora (la impresora es el recurso compartido). Para imprimir un documento, la impresora
demora un cierto tiempo, durante el cual el hilo que está imprimiendo tendrá control sobre esta. Se
mostrará un mensaje indicando que un documento de un hilo n se está imprimiendo y cuánto tiempo
demorará esta operación (y se mandará a dormir a dicho hilo durante este tiempo).

Además, los hilos mostrarán un mensaje por consola cuando estén a punto de enviar un docu-
mento a imprimir (para hacer esto no requieren ningún recurso compartido más que tiempo de pro-
cesador, es decir mostrarán estos mensajes en el orden aleatorio en el que se ejecuten sin control
de ningún tipo) y también mostrarán un mensaje cuando hayan terminado de imprimir el documento
(para el funcionamiento sea correcto, para cada hilo se debe visualizar primero el aviso de impresión,
luego el aviso de que se está imprimiendo junto con el tiempo de impresión y luego el aviso de fin de
impresión).

Los hilos se implementarán mediante la clase “Job” (que implementa Runnable) y el semáforo será
una variable privada de la clase PrintQueue (cuando se crea un objeto de esta clase, se inicializa
esta variable como semáforo binario en el constructor).
