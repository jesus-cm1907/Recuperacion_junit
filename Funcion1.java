public class FUNCION1 {

	public FUNCION1() {
}

	/**

	 * FUNCION QUE AL INTRODUCIR UNA CADENA NOS DEVUELVA CUANTAS VOCALES CONTIENE.

	 * 

	 */

	public int Entornos1(String palabra) {

    int contador = 0;

    for (int i = 0; i < palabra.length(); i++) {

	if ((palabra.charAt(i) == 'a') || (palabra.charAt(i) == 'e') || (palabra.charAt(i) == 'i')

	|| (palabra.charAt(i) == 'o' || (palabra.charAt(i) == 'u'))) {

	contador++;

	}

		}

		return contador;

  }
}