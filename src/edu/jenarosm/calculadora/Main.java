package edu.jenarosm.calculadora;

public class Main {
	
	public static void main (String[] args) {
		System.out.print("Hello World!");
	}
	
	public static int suma(int x, int y) {
		Suma sum = new Suma();
		return sum.sumar(x, y);
		
	}
}
