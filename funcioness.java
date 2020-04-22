
/**
 * 
 * FUNCION QUE DADA DOS CADENAS NOS DEVUELVA CUAL TIENE MAS CONSONANTES
 * 
 */
public class funcioness {
	public funcioness() {
	}

	public String Entornos2(String palabra1, String palabra2) {

		int contadorConsonantes1 = 0;

		int contadorConsonantes2 = 0;

		String result = null;

		contadorConsonantes1 = contarConsonantes(palabra1);

		contadorConsonantes2 = contarConsonantes(palabra2);

		if (contadorConsonantes1 > contadorConsonantes2) {

			result = palabra1;

		} else if (contadorConsonantes1 < contadorConsonantes2) {

			result = palabra2;

		}

		return result;

	}

	private int contarConsonantes(String cadena) {

		int contador = 0;

		for (int i = 0; i < cadena.length(); i++) {

			if ((cadena.charAt(i) != 'a') && (cadena.charAt(i) != 'e') && (cadena.charAt(i) != 'o')

					&& (cadena.charAt(i) != 'i') && (cadena.charAt(i) != 'u')) {

				contador++;

			}

		}

		return contador;

	}
}
