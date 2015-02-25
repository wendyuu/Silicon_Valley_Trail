package a4jedi;

public class RedBison extends PowerUpImpl {

	private static final int LB_UNIT = 2;
	private static final int PRICE_UNIT = 7;
	private static final int FILL = -10;
	private static final int EXPIRATION = 100;
	private static final int DURATION = 5;
	private static final String NAME = "Red Bison";
	
	public RedBison(int amount) {
		super(LB_UNIT,PRICE_UNIT,NAME,amount,FILL,EXPIRATION,DURATION);
	}

}
