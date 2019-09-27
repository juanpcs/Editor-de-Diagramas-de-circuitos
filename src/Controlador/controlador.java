package Controlador;

import Modelo.Nodo;
import Modelo.OR;
import Modelo.XNOR;
import Modelo.XOR;
import Modelo.AND;

import javax.swing.JOptionPane;

import Modelo.Compuerta_Logica;
import Modelo.NAND;
import Modelo.NOR;
import Modelo.NOT;


public class controlador {
	public Nodo inicio, Actual, fin;
	int tamaño=0;
	int entrada, entrada2, salida;
	Compuerta_Logica comp = new Compuerta_Logica();
	public AND AND= new AND();
	OR OR= new OR();
	NAND NAND = new NAND();
	NOR NOR = new NOR();
	NOT NOT = new NOT();
	XOR XOR = new XOR();
	XNOR XNOR = new XNOR();
	
	public controlador() {
		this.inicio=null;
		this.Actual=null;
		this.fin=null;
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
	public String mostrar(){
		String str="";
		
		if(tamaño!=0){

			Nodo mide= inicio;
			
			if (mide!=null){ 
			for (int i=0;i<this.tamaño;i++){
			str= str+ "Compuerta "+(i)+"\n"+
			mide.dato.respuesta()+"\n";

			mide=mide.siguiente;
			}
			str= "\nDatos de compuertas\n"+ str;
			}}
		else  str ="\n*****************LA LISTA SE ENCUENTRA VACIA***************";
		return str;
		
		}
	
	public void selecdatos(int compuerta){
		int numero= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de compuerta de la cual quiere usar los datos"));
		
		if(tamaño!=0 && numero<=tamaño){

			Nodo mide= inicio;
			
			if (mide!=null){ 
			for (int i=0;i!=numero;i++){
			mide=mide.siguiente;
			}
			
			int dato = Integer.parseInt(JOptionPane.showInputDialog("¿Cual dato desea usar para la entrada 1?\n 1) Entrada1\n 2) Entrada2\n 3) Salida"));
			if (dato==1) {
			entrada=mide.dato.getEntrada();	
			}
			if (dato==2) {
			entrada=mide.dato.getEntrada2();	
			}
			if (dato==3) {
			entrada=mide.dato.getSalida();	
			}
			
			int dato2= Integer.parseInt(JOptionPane.showInputDialog("¿Cual dato desea usar para la entrada 2?\n 1) Entrada1\n 2) Entrada2\n 3) Salida"));
			if (dato2==1) {
			entrada2=mide.dato.getEntrada();	
			}
			if (dato2==2) {
			entrada2=mide.dato.getEntrada2();	
			}
			if (dato2==3) {
			entrada2=mide.dato.getSalida();	
			} 
			
			ingresarcompuerta(new Compuerta_Logica(entrada,entrada2,salida(entrada, entrada2, compuerta)));
			
			
			}}
		else  JOptionPane.showMessageDialog(null, "\n**LA LISTA SE ENCUENTRA VACIA O NO EXISTE ESE NUMERO DE COMPUERTA**");
		
		
		}
	
	public int salida(int entrada, int entrada2, int compuerta) {
		
		if (compuerta==1) {
	    salida= AND.resultado2(entrada, entrada2);
		}
		if (compuerta==2) {
		    salida= OR.resultado2(entrada, entrada2);
			}
		if (compuerta==3) {
		    salida= NAND.resultado2(entrada, entrada2);
			}
		if (compuerta==4) {
		    salida= NOR.resultado2(entrada, entrada2);
			}
		if (compuerta==5) {
		    salida= NOT.resultado2(entrada, entrada2);
			}
		if (compuerta==6) {
		    salida= XOR.resultado2(entrada, entrada2);
			}
		if (compuerta==7) {
		    salida= XNOR.resultado2(entrada, entrada2);
			}
		
		
		return salida;
	}
	
	
	

	/*public String buscar2() 
	{
		String salida="";	
		int dato= Integer.parseInt(JOptionPane.showInputDialog("Digite el DNI del cliente"));	
	if (inicio!=null) {
	Nodo actual;

	actual=inicio;

	while (actual!=null && actual.dato.C.getDNI() != dato){
		actual=actual.siguiente;
	}

	if (actual==null) {
		salida = "el DNI no existe";
		 
	}

	else if(actual.dato.C.getDNI()==dato) {
		salida =salida+ actual.dato.respuesta();
		
	}

	else{
		salida =salida+ actual.dato.respuesta();
			
		}

	}
	return salida;	
	}
	
	*/
	
	
	


}
