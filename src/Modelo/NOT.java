package Modelo;

import javax.swing.JOptionPane;

public class NOT extends Compuerta_Logica{
	
	Compuerta_Logica C = new Compuerta_Logica();
	int entrada1, entrada2, salida;

	public NOT() {
		
	}
	
	
	
    @Override
	public int resultado() {
    	
    	super.entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de la primera entrada"));
    	
    	super.setEntrada(super.entrada);
    	
 
    if (super.entrada ==0) {
    	super.salida=1;
    	super.setSalida(super.salida);	
    }
    else {
    	super.salida=0;
    	super.setSalida(super.salida);	
    	
    }
    
    return super.salida;
	
}

}
