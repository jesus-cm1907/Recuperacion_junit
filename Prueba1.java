package PruebasFinal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

public class Prueba1 {
	
	
	static funcioness funcioness = null;
	static int ejecucionpruebas = 0;

	
	
	
	@BeforeAll

	static void prepararPruebas() {

		System.out.println("Preparando pruebas....");

		funcioness = new funcioness();

	}

	@BeforeEach

	private void EjecutarPruebas() {

		ejecucionpruebas++;

		System.out.println("CARGANDO EL TEST");

	}

	@AfterEach

	private void terminadoPruebas() {

		System.out.println("Se ha ejecutado el test numero...   " + ejecucionpruebas);

	}

	@AfterAll

	static void finPruebas() {

		System.out.println("Pruebas realizadas correctamente");

		funcioness = null;

	}

	@Test

	@DisplayName("TEST DE CAJA NEGRA EQUIVALENTE")

	void Prueba1Entornos1() {

		assertEquals(false, funcioness.Entornos1("Jesus"));
		// EN ESTA PRUEBA COMPROBAREMOS QUE CUANDO INTRODUCIMOS UN STRING QUE ES MENOR
		// A LA EDAD NOS DA FALSE .
	}

	@Test

	@DisplayName("TEST DE CAJA NEGRA ")

	void Prueba2Entornos1() {
		assertEquals(true, funcioness.Entornos1("Hola esta es la segunda prueba que vamos a realizar"));
	}

	// EN ESTE TEST LO QUE COMPROBAMOS ES QUE NOS DEVUELVA VERDADERO YA QUE EL
	// STRING ES MAYOR QUE LA EDAD INTRODUCIDA

	@Test

	@DisplayName("TEST DE CAJA NEGRA  (VALOR NULL)")

	void Prueba3Entornos1() {
		assertEquals(null, funcioness.Entornos1("190863532"));
	}
	// EN ESTE CASO LO QUE HEMOS HECHO ES COMPROBAR QUE CUANDO INTRODUCIMOS UNA CADENA
	// DE NUMEROS NOS DEVUELVA VALOR NULL PUESTO QUE LO QUE TIENE QUE RECIBIR ES UN STRING.

	@Test

	@DisplayName("TEST DE CAJA NEGRA")

	void Prueba4Entornos1() {
		assertNotEquals(false, funcioness.Entornos1("Hola me llamo Jesus Cansino Molina y esta es el cuarto test"));
	}

	// CON ESTE TEST COMPROBAMOS QUE AL INTRODUCIR UN STRING MAYOR QUE NUESTRA EDAD,
	// AL CREAR UN ASSERTNOTEQUALS NO NOS DEBE DEVOLVER FALSE.

	@Test

	@DisplayName("CAJA BLANCA DE CONDICIONES")

	void Prueba5Entornos1() {
		assertFalse(funcioness.Entornos1("Hola soy Jesus"));
	}

	// AQUI LO QUE VAMOS A REALIZAR ES  COMPROBAR QUE SI ENTRASE UN
	// STRING MENOR A LA EDAD SE CUMPLA LA CONDICION Y  NOS DEVUELVA  FALSE.

	@Test

	@DisplayName("CAJA BLANCA DE DECISIONES ")

	void Prueba6Entornos1() {
		assertFalse(funcioness.Entornos1("jesus"));
	}

//CON ESTE TEST AL TOMAR  LA DECISION DE QUE SI INTRODUCIMOS UN STRING MENOR A LA EDAD NOS DEVOLVERA FALSE

	@Test

	@DisplayName("CAJA BLANCA DE CONDICIONES")

	void Prueba7Entornos1() {
		assertTrue(funcioness.Entornos1("Hola mi nombre es Jesus Cansino Molina y este es el quinto test"));
	}
	// CON ESTE TEST  LO QUE HACEMOS ES
	// COMPROBAR QUE SI ENTRASE UN STRING MAYOR A LA EDAD SE CUMPLA LA CONDICION Y  NOS DEBE DEVOLVER TRUE

	@Test

	@DisplayName("CAJA BLANCA DE DECISIONES")

	void Prueba8Entornos1() {
		assertTrue(funcioness.Entornos1("Hola mi nombre es Jesus Cansino Molina y este es el octavo test"));
	}

//EN ESTE CASO LO QUEREMOS ES QUE CON LA DECISION TOMADA NOS DEVUELVA UN VALOR TRUE PARA ELLO DEBEMOS INTRODUCIR UN STRING QUE SEA MAYOR A NUESTRA EDAD.

}



