package a4jedi;

public abstract class ClothingImpl extends SuppliesImpl implements Clothing{

	private Warmth warmth;
	
	public ClothingImpl(int lb_unit, int price_unit,String name, int amount,Warmth warmth){
		super(lb_unit,price_unit,name,amount);
		this.warmth = warmth;
		this.name = name;
	}
	
	public Warmth getWarmth(){
		return warmth;
	}
}
