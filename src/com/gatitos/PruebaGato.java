package com.gatitos;

public class PruebaGato {
    public static void main(String[] args) {
		Gato g = new Gato();
		/*g.nombre="Leopoldo";
		g.patas=4;
		
		System.out.println(g);*/
		g.setNombre("Leopoldo");
		g.setPatas(4);
		g.setAdoptado(false);
		
		System.out.println(g);
	}
}
