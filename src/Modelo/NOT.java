package Modelo;

import javax.swing.JOptionPane;

/**

 * Esta clase es la NOT, la cual es una clase hija de compuerta logica, encargada del funcionamiento de la compuerta NOT
 * @author: Juan Pablo Carrillo Salazar

 * @version: java version "10.0.1" 2018-04-17 / Java(TM) SE Runtime Environment 18.3 (build 10.0.1+10)

 */

public class NOT extends Compuerta_Logica{
	//Campos de la clase
	Compuerta_Logica C = new Compuerta_Logica();
	
	/**

     * Constructor para la compuerta NOT

     */
	
	public NOT() {
		
	}
	
	/**

	 * Método que devuelve el calculo de la salida de la compuerta

	 * @return La salida determinada con base en las entradas

	 */
	
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
    
    /**

     * Método que devuelve el calculo de la salida de la compuerta

     * @return La salida determinada con base en las entradas
     
     *  @param ent1 El parámetro ent1 define la primera entrada a utilizar
     *  @param ent2 El parámetro ent2 define la segunda entrada a utilizar

     */
    
    @Override
	public int resultado2(int ent, int ent2) {
    	
    	super.entrada = ent;
    	
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
    /**

     * Método que devuelve la tabla de verdad de la compuerta

     * @return La tabla creada para la compuerta

     */
    
    @Override
    public String tabla() {
    String tabla="INPUT | OUTPUT\r\n" + 
 			"A  	     NOT A\r\n" + 
 			"0	             1\r\n" + 
 			"1	             0\r\n" + 
 			
 			"";
    return tabla;
    }
    
    /**

     * Método que devuelve la entrada de la compuerta

     * @return El dato asignado a la entrada

     */
    public int entrada1() {
 	   return super.entrada;
 	   
    } 
    
    /**

     * Método que devuelve la salida de la compuerta

     * @return El dato determinado para la salida de la compuerta

     */
   public int salida() {
 	  return super.salida;
   }

}
