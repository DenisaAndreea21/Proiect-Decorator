package acvariu_decorator;

public abstract class AcvariuDecor implements Acvariu{
	private Acvariu acv;
	public AcvariuDecor(Acvariu acv) {
		this.acv=acv;
	}
	@Override
    public String adauga_in_acvariu() {
        return acv.adauga_in_acvariu();
    }
}
