package a4jedi;

public class TShirt extends ClothingImpl {

	private static final int LB_UNIT = 1;
	private static final int PRICE_UNIT = 20;
	private static final Warmth WARMTH = Clothing.Warmth.LIGHT;
	private static final String NAME = "t-shirt";
	public TShirt(int amount) {
		super(LB_UNIT,PRICE_UNIT,NAME,amount,WARMTH);
	}

}
