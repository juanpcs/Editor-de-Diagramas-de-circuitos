package Modelo;

import javax.swing.JOptionPane;

/**

 * Esta clase es la NAND, la cual es una clase hija de compuerta logica, encargada del funcionamiento de la compuerta NAND

 * @author: Juan Pablo Carrillo Salazar

 * @version: java version "10.0.1" 2018-04-17 / Java(TM) SE Runtime Environment 18.3 (build 10.0.1+10)

 */

public class NAND extends Compuerta_Logica{
	
	//Campos de la clase
	Compuerta_Logica C = new Compuerta_Logica();
	
	/**

     * Constructor para la compuerta NAND

     */

	public NAND() {
		
	}
	
	/**

	 * Método que devuelve el calculo de la salida de la compuerta

	 * @return La salida determinada con base en las entradas

	 */
	
    @Override
	public int resultado() {
    	super.entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de la primera entrada"));
    	super.entrada2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de la segunda entrada"));
    	
    	super.setEntrada(super.entrada);
    	super.setEntrada2(super.entrada2);
 
    if (super.entrada !=1 || super.entrada2 !=1) {
    	super.salida=1;
    	super.setSalida(super.salida);	
    }
    else {
    	super.salida=0;
    	super.setSalida(super.salida);	
    	
    }
    
    return super.salida;
	
}
    
    /**

     * Método que devuelve el calculo de la salida de la compuerta

     * @return La salida determinada con base en las entradas
     
     *  @param ent1 El parámetro ent1 define la primera entrada a utilizar
     *  @param ent2 El parámetro ent2 define la segunda entrada a utilizar

     */
    
    @Override
    public int resultado2(int ent, int ent2) {
    	super.entrada = ent;
    	super.entrada2 = ent2;
    	
    	super.setEntrada(super.entrada);
    	super.setEntrada2(super.entrada2);
 
    if (super.entrada !=1 || super.entrada2 !=1) {
    	super.salida=1;
    	super.setSalida(super.salida);	
    }
    else {
    	super.salida=0;
    	super.setSalida(super.salida);	
    	
    }
    
    return super.salida;
	
}
    
    /**

     * Método que devuelve la tabla de verdad de la compuerta

     * @return La tabla creada para la compuerta

     */
    
    @Override
    public String tabla() {
    String tabla="INPUT  |	 OUTPUT\r\n" + 
 			"A	    B  	   A NAND B\r\n" + 
 			"0	    0	             1\r\n" + 
 			"0	    1	             1\r\n" + 
 			"1	    0	             1\r\n" + 
 			"1	    1   	          0\r\n" + 
 			"";
    return tabla;
    }
    
    /**

     * Método que devuelve la entrada1 de la compuerta

     * @return El dato asignado a la entrada1

     */
	
    public int entrada1() {
 	   return super.entrada;
 	   
    } 
    
    /**

     * Método que devuelve la entrada2 de la compuerta

     * @return El dato asignado a la entrada2

     */
    
    public int entrada2() {
 	   return super.entrada2;
    }
     

    /**

     * Método que devuelve la salida de la compuerta

     * @return El dato determinado para la salida de la compuerta

     */
    
   public int salida() {
 	  return super.salida;
   }	
	
	
	
}
