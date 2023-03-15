package acvariu_decorator;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlgeTest1 {

	@Test
	public void testAdauga_Alge_in_acvariu() {
		Acvariu ac = new AcvariuImpl();
		ac = new Alge(ac);
		String continutAcvariu = ac.adauga_in_acvariu().toString();
		boolean result = continutAcvariu.contains("Alge adaugate aici");
		assertTrue(result);
				
	}
}
