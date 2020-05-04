package Pruebas;

public class FUNCIONES {

	public FUNCIONES() {

	}

	/**
	 * 
	 * FUNCION QUE AL INTRODUCIR UNA CADENA NOS DEVUELVA CUANTAS VOCALES CONTIENE.
	 * 
	 * 
	 * 
	 */
    
	
	public boolean Entornos1(String palabra) {

		int contador = 0;
		int edad = 18;
		boolean result = false;
		
		if(palabra == null) {
			return false;
		}

		for (int i = 0; i < palabra.length(); i++) {
			
			//COMPARO CADA CARACTER CON LA VOCAL SIN TILDE
			if ((palabra.toLowerCase().charAt(i) == 'a') || (palabra.toLowerCase().charAt(i) == 'e') || (palabra.toLowerCase().charAt(i) == 'i')
					|| (palabra.toLowerCase().charAt(i) == 'o' || (palabra.toLowerCase().charAt(i) == 'u'))) {

				contador++;
			}
			
			//COMPARO CADA CARACTER CON LA VOCAL CON TILDE
			if ((palabra.toLowerCase().charAt(i) == 'á') || (palabra.toLowerCase().charAt(i) == 'é') || (palabra.toLowerCase().charAt(i) == 'í')
					|| (palabra.toLowerCase().charAt(i) == 'ó' || (palabra.toLowerCase().charAt(i) == 'ú'))) {

				contador++;
			}
			
		}
		
		if (contador >= edad) {
			result = true;
		}

		return result;

	}

	/**
	 * 
	 * FUNCION QUE DADA DOS CADENAS NOS DEVUELVA CUAL TIENE MAS CONSONANTES
	 * 
	 */

	public String Entornos2(String palabra1, String palabra2) {

		int contadorConsonantes1 = 0;

		int contadorConsonantes2 = 0;

		String result = "No se reconocieron cadenas validas";
		
		if(palabra1 == null && palabra2 == null) {
			return result;
		}else if(palabra1 == null && palabra2 != null) {
			return palabra2;
		}else if(palabra1 != null & palabra2 == null) {
			return palabra1;
		}

		contadorConsonantes1 = contarConsonantes(palabra1);

		contadorConsonantes2 = contarConsonantes(palabra2);

		if (contadorConsonantes1 > contadorConsonantes2) {

			result = palabra1;

		} else if (contadorConsonantes1 < contadorConsonantes2) {

			result = palabra2;

		} else result = "Poseen la misma cantidad de consonantes";

		return result;

	}

	private int contarConsonantes(String cadena) {

		int contador = 0;

		for (int i = 0; i < cadena.length(); i++) {

			// CUENTA LA CANTIDAD DE CONSONANTES DE UNA CADENA
			if((cadena.toLowerCase().charAt(i) == 'b')||
					(cadena.toLowerCase().charAt(i) == 'c')||
					(cadena.toLowerCase().charAt(i) == 'd')||
					(cadena.toLowerCase().charAt(i) == 'f')||
					(cadena.toLowerCase().charAt(i) == 'g')||
					(cadena.toLowerCase().charAt(i) == 'h')||
					(cadena.toLowerCase().charAt(i) == 'j')||
					(cadena.toLowerCase().charAt(i) == 'k')||
					(cadena.toLowerCase().charAt(i) == 'l')||
					(cadena.toLowerCase().charAt(i) == 'm')||
					(cadena.toLowerCase().charAt(i) == 'n')||
					(cadena.toLowerCase().charAt(i) == 'ñ')||
					(cadena.toLowerCase().charAt(i) == 'p')||
					(cadena.toLowerCase().charAt(i) == 'q')||
					(cadena.toLowerCase().charAt(i) == 'r')||
					(cadena.toLowerCase().charAt(i) == 's')||
					(cadena.toLowerCase().charAt(i) == 't')||
					(cadena.toLowerCase().charAt(i) == 'v')||
					(cadena.toLowerCase().charAt(i) == 'w')||
					(cadena.toLowerCase().charAt(i) == 'x')||
					(cadena.toLowerCase().charAt(i) == 'y')||
					(cadena.toLowerCase().charAt(i) == 'z')){
					    contador ++;
					}
			

		}

		return contador;

	}

	/**
	 * 
	 * FUNCION QUE DADA UNA LISTA DE NUMEROS,DEVUELVA LA SUMA DE TODOS LOS QUE SEAN
	 * 
	 * * MENORES A TU EDAD PERO MAYORES QUE LA MITAD DE TU EDAD
	 * 
	 */

	public int Entornos3(int[] numerosintroducidos) {

		int miEdad = 18;

		int sumatorio = 0;
		if(numerosintroducidos == null) {
			return sumatorio;
		}

		for (int i = 0; i < numerosintroducidos.length; i++) {

			if (numerosintroducidos[i] >= (miEdad / 2) && numerosintroducidos[i] <= miEdad) {

				sumatorio += numerosintroducidos[i];

			}

		}

		return sumatorio;

	}

	/**
	 * 
	 * FUNCION QUE DADA UNA LISTA DE NOTAS ,DEVUELVA UNA CADENA INDICANDO SI LA
	 * 
	 * NOTA MEDIA HA SIDO INSUFICIENTE(<5),SUFICIENTE(>=5 y <6) BIEN (>=6 y
	 * 
	 * >7),NOTABLE(>=7 y <9) o SOBRESALIENTE(>=9 y 10)-
	 * 
	 * 
	 * 
	 */

	public String Entornos4(int[] counter) {

		float sum = 0;

		double media;

		String resultado = null;

		for (int x = 0; x < counter.length; x++) {

			sum += counter[x];

		}

		media = sum / counter.length;

		if (media < 5) {

			resultado = "Insuficiente";

		} else if (media <= 5 && media < 6) {

			resultado = "Suficiente";

		} else if (media >= 6 && media < 7) {

			resultado = "Bien";

		} else if (media >= 7 && media < 9) {

			resultado = "Notable";

		} else if (media >= 9 && media == 10) {

			resultado = "Sobresaliente";

		}

		return resultado;

	}
