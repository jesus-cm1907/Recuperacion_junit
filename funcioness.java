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
public class funcioness {
	public funcioness() {
	}

	public String funcion4(int[] counter) {

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

			resultado = "Notabale";

		} else if (media >= 9 && media == 10) {

			resultado = "Sobresaliente";

		}

		return resultado;

	}
}
