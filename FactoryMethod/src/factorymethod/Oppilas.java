package factorymethod;

public class Oppilas extends AterioivaOtus {

	@Override
	public Juoma createJuoma() {
		// TODO Auto-generated method stub
		return new Mehu();
	}

}
