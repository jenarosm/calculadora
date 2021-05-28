package edu.jenarosm.calculadora;

public class Dividir {
	
	public static int divide(int x, int y) { // Divide x entre y

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
		
		int resto = x;
		
		while(resto>=y) {			//bucle principal
			resto=Suma.suma(resto,-y);
			total++;
		}
		
		if(Multiplicar.multiplica(resto, 10)>Multiplicar.multiplica(y,5)) {	//Redondeo hacia arriba
			total++;
		}
		
		if (!isNeg) {
			return total;
		}else {
			return -total;
		}
	}
}
