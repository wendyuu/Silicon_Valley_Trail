package a4jedi;

public class Sushi extends FoodImpl {
	
	private static final int LB_UNIT = 3;
	private static final int PRICE_UNIT = 15;
	private static final int FILL = 15;
	private static final int EXPIRATION = 2;
	private static final String NAME = "sushi";
	
	public Sushi(int amount) {
		super(LB_UNIT,PRICE_UNIT,NAME,amount,FILL,EXPIRATION);
	}

}
