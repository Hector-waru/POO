package com.generation;

public class Main {
public static void main(String[] args) {
	//creacion del objeto
	//el objeto esta inicializado asi que le pasamos sus valores
	/*Tacos taco1 = new Tacos("Masa Azul", "suadero",2,"mediana",30);
    System.out.println(taco1.toString());
    
    Tacos taco3 = new Tacos("Maiz");
    System.out.println(taco3);*/
	/*taco1.tipoDeTortilla="Masa azul";
	taco1.tipoDeGuisado="Suadero";
	taco1.numeroDeTortilla=2;
	taco1.tamanioDeTortilla="Mediana";
	taco1.precio=30;
	
	//cada objeto se hace responsable de sus atributos
	Tacos taco2 = new Tacos();
	taco2.tipoDeTortilla="Harina";
	taco2.tipoDeGuisado="Bisteck";
	taco2.numeroDeTortilla=2;
	taco2.tamanioDeTortilla="Grande";
	taco2.precio=25.5f;
	taco2.tipoDeTortilla="Trigo";
	 System.out.println(taco2.toString());
	 taco2.subirPrecio(2.5f);
	 System.out.println(taco2.toString());*/
	
	//Encapsulacion
	 Tacos taco4 = new Tacos();
	 taco4.setNumeroDeTortilla(4);
	 System.out.println(taco4);
}
}
