
/**
 * 
 * FUNCION QUE DADA UNA LISTA DE NUMEROS,DEVUELVA LA SUMA DE TODOS LOS QUE SEAN
 * 
 * * MENORES A TU EDAD PERO MAYORES QUE LA MITAD DE TU EDAD
 * 
 */

public class funcioness {
	public funcioness() {
	}

	public int funcion3(int[] numerosintroducidos) {

		int miEdad = 19;

		int sumatorio = 0;

		for (int i = 0; i < numerosintroducidos.length; i++) {

			if (numerosintroducidos[i] >= (miEdad / 2) && numerosintroducidos[i] <= miEdad) {

				sumatorio += numerosintroducidos[i];

			}

		}

		return sumatorio;

	}

}
