## Examen de Test Unitarios

---

### Enunciado

Con el código de este repositorio realiza:

- (*4 puntos*) Los test unitarios de los **dos** métodos, utiliza test **parametrizados**. Suponiendo que la `string` DNI, siempre es un DNI válido.
- (*2 puntos*) En el código, hay un error, ¿lo pudiste comprabar en los test? ¿Plantea la solución?
- (*3 puntos*) Si no hubiera una comprobación previamente encuanto a la longitud de la `string` del DNI, ¿Qué hay que cambiar en los tests para que comprueben estos casos?

Entrega tu repositorio con el código y los test. Además un `Readme` explicando y justificando cada apartado

Formato del `Readme` *1 punto*

---

## Pasos para crear los tests
### Primero debemos crear la carpeta donde guardaremos los tests
Para esto seguiremos los siguientes pasos
* Creamos un directorio al nivel del directorio src y lo llamamos test
* Dentro del IDEA clic derecho en el directorio `test` y seleccionamos `Mark Directory as Test source Root`

### Una vez creada la carpeta `test` crearemos las clases `test`
Para ello usaremos la herramienta para generarlo que nos deja el propio IDEA
* Clic derecho una vez dentro de la clase que queramos testear
* Presionamos la opcion `generate test` dentro de `generate`
* Seleccionamos JUnit5 y ,en caso de aparecer, presionamos el botón `Fix`
* Por ultimo seleccionamos los métodos que queremos testear y presionamos el botón de OK

### Test de calcularLetraDni
Para testear esta clase simplemente probé DNI's desde 00000001 hasta el 00000023 que son las 23 letras distintas que puede tener un DNI.
Para saber a que numero le corresponde cada letra se puede buscar en google facilmente.

Obviamente dado que son muchos casos lo preferible es hacerlo mediante `@ParameterizedTest` 

### Test de comprobarDNI
Para testear esta clase simplemente use los mismos datos que use para testear la clase anterior pero añadiendo el valor true, ya que todos deberian ser correctos, 
ademas de agregar un dni con letra incorrecta para asegurarme de que no dé simepre true.

### Una vez hechos los Test
#### calcularLetraDNI
Despues de realizar los **tests** saltan dos errores, la letras **Q** devuelve que deberia se la **S**
y al reves. Lo mas probable es que al crear el método cambiaran de lugar ambas letras por lo que con cambiar las letras entre si deberia bastar

#### comprobarDNI
Despues de realizar los **tests** saltan dos errores, exactamente en los mismos momentos donde salta `calcularLetraDNI` por lo que lo más probable es que sea un error arrrastrado de dicho método y que con arreglar ese método tambien se arregle este.

### Caso de no comprobar longitud del String
Si no se asume que el DNI tendra los 8 numeros los **tests** deberian añadir casos donde el DNI tenga una **longitud menor a 8** y un caso para **longitudes superiores a 8**, en ambos casos esperariamos respuestas de los **métodos** que indiquen que algo no esta bien  