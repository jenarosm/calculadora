package edu.jenarosm.calculadora;
import edu.jenarosm.calculadora.Multiplicar;

public class Raiz {
	
	public int raiz(int x) {
		Multiplicar mult = new Multiplicar();
		if(x<0) {x=-x;} //en caso de ser negativo lo pasamos a positivo ya que es una raiz cuadrada
		
		int total = 0, aux = 0;
		
		if(x==0) { 		//Si algun factor es igual a 0 devuelve 0
			return 0;
		}
		
		
		while(aux<x) {		//bucle principal
			total++;
			aux=mult.multiplica(total,total);
		}
		
		if(aux>x) {			
			return total -1;
		}
		return total;
		
	}
}
