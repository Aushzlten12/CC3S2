## Comparacion entre Rspec y JUnit

### JUnit

Al crear pruebas en JUnit, se tuvieron que crear clases, importando ciertos paquetes y añadiendo dependencias. Sin embargo, su sintaxis es similar ya que se usan clases, y se usan métodos como el assert, además, hay acciones que se pueden ejecutar antes y después de los test. Y por supuesto, se separan en carpetas tales como main para las clases para ejecutar el programa, y en la carpesta test que se encuentran, las pruebas.

### Rspec

Al crear pruebas en Rspec, al igual que en Java, se separan las clases de ejucion y los test en dos carpetas, la carpeta lib para las clases que se ejecutarán en producción, y en spec, los test. Y además, también necesita de dependencias como bundle y un archivo Gemfile. Sin embargo, a diferencia de Java, hay una marcada diferencia en sintaxis entre los archivos en lib y en spec. Ya que para los test se usan palabras como DESCRIBE, IT, CONTEXT. Y su metodo similar al ASSERT en Java, es EXPECT... TO EQL. 