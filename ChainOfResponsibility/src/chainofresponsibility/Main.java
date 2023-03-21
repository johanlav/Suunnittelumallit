package chainofresponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		LahiEsimies esimies = new LahiEsimies();
		Paallikko paallikko = new Paallikko();
		Toimitusjohtaja toimitusjohtaja = new Toimitusjohtaja();
		esimies.setSuccessor(paallikko);
		paallikko.setSuccessor(toimitusjohtaja);
		try {
		while (true) {
		System.out.println("Kuinka monen prosentin palkankorotuksen työntekijä haluaa?");System.out.print(">");
		double d = Double.parseDouble(new BufferedReader(new
		InputStreamReader(System.in)).readLine());
		esimies.processRequest(new KorotusPyynto(d));
		}
		} catch(Exception e) {
		System.exit(1);
		}
		}
		
	}
