package edu.jenarosm.calculadora;
import edu.jenarosm.calculadora.Suma;


public class Multiplicar {
	
	public int multiplica(int x, int y) {
		Suma s = new Suma();
		int total = 0;
		boolean isNeg = false;
		
		if(x==0 || y == 0) {
			return 0;
		}else if (x<0 && y<0) {
			isNeg = false;
			x=-x;
			y=-y;
		}else if(x<0) {
			isNeg = true;
			x=-x;
		}else if(y<0) {
			isNeg = true;
			y=-y;
		}
		
		for (int i=0;i<x;i++) {
			total=s.suma(total, y);
		}
		
		if (!isNeg) {
			return total;
		}else {
			return -total;
		}
	}
	
}
