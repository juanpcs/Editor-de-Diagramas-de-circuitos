package Controlador;

import Modelo.Nodo;


import javax.swing.JOptionPane;

import Modelo.Compuerta_Logica;


public class controlador {
	public Nodo inicio, Actual;
	int tama�o=0;
	Compuerta_Logica comp = new Compuerta_Logica();
	
	public controlador() {
		this.inicio=null;
		this.Actual=null;
		this.tama�o=0;
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
        	this.tama�o++;
			return this;
		
}
	public String mostrar(){
		String str="";
		
		if(tama�o!=0){

			Nodo mide= inicio;
			
			if (mide!=null){ 
			for (int i=0;i<this.tama�o;i++){
			str= str+ mide.dato.getSalida()+"\n";

			mide=mide.siguiente;
			}
			str= "\nPIAL S.A "+"\nFichas de clientes\n"+ str;
			}}
		else  str ="\n*****************LA LISTA SE ENCUENTRA VACIA***************";
		return str;
		
		}

	
	
	
	
	
	


}
