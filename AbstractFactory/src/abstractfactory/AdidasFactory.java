package abstractfactory;

public class AdidasFactory implements ClothingFactory{

	@Override
	public Hat createHat() {
		return new AdidasHat();
	}

	@Override
	public Shirt createShirt() {
		return new AdidasShirt();
	}

	@Override
	public Pants createPants() {
		return new AdidasPants();
	}

	@Override
	public Shoes createShoes() {
		return new AdidasShoes();
	}

}
