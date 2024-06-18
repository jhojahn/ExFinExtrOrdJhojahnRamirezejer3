/**
 *  @autor jhojahn ramirez
 *  @vesion 2.1
 *  
 */

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import main.Empleado;

/**
 * 
 */
public class test {
	
	@Test
	void test1() throws Exception {
		Empleado obj=new Empleado("Y6425689Q", 18, 20000);
		obj.comprobarDNI();
		Assertions.assertEquals(true, true);
	}
}
