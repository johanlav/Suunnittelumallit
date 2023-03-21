package chainofresponsibility;

public abstract class Palkankorotus {
	
	protected static final double BASE = 1;
	private Palkankorotus successor;
	
	public void setSuccessor(Palkankorotus successor) {
	this.successor = successor;
	}
	
	public void processRequest(KorotusPyynto request){
	if (successor != null)
	successor.processRequest(request);
	}
}


