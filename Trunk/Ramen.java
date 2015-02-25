package a4jedi;

public class Ramen extends FoodImpl {
	
	private static final int LB_UNIT = 1;
	private static final int PRICE_UNIT = 1;
	private static final int FILL = 1;
	private static final int EXPIRATION = 1000;
	private static final String NAME = "ramen noodles";
	
	public Ramen(int amount) {
		super(LB_UNIT,PRICE_UNIT,NAME,amount,FILL,EXPIRATION);
	}

}
