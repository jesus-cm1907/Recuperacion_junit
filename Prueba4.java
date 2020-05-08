package Pruebas;



import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.AfterAll;



import org.junit.jupiter.api.AfterEach;



import org.junit.jupiter.api.BeforeAll;



import org.junit.jupiter.api.BeforeEach;



import org.junit.jupiter.api.DisplayName;



public class FUNCIONESTest4 {



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



	@DisplayName("TEST DE CAJA DE PARTICIONES EQUIVALENTES(Entrada valida)")



	void prueba1Funcion4() {



		assertEquals("Suficiente", funcioness.Entornos4(new int[] { 6, 6, 3, 3, 3, 9 }));



		// MEDIANTE ESTE TEST PROBAMOS QUE AL INTRODUCIR NUESTRAS NOTAS DE SEGUNDO



		// TRIMESTRE LA MEDIA ES 5,5 POR LO TANTO TIENE QUE DEVOLVER SUFICIENTE



	}



	@Test



	@DisplayName("TEST DE CAJA NEGRA DE PARTICIONES EQUVALENTE(ENTRADA NO VALIDA) )")



	void prueba2Funcion4() {



		assertNotEquals("Notable", funcioness.Entornos4(new int[] { 6, 6, 3, 3, 3, 9 }));



		// MEDIANTE ESTE TEST PROBAMOS QUE SI LE INTRODUCIMOS UNAS NOTAS DONDE NOS



		// TENDRIA QUE DEVOLVER SUFICIENTE Y PONEMOS



		// CON UN NOTEQUALS QUE NOS DEVUELVA NOTABLE LO RECONOCERA COMO ERROR.



	}



	@Test



	@DisplayName("TEST DE CAJA NEGRA DE PARTICIONES EQUIVALENTE(ENTRADA VALIDA) ")



	void prueba3Funcion4() {



		assertEquals("Bien", funcioness.Entornos4(new int[] { 6, 6, 6, 6 }));



		// MEDIANTE ESTE TEST PROBAMOS QUE NOS DEVUELVA TRAS INTRODUCIR CUATRO NUMEROS



		// QUE LA MEDIA SEA BIEN



	}



	@Test



	@DisplayName("TEST DE CAJA NEGRA DE PARTICIONES EQUIVALENTES(ENTRADA VALIDA)")



	void prueba4Funcion4() {



		assertEquals("Insuficiente", funcioness.Entornos4(new int[] { 0, 0, 0, 0 }));



//CON ESTA FUNCION ESTAMOS COMPROBANDO DE QUE SI LE MANDAMOS QUE TODAS LOS NOTAS SON 0 ENTONCES LA MEDIA SERA INSUFICIENTE



	}



	@Test



	@DisplayName("CAJA BLANCA COBERTURA DE CONDICIONES")



	void prueba5Funcion4() {



		assertEquals("Bien", funcioness.Entornos4(new int[] { 5, 5, 6, 8 }));



//CON ESTE TEST COMPROBAMOS QUE SE CUMPLE LA CONDICION MEDIA<=6 && MEDIA<7,EN ESE CASO NOS DEVOLVERIA UN BIEN.



	}



	@Test



	@DisplayName("CAJA BLANCA COBERTURA DE CONDICIONES)")



	void prueba6Funcion4() {



		assertEquals("Insuficiente", funcioness.Entornos4(new int[] { 1, 9, 0, 7 }));



		// CON ESTE TEST COMPROBAMOS QUE SE CUMPLE LA CONDICION MEDIA<5,EN ESTE CASO NOS



		// DEVOLVERA INSUFICIENTE



	}



	@Test



	@DisplayName("CAJA BLANCA COBERTURA DE DECISIONES)")



	void prueba7Funcion4() {



		assertEquals("Insuficiente", funcioness.Entornos4(new int[] { 3, 1, 8, 5 }));



		// CON LA DECISION LLEVADA QUEREMOS QUE CON LAS NOTAS INTRODUCIDAS SEA DE MEDIA



		// INSUFICIENTE



	}



	@Test



	@DisplayName("CAJA BLANCA COBERTURA DE DECISIONES)")



	void prueba8Funcion4() {



		assertEquals("Notable", funcioness.Entornos4(new int[] { 7, 8, 6, 9 }));



		// CON LA DECISION LLEVADA QUEREMOS QUE CON LAS NOTAS INTRODUCIDAS NOS DEVUELVA

		// NOTABLE



	}



}
