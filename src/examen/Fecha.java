package examen;
/**
 * 
 * @author DAM101
 * @version 1.0
 */
public class Fecha {
	public static boolean fechaValida;

	/**
	 * 
	 * @param anio indica el anio
	 * @param mes indica el mes
	 * @param dia indica el dia 
	 * @return retorna si la fecha introducida es valida
	 * 
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}