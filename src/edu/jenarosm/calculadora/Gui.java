/**
 * @author Jenaro Sanchez Monzon
 * @author jsanchez4431@alumno.uned.es
 * 
 * @version 1.0
 * 
 */

package edu.jenarosm.calculadora;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gui {
	private static Console console = System.console();
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static int menu(String name, String[] entradas) {
		System.out.println("--- " + name + " ---");
		System.out.println("Seleccione una opcion.\n");
		
		for (int i=0;i<entradas.length;i++) {
			System.out.println((i + 1) + " - " + entradas[i]);
		}
		
		int opt = -1;
		do {
			String read=read().trim();
		        try {
		            opt=Integer.parseInt(read);
		            //boolean resultado = true;
		        } catch (NumberFormatException excepcion) {
					opt = -1;
		        }
		        
				if (opt - 1 >= entradas.length || opt <= 0 ) {
					System.out.println("Ingrese una opcion del 1 al " + entradas.length);
					opt = -1;
			
			}
		}
		while (opt == -1);
		
		System.out.println();
		
		return opt -1;
	}
		
	public static String[] input(String s, String[] msgs) {
		String[] inputs = new String[msgs.length];
		
		if (!s.equals("")) {
			System.out.println("--- " + s + " ---");
		}
		for (int i=0;i<msgs.length;i++) {
			inputs[i] = input(msgs[i]);
		}
		
		return inputs;
	}
	
	public static String input(String s, String msg) {
		if (!s.equals("")) {
			System.out.println("--- " + s + " ---");
		}
		return input(msg);
	}
	
	private static String input(String msg) {
		System.out.print(msg);
		String input = read();
		
		System.out.println();
		
		return input;
	}
	
	private static String read() {
		if (console != null) return console.readLine();
		
		try { return reader.readLine(); } 
		catch (IOException e) { throw new RuntimeException(e); }
		
	}
}