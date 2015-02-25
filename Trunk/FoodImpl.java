package a4jedi;

public abstract class FoodImpl extends SuppliesImpl implements Food{

	private int fill;
	private int expiration;
	
	FoodImpl(int lb_unit, int price_unit,String name, int amount,int fill,int expiration){
		super(lb_unit,price_unit,name,amount);
		this.fill = fill;
		this.expiration = expiration;
	}
	
	public void consume() throws NoFoodException{
		if (amount >= 1){
			amount--;
		}
		else{
			throw new NoFoodException();
		}
		
	}

	public int getDaysTillExpiration() {
		return expiration;
	}

	public void age() throws FoodExpiredException {
		if (expiration > 1){
			expiration --;
		}
		else{
			throw new FoodExpiredException();
		}
	}

 	public int getFill() {
		return fill;
	}

}
