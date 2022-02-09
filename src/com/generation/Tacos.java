package com.generation;

public class Tacos {
	//Atributos o caracteristicas de nuestra clase tacos
	/*String tipoDeTortilla;
	String tipoDeGuisado;
	int numeroDeTortilla;
	String tamanioDeTortilla;
	float precio=0;*/
	//ejercicio Encapsulacion
	private String tipoDeTortilla;
	private String tipoDeGuisado;
	private int numeroDeTortilla;
	private String tamanioDeTortilla;
	private float precio=0;
	
	//Constructor ayuda a inicializar un objeto implicito y explicito
	//java accede segun sean los parametros que damos y por ello adecua los constructores
	/*public Tacos() {
		
	}
	public Tacos(String tipoDeTortilla) {
		this.tipoDeTortilla=tipoDeTortilla;
	}
	public Tacos(String tipoDeTortilla, String tipoDeGuisado, int numeroDeTortilla, String tamanioDeTortilla, int precio) {
		//this se usa cuando hay ambiguedad
		this.tipoDeTortilla=tipoDeTortilla;
		this.tipoDeGuisado=tipoDeGuisado;
		this.numeroDeTortilla=numeroDeTortilla;
		this.tamanioDeTortilla=tamanioDeTortilla;
		this.precio=precio;
		
	}*/
	//getters y setters del ejercicio
	public String getTipoDeTortilla(){
		return this.tipoDeTortilla;
	}	
	public String getTipoDeGuisado(){
		return this.tipoDeGuisado;
	}
	public int getNumeroDeTortilla() {
		return this.numeroDeTortilla;
	}
	public String getTamanioDeTortilla() {
		return this.tamanioDeTortilla;
	}
	public float getPrecio() {
		return this.precio;
	}
	//
	public void setTipoDeTortilla(String tipoDeTortilla){
		this.tipoDeTortilla=tipoDeTortilla;
	}	
	public void setTipoDeGuisado(String tipoDeGuisado){
		this.tipoDeGuisado=tipoDeGuisado;
	}
	public void setNumeroDeTortilla(int numeroDeTortilla) {
		if(numeroDeTortilla>=0 && numeroDeTortilla<3) {
			this.numeroDeTortilla=numeroDeTortilla;
		}else {
			throw new IllegalArgumentException("El numero de tortillas no es valido");
		}
		
	}
	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}
	
	/*public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla=tamanioDeTortilla;
	}
	public void setPrecio(float precio) {
		this.precio=precio;
	}
	
	void preparar() {
		System.out.println("Preparando tu taco :P");
	}
	void vender() {
		System.out.println("Taco vendido");
	}
	void ponerSalsa() {
		System.out.println("Agregando salsa de la que pica :P");
	}
	void subirPrecio(float aumento) {
		precio = precio + aumento;
	}
	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}*/
	//click derecho, source, generate to string los campos
	
}
