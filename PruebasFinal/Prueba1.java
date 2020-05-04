package Pruebas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FUNCIONESTest {

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
	 * HAY 19 VOCALES POR LO TANTO ENTRARIA
	// DENTRO DEL TRUE YA QUE SE ENCUENTRA EN EL LIMITE DE LA EDAD QUE ES 19.
	 * 
	 * */
	@Test
	@DisplayName("TEST DE CAJA NEGRA CON VALORES DE LIMITE INFERIOR ")
	void Prueba1Entornos1() {
		assertEquals(true, funcioness.Entornos1("jesuuuuuuuuuuuuuuuuuus"));
	}

	/*
	 * Hay 18 VOCALES POR LO TANTO NO ENTRARIA
		// DENTRO DEL TRUE PORQUE HA BAJADO EL LIMITE DE LA EDAD QUE ES 19.	
	 * 
	 * */
	@Test
	@DisplayName("TEST DE CAJA NEGRA CON VALORES DE LIMITES INFERIOR -1 ")
	void Prueba2Entornos1() {
		assertEquals(false, funcioness.Entornos1("jesuuuuuuuuuuuuuuuuus"));
	}

	/*
	 * COMPROBAMOS QUE DEVUELVE FALSE SI EL VALOR PASADO POR PARAMETRO ES NULL
	 * 
	 * */
	@Test
	@DisplayName("TEST DE CAJA NEGRA CON VALORES VACIOS ")
	void Prueba3Entornos1() {
		assertEquals(false, funcioness.Entornos1(null));
	}

	/*COMPROBAMOS QUE AL INTRODUCIR UN VALOR VACIO NOS DEVOLVERA UN NULL.
	 * 
	 * 
	 * */
	@Test
	@DisplayName("TEST DE CAJA NEGRA CON VALORES VACIOS")
	void Prueba4Entornos1() {
		assertNotEquals(null, funcioness.Entornos1(""));
		
	}

	/*
	 * LA CONDICION DE QUE LA EDAD ES IGUAL AL NUMERO DE VOCALES DEL STRING 
	 * 
	 * */
	@Test
	@DisplayName("CAJA BLANCA DE COBERTURA DE CONDICIONES")
	void Prueba5Entornos1() {
		assertEquals(true,funcioness.Entornos1("Hola soy Jesuuuuuuuuuuuuuuus"));
	}

	
	
	/*
	 * COMPROBAMOS QUE DEVUELVA FALSE DEBIDO A QUE NO DIFERENCIA ENTREVOCALES ACENTUADAS NI MAYUSULAS O MINUSCULAS.
	 * 
	 * 
	 * */
	@Test
	@DisplayName("CAJA BLANCA COBERTURA DE DECISIONES ")
	void Prueba6Entornos1() {
		assertFalse(funcioness.Entornos1("JESÚS"));
	}

	/*
	 * COMPROBAMOS QUE DEVUELVE TRUE SI LA CANTIDAD DE VOCALES EN LA CADENA ES MAYOR A MI EDAD(19)
	 * 
	 * */
	@Test
	@DisplayName("CAJA BLANCA DE COBERTURA CONDICIONES")
	void Prueba7Entornos1() {
		assertTrue(funcioness.Entornos1("Hola mi nombre es Jesus Cansino Molina y este es el quinto test"));
	}


	/*
	 * COMPROBAMOS QUE NOS DEVUELVE TRUE SI LA CADENA DE VOCALES EN LA CADENA ES MAYOR A MI EDAD
	 * SIN IMPORTA QUE LOS CARACTERES SE ENCUENTREN EN MAYUSCULAS O ACENTUADOS
	 * 
	 * */
	@Test
	@DisplayName("CAJA BLANCA DE COBERTURA  DE DECISIONES")
	void Prueba8Entornos1() {
		assertTrue(funcioness.Entornos1("HOLA! mi nombre es Jesús Cansino Molina y este es el OCTAVO TEST"));
	}

}
