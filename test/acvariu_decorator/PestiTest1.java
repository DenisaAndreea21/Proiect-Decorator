package acvariu_decorator;

import static org.junit.Assert.*;

import org.junit.Test;

public class PestiTest1 {

	@Test
	public void testAdauga_Pesti_in_acvariu() {
		Acvariu ac = new AcvariuImpl();
		ac = new Pesti(ac);
		String continutAcvariu = ac.adauga_in_acvariu().toString();
		boolean result = continutAcvariu.contains("Peste adaugat");
		assertTrue(result);
	}

}
