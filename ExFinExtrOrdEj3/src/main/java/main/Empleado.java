/**
 *  @autor jhojahn ramirez
 *  @vesion 2.1
 *  
 */
package main;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Empleado {
	private String dni;
	private int edad;
	private double sueldo;

	public boolean comprobarDNI() throws Exception {
		if (dni.length() != 9) {
			throw new Exception("El DNI debe tener 8 digitos");
		} else if (!Character.isAlphabetic(dni.charAt(8)))
			throw new Exception("El DNI debe terminar con una letra");
		else {
			try {
				Integer.parseInt(dni.substring(0, 7));
			} catch (NumberFormatException e) {
				throw new Exception("Los primeros 7 caracteres del DNI deben ser numeros");
			}
		}
		return true;
	}

}
