package acvariu_decorator;

public class Alge1 extends AcvariuDecor{
	public Alge1(Acvariu acv) {
		super(acv);
	}
	public String adauga_in_acvariu() {
		return super.adauga_in_acvariu()+adauga_Alge1();
	}
	private String adauga_Alge1() {
		return "Alge1 adaugate \n";
	}
}