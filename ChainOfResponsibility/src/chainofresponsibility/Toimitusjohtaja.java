package chainofresponsibility;

public class Toimitusjohtaja extends Palkankorotus {

	private final double ALLOWABLE = 5 * BASE;
	public void processRequest(KorotusPyynto request) {
		if (request.getAmount() > ALLOWABLE) {
	System.out.println(
	"Toimitusjohtaja hyväksyy korotuksen");
		}
	
	}
}
