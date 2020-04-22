package Pruebas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

public class Prueba3 {

	static FUNCIONES FUNCIONES = null;
	static int ejecucionpruebas = 0;

	@BeforeAll

	static void prepararPruebas() {

		System.out.println("Preparando pruebas....");

		FUNCIONES = new FUNCIONES();

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

		FUNCIONES = null;

	}

	@Test
	@DisplayName("TEST DE CAJA NEGRA")

	void prueba1Funcion3() {
		assertEquals(39, FUNCIONES.Entornos3(new int[] {10,11 ,18}));
		// MEDIANTE ESTE TEST PROBAMOS QUE LA FUNCION FUNCIONA CORRECTATAMENTE AL INTRODUCIR VALORES MENORES QUE NUESTRA EDAD(18)
		//Y MAYORES QUE LA MITAD DE NUESTRA EDAD(9), EN EL CUAL NOS DEVOLVERA LA SUMA DE DICHOS NUMEROS.
	}
	
	
	
	@Test
	@DisplayName("TEST DE CAJA NEGRA VALOR CERO")

	void prueba2Funcion3() {
		assertEquals(0, FUNCIONES.Entornos3(new int[] {0,0 ,0}));
		
		//CON ESTA FUNCION PODEMOS COMPROBAR DE QUE SI TODOS LOS NUMEROS INTRODUCIDOS SON 0 NOS DEBE DEVOLVER CERO YA QUE NO HAY OTROS VALORES PARA SUMAR.
	}
	
	
	@Test
	@DisplayName(" TEST DE CAJA NEGRA LIMITE INFERIOR -1")

	void prueba3Funcion3() {
		assertEquals(9, FUNCIONES.Entornos3(new int[] {9,8,7}));
		//EN ESTE TEST QUEREMOS COMPROBAR QUE SOLO SUMA EL NUMERO  QUE  SE  SE ENCUENTRA EN EL LIMITE MIENTRAS QUE LOS OTROS DOS NO 
		//LOS SUMARIA YA QUE SE ENCONTRARIA POR DEBAJO DEL LIMITE INFERIOR(9)
	
	
	
	}
	
	
	@Test
	@DisplayName(" TEST DE CAJA NEGRA LIMITE SUPERIOR -1")

	void prueba4Funcion3() {
		assertEquals(18, FUNCIONES.Entornos3(new int[] {18,20,21}));
		//EN ESTE TEST HACEMOS JUSTO LO CONTRARIO, LO QUE HACEMOS ES QUE SOLO CUENTE EL NUMERO QUE SE ENCUENTRE EN EL LIMITE(18) MIENTRAS QUE LOS OTROS DOS NO LOS CONTARIA YA QUE
		//SE ENCUENTRAN POR ENCIMA DEL LIMITE SUPERIOR
	
	}
	
	
	
	@Test
	@DisplayName("CAJA BLANCA COBERTURA DE DECISIONES ")

	void prueba5Funcion3() {
		assertEquals(41, FUNCIONES.Entornos3(new int[] {18,11,12}));
	//MEDIANTE ESTA DECISION QUEREMOS QUE MEDIANTE UNOS NUMEROS INTRODUCIDOS DENTRO DE LAS CONDICIONES IMPUESTAS NOS DEVUELVA LA SUMA DE DICHOS NUMEROS
	}
	
	@Test
	@DisplayName("CAJA BLANCA DE CONDICIONES ")

	void prueba6Funcion3() {
		assertEquals(30, FUNCIONES.Entornos3(new int[] {9,10,11,20,21,21}));
	//MEDIANTE ESTE TEST ESTAMOS COMPRBANDO QUE SE CUMPLE LA CONDICION DE QUE SUME LOS NUMEROS MAYORES QUE 9 SIN EMBARGO LOS
	//OTROS NUMEROS NO NOS LO SUMARA YA QUE NO CUMPLE LA OTRA CONDICION YA QUE SON MAYOR QUE 19.

	}


	@Test
	@DisplayName("CAJA BLANCA DE CONDICIONES ")

	void prueba7Funcion3() {
		assertEquals(51, FUNCIONES.Entornos3(new int[] {17,18,16,1,3,4}));
		//MEDIANTE ESTE TEST HACEMOS LO CONTRARIO,LO QUE QUEREMOS ES COMPROBAR LA SEGUNDA CONDICION EN LA QUE NOS SUME LOS NUMEROS MENORES QUE NUESTRA EDAD QUE ES 18
		//MIENTRAS QUE LOS DEMAS NUMEROS NO NOS LO SUMARIA YA QUE NO CUMPLE LA CONDICION DE QUE SUME LOS MAYORES QUE LA MITAD DE 18.

}



	@Test
	@DisplayName("CAJA BLANCA DE DECISIONES")

	void prueba8Funcion3() {
		assertEquals(0, FUNCIONES.Entornos3(new int[] {1,2,4,21,22,23}));
		//MEDIANTE ESTA DECISIION COMPROBAMOS QUE SI INTRODUCIMOS VARIOS NUMEROS QUE NO CUMPLEN NINGUNA DE LAS DOS CONDICIONES ES DECIR QUE SEA MAYOR QUE 8 Y MENOR QUE 19 NOS 
		//DEVOLVERA 0
	}




}