package Pruebas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class FUNCIONESTest2 {

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

	
	/*
	 * COMPROBAMOS QUE NOS DEVUELVA LA PRIMERA CADENA, LA CUAL POSEE MAYOR CANTIDAS DE CONSONANTES.
	 * 
	 * */
	@Test
	@DisplayName("TEST DE CAJA NEGRA CON EQUIVALENTES(ENTRADA VALIDA SEA PALABRA1)")
	void prueba1Entornos2() {
		assertEquals("murcielago", funcioness.Entornos2("murcielago", "jesus"));
	}
	
	/*
	 * COMPROBAMOS QUE NOS DEVUELVE UN VALOR POR DEFAULT CUANDO LAS DOS CADENAS INGRESADAS SON NULL
	 * 
	 * */
	@Test
	@DisplayName(" TEST DE CAJA NEGRA CON  VALOR NULL")
	void prueba2Entornos2() {
		assertEquals("No se reconocieron cadenas validas", funcioness.Entornos2(null,null));
	}

	/*
	 * PRUEBA DE CAJA NEGRA CON ESPACIOS VACIOS QUE NOS SALDRA UN MENSAJE DICIENDO QUE TIENE EL MISMO NUMERO DE CONSONATES AMBAS PALABRAS.
	 * 
	 * */
	@Test
	@DisplayName("TEST DE CAJA NEGRA CON VALORES VACIOS")
	void prueba3Entornos2() {
		assertEquals("Poseen la misma cantidad de consonantes", funcioness.Entornos2(" ", ""));
	}

	/*
	 * COMPROBAMOS QUE NOS DEVUELVA LA SEGUNDA PALABRA QUE TIENE MAS CONSONANTES QUE LA PRIMERA
	 * 
	 * */
	@Test
	@DisplayName(" TEST DE CAJA NEGRA CON EQUIVALENTES(ENTRADA VALIDA QUE RESULTADO SEA LA SEGUNDA PALABRA)  ")
	void prueba4Entornos2() {
		assertEquals("antetokoumpo", funcioness.Entornos2("murcielago","antetokoumpo")); 
	}

	/*
	 * COMPROBAMOS QUE SE CUMPLE LA CONDICION SI PALABRA2>PALABRA1 RETURN PALABRA2 ES DECIR NOS DEVOLVERA
	 * LA SEGUNDA PALABRA YA QUE TIENE MAS CONSONANTES
	 * 
	 * */
	@Test
	@DisplayName("CAJA BLANCA COBERTURA DE CONDICIONES")
	void prueba5Entornos2() {
		assertEquals("cansino", funcioness.Entornos2("jesus", "cansino"));

	}

	/*
	 *  COMPROBAMOS QUE SE CUMPLE LA CONDICION SI PALABRA1>PALABRA2 RETURN PALABRA2 ES DECIR NOS DEVOLVERA 
	 *  LA SEGUNDA PALABRA YA QUE TIENE MAS CONSONATE.
	 * 
	 * */
	@Test
	@DisplayName("CAJA BLANCA COBERTURA DE CONDICIONES")
	void prueba6Entornos2() {
		assertEquals("murcielago", funcioness.Entornos2("murcielago", "cansino"));
	}

	
	/*
	 * QUEREMOS LLEVAR ACABO LA DECISION QUE NOS DEVUELVA UN VALOR POR DEFAULT CUANDO LACANTIDAD DE CONSONANTES EN LAS CADENAS SEAN LAS MISMAS
	 * 
	 * */
	@Test
	@DisplayName("CAJA BLANCA COBERTURA DE DESICIONES")
	void prueba7Entornos2() {
		assertEquals("Poseen la misma cantidad de consonantes", funcioness.Entornos2("", ""));
	}

	/*
	 * QUEREMOS TOMOR UNA DECISION QUE AL INTRODUCIR EL VALOR DE UNA CADENA COMO NULL NOS DEVUELVA EL VALOR DE LA OTRA COMO RESULTADO
	 * 
	 * */
	@Test
	@DisplayName("CAJA BLANCA COBERTURA DE DECISIONES")
	void prueba8Entornos2() {
		assertEquals("jesus", funcioness.Entornos2(null, "jesus"));

	}
}

