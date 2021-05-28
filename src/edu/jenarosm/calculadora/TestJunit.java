package edu.jenarosm.calculadora;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   Suma sum = new Suma();

   @Test
   public void testPrintMessage() {	  
      assertEquals(4,sum.suma(2,2));
   }
}