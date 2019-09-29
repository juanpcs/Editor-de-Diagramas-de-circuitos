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

/**

 * Esta clase es la que permite relacionar las clases del modelo, con la interfaz grafica,ademas es la encargada de administar el funcionamiento de la lista

 * @author: Juan Pablo Carrillo Salazar

 * @version: java version "10.0.1" 2018-04-17 / Java(TM) SE Runtime Environment 18.3 (build 10.0.1+10)

 */

public class controlador {
	//Campos de la clase
	public Nodo inicio, Actual;
	int tamaño=0;
	int entrada, entrada2, salida;
	String salida2;
	Compuerta_Logica comp = new Compuerta_Logica();
	public AND AND= new AND();
	OR OR= new OR();
	NAND NAND = new NAND();
	NOR NOR = new NOR();
	NOT NOT = new NOT();
	XOR XOR = new XOR();
	XNOR XNOR = new XNOR();
	
	/**

	 * Constructor para la lista

	 */
	
	public controlador() {
		this.inicio=null;
		this.Actual=null;
		this.tamaño=0;
	}
	
	
	/**

     * Método que devuelve si hay o no compuertas en la lista

     * @return boolean si la lista es nula o no

     */
	public boolean sincompuertas(){// sin compuertas
		return(this.inicio==null);
		}
	
	/**

     * Método encargado de crear las compuertas e ingresarlas a la lista

     */
	public controlador ingresarcompuerta(Compuerta_Logica comp){
		
		Nodo nuevonodo = new Nodo(comp); 

		Nodo Compuerta =null;
		
	
		
       nuevonodo=new Nodo(comp) ;
        JOptionPane.showMessageDialog(null, "Salida: "+nuevonodo.dato.getSalida());
        
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
	
	/**

     * Método que muestra los datos de entradas y salidas de cada compuerta

     * @return resultado de la salida de la compuerta con determinads datos

     */ 
	
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
		else  str ="\n*************NO HAY COMPUERTAS**************";
		return str;
		
		}
	
	/**

     * Método que muestra las tablas de verdad de cada compuerta 

     * @return Tabla de verdad creada para cada compuerta

     */ 
	
	public String mostrart(){
		String str="";
		
		if(tamaño!=0){

			Nodo mide= inicio;
			
			if (mide!=null){ 
			for (int i=0;i<this.tamaño;i++){
			
			if (mide.dato.getTipo()=="AND") {
				str= str+ "Compuerta "+(i)+"\n"+
				AND.tabla()+"------------------------------\n";
			}
			if (mide.dato.getTipo()=="OR") {
				str= str+ "Compuerta "+(i)+"\n"+
				OR.tabla()+"------------------------------\n";
			}
			
			if (mide.dato.getTipo()=="NAND") {
				str= str+ "Compuerta "+(i)+"\n"+
				NAND.tabla()+"------------------------------\n";
			}
			if (mide.dato.getTipo()=="NOR") {
				str= str+ "Compuerta "+(i)+"\n"+
				NOR.tabla()+"------------------------------\n";
			}
			if (mide.dato.getTipo()=="NOT") {
				str= str+ "Compuerta "+(i)+"\n"+
				NOT.tabla()+"------------------------------\n";
			}
			
			if (mide.dato.getTipo()=="XOR") {
				str= str+ "Compuerta "+(i)+"\n"+
				XOR.tabla()+"------------------------------\n";
			}
			if (mide.dato.getTipo()=="XNOR") {
				str= str+ "Compuerta "+(i)+"\n"+
				XNOR.tabla()+"------------------------------\n";
			}
			
			
			mide=mide.siguiente;
			}
			str= "\nTablas de verdad de las compuertas\n"+ str;
			}}
		else  str ="\n*************NO HAY COMPUERTAS**************";
		return str;
		
		}

	
	/**

     * Método que permite seleccionar los datos de otras compuertas y utilizarlos para una compuerta nueva

     */ 
	
	public void selecdatos(int compuerta){
		int numero= Integer.parseInt(JOptionPane.showInputDialog("DATO ENTRADA 1\nDigite el numero de compuerta de la cual quiere usar el dato"));
		
		if(tamaño!=0 && numero<=(tamaño-1)){

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
			
			int numero2= Integer.parseInt(JOptionPane.showInputDialog("DATO ENTRADA 2\nDigite el numero de compuerta de la cual quiere usar el dato"));
			
			mide= inicio;
			
			for (int i=0;i!=numero2;i++){
				mide=mide.siguiente;
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
			
			ingresarcompuerta(new Compuerta_Logica(entrada,entrada2,salida(entrada, entrada2, compuerta),salida2(compuerta)));
			
			
			}}
		else  JOptionPane.showMessageDialog(null, "\n**LA LISTA SE ENCUENTRA VACIA O NO EXISTE ESE NUMERO DE COMPUERTA**");
		
		}
	
	/**

     * Método que devuelve el calculo de la salida de una compuerta segun el respectivo tipo de compuerta y sus datos

     * @return Resultado de la salida de la compuerta usada
     
     * @param entrada El parámetro entrada define la primera entrada de la compuerta
     * @param entrada2 El parámetro entrada define la segunda entrada de la compuerta
     * @param compuerta El parámetro compuerta define el tipo de compuerta utilizada

     */ 
	
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
	
	/**

     * Método que devuelve el tipo de compuerta a utilizar

     * @return tipo de compuerta
     
     * @param compuerta El parámetro compuerta define el tipo de compuerta utilizada

     */ 
	
public String salida2(int compuerta) {
		
		if (compuerta==1) {
	    salida2= "AND";
		}
		if (compuerta==2) {
		    salida2= "OR";
			}
		if (compuerta==3) {
		    salida2= "NAND";
			}
		if (compuerta==4) {
		    salida2= "NOR";
			}
		if (compuerta==5) {
		    salida2= "NOT";
			}
		if (compuerta==6) {
		    salida2= "XOR";
			}
		if (compuerta==7) {
		    salida2= "XNOR";
			}
		
		
		return salida2;
	}
	
	
}
