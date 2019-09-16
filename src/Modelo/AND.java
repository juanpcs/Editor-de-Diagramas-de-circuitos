package Modelo;

import javax.swing.JOptionPane;


public class AND extends Compuerta_Logica{
	Compuerta_Logica C = new Compuerta_Logica();
	int entrada1, entrada2, salida;

	public AND() {
		
	}
	
	
	
    @Override
	public int resultado() {
    	super.entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de la primera entrada"));
    	super.entrada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de la segunda entrada"));
    	super.setEntrada(entrada1);
    	super.setEntrada2(entrada2);
    if (super.entrada !=1 || super.entrada2 !=2) {
    	super.salida=0;
    	super.setSalida(super.salida);	
    }
    else {
    	super.salida=1;
    	super.setSalida(super.salida);	
    	
    }
    
    return salida;
	
}

}
