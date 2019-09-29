package Modelo;

/**

 * Esta clase es la clase principal, la cual crea cada una de las distintas compuertas a utilizar

 * @author: Juan Pablo Carrillo Salazar

 * @version: java version "10.0.1" 2018-04-17 / Java(TM) SE Runtime Environment 18.3 (build 10.0.1+10)

 */

public class Compuerta_Logica{
	
//Campos de la clase
	
protected int entrada;
protected int entrada2;
protected int salida;
protected String tipo;

/**

 * Constructor para las compuertas

 * @param entrada El parámetro entrada define la primera entrada de la compuerta
 * @param entrada2 El parámetro entrada2 define la segunda entrada de la compuerta
 * @param salida El parámetro salida define la salida de la compuerta
 * @param tipo El parámetro tipo define el tipo de compuerta

 */

public Compuerta_Logica(int entrada, int entrada2, int salida, String tipo) {
	this.entrada = entrada;
	this.entrada2 = entrada2;
	this.salida = salida;
	this.tipo = tipo;
} //Cierre del constructor

/**

 * Constructor para las compuertas

 */

public Compuerta_Logica() {}



/**

 * Método que devuelve la entrada2

 * @return El dato asignado a la entrada

 */

public int getEntrada2() {
	return entrada2;
}

/**

 * Método que fija la entrada2
 * @param entrada2 El parámetro entrada define la entrada a fijar

 */

public void setEntrada2(int entrada2) {
	this.entrada2 = entrada2;
}

/**

 * Método que devuelve el tipo de dato

 * @return El tipo de compuerta asignado

 */


public String getTipo() {
	return tipo;
}

/**

 * Método que fija el tipo de compuerta
 * @param String tipo El parámetro tipo define la entrada a fijar

 */

public void setTipo(String tipo) {
	this.tipo = tipo;
}

/**

 * Método que devuelve la entrada1

 * @return El dato asignado a la entrada1

 */

public int getEntrada() {
	return entrada;
}

/**

 * Método que fija la entrada1
 * @param entrada El parámetro entrada define la entrada a fijar

 */

public void setEntrada(int entrada) {
	this.entrada = entrada;
}

/**

 * Método que devuelve la salida de la compuerta

 * @return la salida determinada de la compuerta

 */

public int getSalida() {
	return salida;
}

/**

 * Método que fija la salida de la compuerta
 * @param entrada El parámetro salida define la salida a fijar

 */

public void setSalida(int salida) {
	this.salida = salida;
}

/**

 * Método que devuelve el calculo de la salida de la compuerta

 * @return La salida determinada con base en las entradas

 */

public int resultado() {
return salida;
	
}

/**

 * Método que devuelve el calculo de la salida de la compuerta

 * @return La salida determinada con base en las entradas
 
 *  @param ent1 El parámetro ent1 define la primera entrada a utilizar
 *  @param ent2 El parámetro ent2 define la segunda entrada a utilizar

 */

public int resultado2(int ent,int ent2) {
	return salida;
}

/**

 * Método que devuelve la tabla de verdad de la compuerta

 * @return La tabla creada para la compuerta

 */

public String tabla() {
	String tabla="";
	return tabla;
}

/**

 * Método que devuelve los datos de entradas y salida asignados a la compuerta

 * @return La entrada1, entrada2 y salida de la compuerta

 */

public String respuesta() {
	String datos="";
	datos= "\nEntrada 1: "+getEntrada()+ "\nEntrada 2: "+getEntrada2()+"\nSalida: "+getSalida()+"\n-----------------------------------";
	return datos;
	}

	
}//Cierre de la clase
