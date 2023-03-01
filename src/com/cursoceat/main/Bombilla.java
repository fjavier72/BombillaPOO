package com.cursoceat.main;

public class Bombilla {

	// Atributos
	public static boolean interruptorGeneral = true;
	private boolean interruptor;
	
	// Constructor por defecto inicializa el atributo 'interruptor'
	public Bombilla() {
		this.interruptor = false;
	}
	
	// Método para encender o apagar la bombilla
	public void encenderApagar(boolean modificar) {
		this.interruptor = modificar;
	}
	
	// Método que nos informa del estado general
	public boolean estadoGeneral() {
		return interruptorGeneral && this.interruptor;
	}
	
	public boolean estadoIndividual() {
		return this.interruptor;
	}
	
	// Método para mostrar el estado
	public String mostrarEstado() {
		return estadoGeneral() ? "encendido/a" : "apagado/a";
	}
	
}
