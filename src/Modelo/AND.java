package Modelo;

import javax.swing.JOptionPane;

import Controlador.controlador;


public class AND extends Compuerta_Logica{
	Compuerta_Logica C = new Compuerta_Logica();
	controlador Con = new controlador();
	int entrada1, entrada2, salida;

	public AND() {
		
	}
	
	
	
    @Override
	public int resultado() {
    	super.entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de la primera entrada"));
    	super.entrada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de la segunda entrada"));
    	
    	super.setEntrada(super.entrada);
    	super.setEntrada2(super.entrada2);
 
    if (super.entrada !=1 || super.entrada2 !=1) {
    	super.salida=0;
    	super.setSalida(super.salida);	
    }
    else {
    	super.salida=1;
    	super.setSalida(super.salida);	
    	
    }
    
    return super.salida;
	
}
    
   public int entrada1() {
	   return super.entrada;
	   
   } 
   
   public int entrada2() {
	   return super.entrada2;
   }
    
  public int salida() {
	  return super.salida;
  }
    
    public String mostrar() {
    	return Con.mostrar();
    }

}
