package abstractfactory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Onko Jasper opiskelija vai valmistunut insinööri? ");
        String status = reader.nextLine();
        if (status.equals("opiskelija")){
        	Outfit Jasper = new Outfit(new AdidasFactory());
    		Jasper.createOutfit();
    		Jasper.wear();
    		
        } else if (status.equals("insinööri")) {
        	Outfit Jasper = new Outfit(new BossFactory());
    		Jasper.createOutfit();
    		Jasper.wear();
        }
	
	}

}
