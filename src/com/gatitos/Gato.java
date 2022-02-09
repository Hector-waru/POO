package com.gatitos;

public class Gato {
	//atributos
	private String nombre;
	private int patas;
	private boolean adoptado;
	//getters y setters
	//Estos deben ser publicos por convencion
	public String getNombre() {//valor a regresar
		return this.nombre;
	}
	public void setNombre(String nombre) {//modificar
		this.nombre=nombre;
	}
	
	public int getPatas() {
		return this.patas;
	}
	public void setPatas(int patas) {
		if(patas>=0 && patas<5) {
			this.patas=patas;
		}else {
			throw new IllegalArgumentException("El numero de patas no es valido");
		}
		//this.patas=patas;
		
	}
	public boolean isAdoptado() {
		return this.adoptado;
	}
	public void setAdoptado(boolean adoptado) {
		this.adoptado=adoptado;
		
	}
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + ", adoptado=" + adoptado + "]";
	}
	
	
	
}
