package edu.jenarosm.calculadora;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   Suma sum = new Suma();
   Multiplicar mult = new Multiplicar();
   Dividir div = new Dividir();
   Raiz r = new Raiz();
   
   @Test
   public void testSuma() {	  
      assertEquals(4,sum.suma(2,2));
   }
   
   @Test
   public void testMultiplica() {	  
      assertEquals(8,mult.multiplica(2, 4));
      assertEquals(0,mult.multiplica(0, 4));
      assertEquals(0,mult.multiplica(4, 0));
      assertEquals(-9,mult.multiplica(3, -3));
      assertEquals(-15,mult.multiplica(-5, 3));
      assertEquals(12,mult.multiplica(-6, -2));
   }
   
   @Test
   public void testDivide() {	  
	      assertEquals(2,div.divide(4, 2));
	      assertEquals(-2,div.divide(4, -2));
	      assertEquals(1,div.divide(3, 2));
	      assertEquals(-2,div.divide(-5, 3));
   }
   
   @Test
   public void testRaiz() {	  
	      assertEquals(2,r.raiz(4));
	      assertEquals(2,r.raiz(-4));
	      assertEquals(3,r.raiz(10));
	      assertEquals(3,r.raiz(9));
	      assertEquals(7,r.raiz(49));
	      assertEquals(7,r.raiz(50));
	      assertEquals(8,r.raiz(65));
}
	      
   
}