package Modelo;

/**

 * Esta clase es la que crea los nodos

 * @author: Juan Pablo Carrillo Salazar

 * @version: java version "10.0.1" 2018-04-17 / Java(TM) SE Runtime Environment 18.3 (build 10.0.1+10)

 */

public class Nodo extends Compuerta_Logica{
	//Campos de la clase
	public Compuerta_Logica dato;
	public Nodo siguiente;
	
	/**

	 * Constructor para el nodo

	 */
	public Nodo(Compuerta_Logica CL) {
		this.dato = CL;
		
	}
	
	/**

     * Método que devuelve el dato del nodo

     * @return El dato asignado al nodo

     */

	public Compuerta_Logica getDato() {
		return dato;
	}
	
	/**

	 * Método que fija el dato que almacenara el nodo
	 * @param dato El parámetro dato define el dato a fijar

	 */

	public void setDato(Compuerta_Logica dato) {
		this.dato = dato;
	}
	
	/**

     * Método que devuelve la referencia al nodo siguiente

     * @return Referencia al nodo siguiente

     */

	public Nodo getSiguiente() {
		return siguiente;
	}
	
	/**

	 * Método que fija la referencia al nodo siguiente
	 * @param siguiente El parámetro siguiente define la referencia a fijar

	 */

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	
	

}
