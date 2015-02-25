package a4jedi;

public class BisonJerky extends FoodImpl {
	
	private static final int LB_UNIT = 5;
	private static final int PRICE_UNIT = 10;
	private static final int FILL = 6;
	private static final int EXPIRATION = 40;
	private static final String NAME = "bison jerky";
	
	public BisonJerky(int amount) {
		super(LB_UNIT,PRICE_UNIT,NAME,amount,FILL,EXPIRATION);
	}

}
