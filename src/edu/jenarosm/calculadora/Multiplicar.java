package edu.jenarosm.calculadora;
import edu.jenarosm.calculadora.Suma;


public class Multiplicar {
	
	public int multiplica(int x, int y) {
		Suma s = new Suma();
		int total = 0;
		
		for (int i=0;i<x;i++) {
			total=s.suma(total, y);
		}
		return total;
	}
	
}
