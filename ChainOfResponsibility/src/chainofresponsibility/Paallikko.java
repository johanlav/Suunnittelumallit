package chainofresponsibility;

public class Paallikko extends Palkankorotus{

	private final double ALLOWABLE = 5 * BASE;
	private final double N = 2 * BASE;
	public void processRequest(KorotusPyynto request) {
	if (request.getAmount() <= ALLOWABLE && request.getAmount()> N) {
	System.out.println(
	"Päällikkö hyväksyy korotuksen");} else {
	super.processRequest(request);
	}
	}
}
