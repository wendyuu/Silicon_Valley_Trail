package a4jedi;

public class Fleece extends ClothingImpl {

	private static final int LB_UNIT = 10;
	private static final int PRICE_UNIT = 100;
	private static final Warmth WARMTH = Clothing.Warmth.WARM;
	private static final String NAME = "fleece";
	
	public Fleece(int amount) {
		super(LB_UNIT,PRICE_UNIT,NAME,amount,WARMTH);
	}

}
