package Modelo;

import javax.swing.JOptionPane;

public class NOR extends Compuerta_Logica{
	
	Compuerta_Logica C = new Compuerta_Logica();
	int entrada1, entrada2, salida;

	public NOR() {
		
	}
	
	
	
    @Override
	public int resultado() {
    	
    	super.entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de la primera entrada"));
    	super.entrada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de la segunda entrada"));
    	
    	super.setEntrada(super.entrada);
    	super.setEntrada2(super.entrada2);
 
    if (super.entrada !=0 || super.entrada2 !=0) {
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

}
