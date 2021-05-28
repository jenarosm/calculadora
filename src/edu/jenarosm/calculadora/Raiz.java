package edu.jenarosm.calculadora;

public class Raiz {
	
	public static int raiz(int x) {

		if(x<0) {x=-x;} //en caso de ser negativo lo pasamos a positivo ya que es una raiz cuadrada
		
		int total = 0, aux = 0;
		
		if(x==0) { 		//Si algun factor es igual a 0 devuelve 0
			return 0;
		}
		
		
		while(aux<x) {		//bucle principal
			total++;
			aux=Multiplicar.multiplica(total,total);
		}
		
		if(aux>x) {			
			return total -1;
		}
		return total;
		
	}
}
