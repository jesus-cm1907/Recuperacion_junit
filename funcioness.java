
/**
 * 
 * FUNCION QUE DADO DOS NUMEROS Y UN CARACTER HAGA LO SIGUIENTE
 * 
 * (+)SUMA=NUMERO1 + NUMERO2.
 * 
 * (-)RESTA=NUMERO1-NUMERO2.
 * 
 * (*)MULTIPLICACION NUMERO1 * NUMERO2.
 * 
 * 
 * 
 */
public class funcioness {
	public funcioness() {
	}

	public int funcion5(String caracter, int numero1, int numero2) {

		int valor = 0;

		if (caracter == "+") {

			valor = numero1 + numero2;

		} else if (caracter == "-") {

			valor = numero1 - numero2;

		} else if (caracter == "*") {

			valor = numero1 * numero2;

		}

		return valor;

	}

}
