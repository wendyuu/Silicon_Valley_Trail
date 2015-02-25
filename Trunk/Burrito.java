package a4jedi;

public class Burrito extends FoodImpl {
	
	private static final int LB_UNIT = 5;
	private static final int PRICE_UNIT = 7;
	private static final int FILL = 10;
	private static final int EXPIRATION = 5;
	private static final String NAME = "burrito";
	
	public Burrito(int amount) {
		super(LB_UNIT,PRICE_UNIT,NAME,amount,FILL,EXPIRATION);
	}

}
