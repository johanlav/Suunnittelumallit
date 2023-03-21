package chainofresponsibility;

public class LahiEsimies extends Palkankorotus{
	
	private final double ALLOWABLE = BASE * 2;
	public void processRequest(KorotusPyynto request) {if (request.getAmount() <= ALLOWABLE) {
	System.out.println(
	"Esimies hyväksyy korotuksen");} else {
	super.processRequest(request);
	}
	}

}
