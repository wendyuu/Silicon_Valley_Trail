package a4jedi;

public class ButtonUp extends ClothingImpl {

	private static final int LB_UNIT = 5;
	private static final int PRICE_UNIT = 50;
	private static final Warmth WARMTH = Clothing.Warmth.MEDIUM;
	private static final String NAME = "button-up";
	
	public ButtonUp(int amount) {
		super(LB_UNIT,PRICE_UNIT,NAME,amount,WARMTH);
	}

}
