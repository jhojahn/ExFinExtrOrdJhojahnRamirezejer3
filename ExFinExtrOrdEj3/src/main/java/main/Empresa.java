/**
 *  @autor jhojahn ramirez
 *  @vesion 2.1
 *  
 */
package main;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Empresa {
 List<Empleado> empleados;
 Empresa(){
	 empleados=new ArrayList<>();
 }
 void addEmpleado(Empleado e) {
	 this.empleados.add(e);
 }
 
 double calcularSueldoTotalConIncremento(double incremento) {
	 double suma=0;
	 for (Empleado e: empleados)
		 if(e.getEdad()<18 || e.getEdad()>65)
			 return -1;
		 else
			 if (e.getSueldo() < 5000)
				 suma += e.getSueldo()*(1+incremento);
	 return suma;
 }
}
