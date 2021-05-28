package edu.jenarosm.calculadora;

public class Main {
	
	static String aux[]=null;
	static int opt = 0;
	
	public static void main (String[] args) {
		while (opt != 5){
			opt = Gui.menu("Calculadora",new String[] {	"Sumar","Restar","Multiplicar",
														"Dividir", "Raiz Cuadrada","Salir"});
			
			switch (opt) {
				case 0: 
					aux = Gui.input("Suma (X + Y)", new String[] {"X: ", "Y: "});
					System.out.println("El resultado de la suma es: " + Suma.suma(Integer.parseInt(aux[0]),Integer.parseInt(aux[1])) + "\n"); 
					break;
					
				case 1:
					aux = Gui.input("Resta (X - Y)", new String[] {"X: ", "Y: "});
					System.out.println("El resultado de la resta es: " + Suma.suma(Integer.parseInt(aux[0]),-Integer.parseInt(aux[1])) + "\n");
					break;
				case 2: 
					aux = Gui.input("Multiplicar (X * X)", new String[] {"X: ", "Y: "});
					System.out.println("El resultado de la multiplicacion es: " + Multiplicar.multiplica(Integer.parseInt(aux[0]),Integer.parseInt(aux[1])) + "\n");
					break;
				case 3: 
					aux = Gui.input("Dividir (X / Y)", new String[] {"X: ", "Y: "});
					System.out.println("El resultado de la division es: " + Dividir.divide(Integer.parseInt(aux[0]),Integer.parseInt(aux[1])) + "\n");
					break;
				case 4: 
					String x = Gui.input("Raiz Cuadrada", "X: ");
					System.out.println("El resultado de la raiz es: " + Raiz.raiz(Integer.parseInt(x)) + "\n");
					break;
			}
	}
	}
	

}
