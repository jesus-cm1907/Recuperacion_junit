package pruebas;

public class funcioness {

	public static String Entornos2(String palabra1, String palabra2) {

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

	private static int contarConsonantes(String cadena) {

		int contador = 0;

		for (int i = 0; i < cadena.length(); i++) {

			if ((cadena.charAt(i) != 'a') && (cadena.charAt(i) != 'e') && (cadena.charAt(i) != 'o')

					&& (cadena.charAt(i) != 'i') && (cadena.charAt(i) != 'u')) {

				contador++;

			}

		}

		return contador;

	}

	public static Boolean Entornos1(String palabra) {

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