package PruebasFinal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

public class Prueba2Test {

	static  funcioness funcioness= null;
	static int ejecucionpruebas = 0;

	@BeforeAll

	static void prepararPruebas() {

		System.out.println("Preparando pruebas....");

		 funcioness = new  funcioness();

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

		 funcioness= null;

	}

	@Test
	@DisplayName("TEST DE CAJA NEGRA")

	void prueba1Entornos2() {
		assertEquals("murcielago",  funcioness.Entornos2("jesus", "murcielago"));
		// EN ESTE TEST INTRODUCIMOS DOS CADENAS STRINGS DONDE QUEREMOS QUE NOS DEVUELVA
		// CUAL TIENE MAS CONSONATES,EN ESTE CASO SERIA MURCIELAGO.
	}

	@Test
	@DisplayName(" TEST DE CAJA NEGRA2 VALOR NULL")

	void prueba2Entornos2() {
		assertEquals(null,  funcioness.Entornos2("", ""));
		// EN ESTE TEST ESTAMOS COMPROBANDO QUE SI INTRODUCIMOS DOS CADENAS VACIAS NOS
		// DEVUELVE UN NULL PUESTO QUE ESPERA DOS PALABRAS

	}

	@Test
	@DisplayName("TEST DE CAJA NEGRA VALOR NULL")

	void prueba3Entornos2() {
		assertEquals(null,  funcioness.Entornos2("aeiou", "aeei"));

//EN ESTE TEST VEMOS QUE NOS DEVUELVE UN NULL CUANDO INTRODUCIMOS SOLO DOS CADENAS QUE SOLO ESTAN COMPUESTAS POR VOCALES.

	}

	@Test
	@DisplayName(" TEST DE CAJA NEGRA ")

	void prueba4Entornos2() {
		assertNotEquals("hola",  funcioness.Entornos2("juguete", "hola"));
//EN ESTE TEST COMPROBAMOS QUE MEDIANTE UN NOTEQUALS QUE SI LE DECIMOS QUE UNA CADENA MAS PEQUEÑA TIENE MAS CONSONANTE NOS DEBE DAR ERROR 

	}

	@Test
	@DisplayName("CAJA BLANCA CONDICIONES")

	void prueba5Entornos2() {
		assertEquals("cansino",  funcioness.Entornos2("jesus", "cansino"));

//EN ESTE TEST DE CAJA BLANCA QUEREMOS VER QUE SE CUMPLE LA CONDICION DE QUE SI LA SEGUNDA PALABRA TIENE MAS CONSONANTES NOS DEVUELVA DICHA PALABRA.

	}

	@Test
	@DisplayName("CAJA BLANCA CONDICIONES")

	void prueba6Entornos2() {
		assertEquals("murcielago",  funcioness.Entornos2("murcielago", "cansino"));
//EN ESTE CASO HACEMOS LO CONTRARIO COMPROBAMOS QUE SE CUMPLA LA CONDICION DE QUE SI LA PRIMERA PALABRA TIENE MAS CONSONATES NOS DEVUELVA DICHA PALABRA.

	}

	@Test
	@DisplayName("CAJA BLANCA COBERTURA DE DESICIONES")

	void prueba7Entornos2() {
		assertEquals(null,  funcioness.Entornos2("", ""));
//MEDIANTE ESTE TEST SE TOMA LA DECISION DE QUE AL DEVOLVER DOS CADENAS VACIAS ESPERAMOS LA REPUESTA COMO RESULTADO DE UN NULL.

	}

	@Test
	@DisplayName("CAJA BLANCA COBERTURA DE DECISIONES")

	void prueba8Entornos2() {
		assertEquals(null,  funcioness.Entornos2("jesus", "jesus"));
//EN ESTA PRUEBA LO QUE SE QUIERE OBETENER ES QUE LA DECISION LLEVADA A CABO SEA LA DE DEVOLVERNOS UN RESULTADO NULL YA QUE LOS DOS STRING SON IGUALES Y NO SE PUEDEN COMPARAR.

	}
}
