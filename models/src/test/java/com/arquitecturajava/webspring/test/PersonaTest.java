package com.arquitecturajava.webspring.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.arquitecturajava.webspring.models.Persona;

class PersonaTest {

	@Test
	void mayorEdadTest() {
		
		//arrange preparar
		Persona p = new Persona("pep2",20);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}
	
	@Test
	void mayorEdadTest2() {
		
		//arrange preparar
		Persona p = new Persona("pep2",20);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}
	
	@Test
	void mayorEdadTest3() {
		
		//arrange preparar
		Persona p = new Persona("pep2",20);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}
	
	@Test
	void mayorEdadTest4() {
		
		//arrange preparar
		Persona p = new Persona("pep2",20);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}

}
