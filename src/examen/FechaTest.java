package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FechaTest {
Fecha f1= new Fecha();
	@Test
	public void test1()
	{	
		assertFalse(Fecha.validarFecha(1999, 12, -5));
		
	}
	public void test2() {
		assertTrue(Fecha.validarFecha(1999, 12, 1));
	}
	
	public void test3() {
		assertTrue(Fecha.validarFecha(1999, -10, 1));
	}
	
	public void test4() {
		assertTrue(Fecha.validarFecha(-20, 12, 1));
	}
	
	

}
