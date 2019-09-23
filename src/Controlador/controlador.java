package Controlador;

import Modelo.Nodo;


import javax.swing.JOptionPane;

import Modelo.Compuerta_Logica;


public class controlador {
	public Nodo inicio, Actual;
	int tamaño=0;
	Compuerta_Logica comp = new Compuerta_Logica();
	
	public controlador() {
		this.inicio=null;
		this.Actual=null;
		this.tamaño=0;
	}
	
	public boolean sincompuertas(){// sin compuertas
		return(this.inicio==null);
		}
	
	public controlador ingresarcompuerta(Compuerta_Logica comp){
		
		Nodo nuevonodo = new Nodo(comp); 

		Nodo Compuerta =null;
		
	
		
       nuevonodo=new Nodo(comp) ;
        JOptionPane.showMessageDialog(null, "FICHA: "+nuevonodo.dato.getSalida());
        
        if (sincompuertas()){
        	this.inicio= nuevonodo;
        	}
        	else {
        	Compuerta=inicio;

        	

        	while (Compuerta.siguiente!=null){
        	Compuerta=Compuerta.siguiente; //
        	}
        	Compuerta.siguiente= nuevonodo;
        	}
        	this.tamaño++;
			return this;
		
}

	
	
	
	
	
	


}
