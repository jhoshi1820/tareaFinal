1. En el primer disenio, parecia que el modelo daba solucion a todos los problemas de disenio.
2. En la pagina 2, al aniadir el metodo fly, nos damos cuenta de q no todos los patos realizan esta accion y
como herencia te obliga a implementar ese metodo, todos los patos por defecto tienen que implementar ese metodo.
3. Respuesta cuestionario pag 5: A. D. F.
4. En la pag. 6, al implementar una interface nos damos cuenta de que si bien tenemos el comportamiento separado(Flyable and Quackable) en
el caso de que quisieramos aniadir mas patos, tendriamos que implementar los comportamientos para cada tipo de pato que existiria, dando lugar
a repetir el codigo.
5. La solucion de la pag. 10 nos permite definir el comportamiento general de los patos en 2 clases QuackingBehavior y FlyingBehavior. Con este
planteamiento lograriamos implementar el principio de single responsability, donde cada interface tendria tan solo una razon de existir sin
tomar en cuenta el comportamiento de cada tipo de pato.
6. En la pagina 11 y 13 se empieza con la segregacion de interfaces permitiendo agrupar los comportamientos de todos los patos en general
en lugar de definir cada comportamiento en cada tipo de pato, con esto se evitaria crear mucho codigo duplicado. Ademas de que tambien
aplica el principio de inversion de dependencias las clases como FlyNoWay dependen de FlyBehavior y esta a su vez deja de depender de las
subclases.
7. En la pag. 15, implementa los metodos performQuack y performFly. Los cuales usan metodos definidos en variables de tipo interfaz. Esta
parte considero que es la esencia del programa, ya que gracias a este truco se puede modelar implementar el comportamiento quack y fly
 para cualquier tipo de pato ya que por cada pato existe ya definido una instancia del FlyBehavior y de QuackBehavior, dando lugar a q
 la clase hija de Duck solo defina el tipo de vuelo y la forma de emitir el sonido a traves de la delegacion que se realiza en la pag. 18.
8. Bueno para terminar simplemente se define en cada constructor de las clases hijas de Duck, el comportamiento esperado de la clase, en
el caso de que se requiera cambiar el comportamiento en la pag.20 crea metodos donde se puede modificarlo.
