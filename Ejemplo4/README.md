# Ejemplo 4: Semaphores

Siguiendo el ejemplo anterior, ahora se pasa a disponer de tres impresoras (tres recursos), por lo
que el semáforo se inicializa en 3. Se tiene además un array de booleanos freePrinters que indica si
las impresoras están libres o no y para proteger esta variable se define además un ReentrantLock
llamado lockPrinters. Cuando un hilo intenta imprimir, se le asignará una de las tres impresoras mediante
el método getPrinter() (que está protegido por el lockPrinters). De esta manera en el bloque delimitado
por el acquire() y el release() del semáforo podrán entrar tres hilos a la vez pero sólo un hilo podrá
ejecutar el bloque delimitado por lockPrinters.lock(); y lockPrinters.unlock() asegurando así que cada
impresora este siendo utilizada como máximo por un hilo a la vez.
