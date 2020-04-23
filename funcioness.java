package PruebasFinal;

public class funcioness {

	public funcioness() {

	}

	/**
	 * 
	 * FUNCION QUE AL INTRODUCIR UNA CADENA NOS DEVUELVA CUANTAS VOCALES CONTIENE.
	 * 
	 * 
	 * 
	 */

	public Boolean Entornos1(String palabra) {

		int contador = 0;
		int edad = 19;
		Boolean result = null;

		for (int i = 0; i < palabra.length(); i++) {

			if ((palabra.charAt(i) == 'a') || (palabra.charAt(i) == 'e') || (palabra.charAt(i) == 'i')

					|| (palabra.charAt(i) == 'o' || (palabra.charAt(i) == 'u'))) {

				contador++;
				if (contador >= edad) {
					result = true;
				} else {
					result = false;

				}

			}

		}

		return result;

	}
}

	/**
	 * 
	 * FUNCION QUE DADA DOS CADENAS NOS DEVUELVA CUAL TIENE MAS CONSONANTES
	 * 
	 */
