package edu.jenarosm.calculadora;

public class Multiplicar {
	
	public static int multiplica(int x, int y) {

		int total = 0;
		boolean isNeg = false;		//Almacena si el resultado será positivo o negativo
		
		
		if(x==0 || y == 0) { 		//Si algun factor es igual a 0 devuelve 0
			return 0;
		}else if (x<0 && y<0) { 	//Si ambos factores son negativos los cambiamos a positivos
			isNeg = false;
			x=-x;
			y=-y;
		}else if(x<0) { 			//En caso de se un solo factor negativo se le cambia el signo
			isNeg = true;			//Se almacenará en isNeg que el resultado será negativo
			x=-x;
		}else if(y<0) {
			isNeg = true;
			y=-y;
		}
		
		for (int i=0;i<x;i++) {		//Bucle que suma x veces el factor y
			total=Suma.suma(total, y);
		}
		
		if (!isNeg) {
			return total;
		}else {
			return -total;
		}
	}
	
}
