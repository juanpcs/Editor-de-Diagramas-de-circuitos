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

 * @param entrada El par�metro entrada define la primera entrada de la compuerta
 * @param entrada2 El par�metro entrada2 define la segunda entrada de la compuerta
 * @param salida El par�metro salida define la salida de la compuerta
 * @param tipo El par�metro tipo define el tipo de compuerta

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

 * M�todo que devuelve la entrada2

 * @return El dato asignado a la entrada

 */

public int getEntrada2() {
	return entrada2;
}

/**

 * M�todo que fija la entrada2
 * @param entrada2 El par�metro entrada define la entrada a fijar

 */

public void setEntrada2(int entrada2) {
	this.entrada2 = entrada2;
}

/**

 * M�todo que devuelve el tipo de dato

 * @return El tipo de compuerta asignado

 */


public String getTipo() {
	return tipo;
}

/**

 * M�todo que fija el tipo de compuerta
 * @param String tipo El par�metro tipo define la entrada a fijar

 */

public void setTipo(String tipo) {
	this.tipo = tipo;
}

/**

 * M�todo que devuelve la entrada1

 * @return El dato asignado a la entrada1

 */

public int getEntrada() {
	return entrada;
}

/**

 * M�todo que fija la entrada1
 * @param entrada El par�metro entrada define la entrada a fijar

 */

public void setEntrada(int entrada) {
	this.entrada = entrada;
}

/**

 * M�todo que devuelve la salida de la compuerta

 * @return la salida determinada de la compuerta

 */

public int getSalida() {
	return salida;
}

/**

 * M�todo que fija la salida de la compuerta
 * @param entrada El par�metro salida define la salida a fijar

 */

public void setSalida(int salida) {
	this.salida = salida;
}

/**

 * M�todo que devuelve el calculo de la salida de la compuerta

 * @return La salida determinada con base en las entradas

 */

public int resultado() {
return salida;
	
}

/**

 * M�todo que devuelve el calculo de la salida de la compuerta

 * @return La salida determinada con base en las entradas
 
 *  @param ent1 El par�metro ent1 define la primera entrada a utilizar
 *  @param ent2 El par�metro ent2 define la segunda entrada a utilizar

 */

public int resultado2(int ent,int ent2) {
	return salida;
}

/**

 * M�todo que devuelve la tabla de verdad de la compuerta

 * @return La tabla creada para la compuerta

 */

public String tabla() {
	String tabla="";
	return tabla;
}

/**

 * M�todo que devuelve los datos de entradas y salida asignados a la compuerta

 * @return La entrada1, entrada2 y salida de la compuerta

 */

public String respuesta() {
	String datos="";
	datos= "\nEntrada 1: "+getEntrada()+ "\nEntrada 2: "+getEntrada2()+"\nSalida: "+getSalida()+"\n-----------------------------------";
	return datos;
	}

	
}//Cierre de la clase
