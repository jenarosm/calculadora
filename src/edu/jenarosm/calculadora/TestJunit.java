package edu.jenarosm.calculadora;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   Suma sum = new Suma();
   Multiplicar mult = new Multiplicar();
   
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
   

   
}