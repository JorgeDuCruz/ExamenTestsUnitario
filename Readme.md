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
* Dentro del IDEA clic derecho en el directorio `test` y `Mark Directory as Test source Root`

### Una vez creada la carpeta `test` crearemos las clases `test`
Para ello usaremos la herramienta para generarlo que nos deja el propio IDEA
* Clic derecho en la clase que queramos testear
* Presionamos la opcion `generate test` dentro de `generate`
* Seleccionamos JUnit5 y presionamos el boton `Fix`
* Por ultimo seleccionamos los metodos que queremos testear y presionamos el boton de OK

### Test de calcularLetraDni
Para testear esta clase simplemente probe dnis desde 00000000 hasta el 00000022 que son los 23 restos distintos que puede tener un DNI para saber su letra.
Para saber a que numero le corresponde cada letra se puede buscar en google facilmente.

Obviamente dado que son muchos casos lo preferible es hacerlo mediante `@ParameterizedTest` 

### Test de comprobarDNI
Para testear esta clase simplemente use los mismos datos que use para testear la clase anterior pero añadiendo el valor true, ya que todos deberian ser correctos, 
ademas de agregar un dni con letra incorrecta para asegurarme de que no de simepre true.

### Una vez hechos los Test
#### calcularLetraDNI
Despues de realizar los **tests** saltan dos errores, la letras **Q** devuelve que deberia se la **S**
y al reves. Lo mas probable es que al crear el metodo cambiaran de lugar ambas letras por lo que con cambiar las letras entre si deberia bastar

#### comprobarDNI
Despues de realizar los **tests** saltan dos erroress, exactamente en los mismos mometos donde salta `calcularLetraDNI` por lo que lo más probale es que sea un error arrrastrado de dicho metodo y que con arreglar ese metodo tambien se arregle este.

