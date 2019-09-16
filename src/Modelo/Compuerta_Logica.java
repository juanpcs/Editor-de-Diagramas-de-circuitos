package Modelo;

public class Compuerta_Logica{
	
protected int entrada;
protected int entrada2;
protected int salida;

public Compuerta_Logica() {
	
}

public int getEntrada2() {
	return entrada2;
}

public void setEntrada2(int entrada2) {
	this.entrada2 = entrada2;
}

public Compuerta_Logica(int entrada, int salida) {
	
	this.entrada = entrada;
	this.salida = salida;
}

public int getEntrada() {
	return entrada;
}

public void setEntrada(int entrada) {
	this.entrada = entrada;
}

public int getSalida() {
	return salida;
}

public void setSalida(int salida) {
	this.salida = salida;
}


public int resultado() {
return salida;
	
}

	
	

}
