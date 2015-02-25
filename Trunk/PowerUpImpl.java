package a4jedi;

public abstract class PowerUpImpl extends FoodImpl implements PowerUp{


	private int duration;
	
	PowerUpImpl(int lb_unit,int price_unit,String name,int amount,int fill,int expiration,int duration){
		super(lb_unit,price_unit, name,amount,fill, expiration);
		this.duration = duration;
	}
	
	public int getDuration() {
		return duration;
	}

}
