package abstractfactory;

public class BossFactory implements ClothingFactory {

	@Override
	public Hat createHat() {
		return new BossHat();
	}

	@Override
	public Shirt createShirt() {
		return new BossShirt();
	}

	@Override
	public Pants createPants() {
		return new BossPants();
	}

	@Override
	public Shoes createShoes() {
		return new BossShoes();
	}

}
