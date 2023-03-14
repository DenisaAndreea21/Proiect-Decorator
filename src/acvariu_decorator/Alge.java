package acvariu_decorator;

public class Alge extends AcvariuDecor{
	public Alge(Acvariu acv) {
		super(acv);
	}
	public String adauga_in_acvariu() {
		return super.adauga_in_acvariu()+adauga_Alge();
	}
	/**
	 * 
	 * @return returneaza mesajul "Alge adaugate aici", urmat de o linie noua
	 */
	private String adauga_Alge() {
		return "Alge adaugate aici\n";
	}
	
}
