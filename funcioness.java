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
}
