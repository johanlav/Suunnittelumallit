package abstractfactory;

public class Outfit {
	
	
	private ClothingFactory factory;
	private Hat hat;
	private Shirt shirt;
	private Pants pants;
	private Shoes shoes;
	
	public Outfit(ClothingFactory factory) {
		this.factory = factory;
		
	}
	
	public void createOutfit() {
		this.hat = factory.createHat();
		this.shirt = factory.createShirt();
		this.pants = factory.createPants();
		this.shoes = factory.createShoes();
		
	}
	
	public void wear() {
		System.out.println("Jasperilla on päällään");
		hat.wear();
		shirt.wear();
		pants.wear();
		shoes.wear();
	}
		
}


