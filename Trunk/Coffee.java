package a4jedi;

public class Coffee extends PowerUpImpl {
	
	private static final int LB_UNIT = 1;
	private static final int PRICE_UNIT = 5;
	private static final int FILL = 0;
	private static final int EXPIRATION = 100;
	private static final int DURATION = 1;
	private static final String NAME = "coffee";
	
	public Coffee(int amount) {
		super(LB_UNIT,PRICE_UNIT,NAME,amount,FILL,EXPIRATION,DURATION);
	}

}
