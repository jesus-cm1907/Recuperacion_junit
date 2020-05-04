package Pruebas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

public class FUNCIONESTest5 {

	static FUNCIONES funcioness = null;

	static int ejecucionpruebas = 0;

	@BeforeAll

	static void prepararPruebas() {

		System.out.println("Preparando pruebas....");

		funcioness = new FUNCIONES();

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

	@DisplayName("TEST DE CAJA NEGRA(SUMA))")

	void prueba1Funcion5() {

		assertEquals(9, funcioness.Entornos5("+", 3, 6));

		// MEDIANTE ESTE TEST COMPROBAMOS QUE AL INTRODUCIR EL STRING(+) Y DOS NUMEROS

		// NOS REALICE LA SUMA

	}

	@Test

	@DisplayName(" TEST DE CAJA NEGRA (RESTA)")

	void prueba2Funcion5() {

		assertEquals(8, funcioness.Entornos5("-", 10, 2));

		// MEDIANTE ESTE TEST PROBAMOS QUE SI INTRODUCIMOS DOS NUMEROS Y EL STRING(-)

		// NOS REALIZARA LA RESTA DE AMBOS NUMEROS

	}

	@Test

	@DisplayName("TEST DE CAJA NEGRA CON UN CARACTER")

	void prueba3Funcion5() {

		assertEquals(0, funcioness.Entornos5("M", 3, 3));

		// MEDIANTE ESTE TEST PROBAMOS QUE SI INTRODUCIMOS UN CARACTER QUE NO SEA + - *

		// ENTONCES NOS DEVUEVA 0.

	}

	@Test

	@DisplayName("TEST DE CAJA NEGRA (RECIBIR UN CARACTER VACIO)")

	void prueba4Funcion5() {

		assertEquals(0, funcioness.Entornos5("", 3, 3));

		// MEDIANTE ESTE TEST PROBAMOS QUE SI NO INTRODUCIOMOS UN CARACTER NOS DEVUELVE
		// 0

	}

	@Test

	@DisplayName("CAJA BLANCA COBERTURA DE CONDICIONES ")

	void prueba5Funcion5() {

		assertEquals(9, funcioness.Entornos5("*", 3, 3));

		// MEDIANTE ESTE TEST PROBAMOS QUE LA CONDICION DE QUE SI INSERTAMOS UN

		// STRING(*) Y DOS NUMEROS (3,3).

	}

	@Test

	@DisplayName("CAJA BLANCA COBERTURA  DE CONDICIONES")

	void prueba6Funcion5() {

		assertEquals(5, funcioness.Entornos5("-", 10, 5));

		// MEDIANTE ESTE TEST PROBAMOS QUE LA CONDICION DE QUE SI INSERTAMOS UN

		// STRING(-) Y DOS NUMEROS (10,5) NOS REALICE LA RESTA

	}

	@Test

	@DisplayName("CAJA BLANCA COBERTURA  DE CONDICIONES")

	void prueba7Funcion5() {

		assertEquals(10, funcioness.Entornos5("+", 7, 3));

		// MEDIANTE ESTE TEST PROBAMOS QUE SE CUMPLA LA CONDICION DE QUE AL INTRODUCIR

		// UN STRING (+) Y DOS NUMEROS(7,3) NOS REALICE LA SUMA

	}

	@Test

	@DisplayName("CAJA BLANCA COBERTURA  DE CONDICIONES")

	void prueba8Funcion5() {

		assertEquals(0, funcioness.Entornos5("", 3, 3));

		// MEDIANTE ESTE TEST PROBAMOS QUE SI INTRODUCIMOS UN STRING VACIO("") Y DOS

		// NUMEROS (3,3) NOS DEVOLVERA CERO YA QUE NO REALIZARA NINGUNA OPERACION

	}

}
