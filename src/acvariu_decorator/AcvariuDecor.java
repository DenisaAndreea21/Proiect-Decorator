package acvariu_decorator;

public abstract class AcvariuDecor implements Acvariu{
	private Acvariu acv;
	/**
	 * 
	 * @param acv obiect de tip Acvariu
	 */
	public AcvariuDecor(Acvariu acv) {
		this.acv=acv;
	}
	@Override
    public String adauga_in_acvariu() {
        return acv.adauga_in_acvariu();
    }
}
