package Modelo;

public class Nodo extends Compuerta_Logica{
	public Compuerta_Logica dato;
	public Nodo siguiente;
	
	public Nodo(Compuerta_Logica CL) {
		this.dato = CL;
		
	}

	public Compuerta_Logica getDato() {
		return dato;
	}

	public void setDato(Compuerta_Logica dato) {
		this.dato = dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	
	

}
