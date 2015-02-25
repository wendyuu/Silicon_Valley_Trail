package a4jedi;

public abstract class SuppliesImpl implements Supplies{

	protected String name;
	protected int lb_unit;
	protected int amount;
	protected int price_unit;
	
	SuppliesImpl(int lb_unit, int price_unit,String name, int amount){
		this.setAmount(amount);
		this.lb_unit = lb_unit;
		this.price_unit = price_unit;
		this.name = name;
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		if (amount < 0){
			throw new IllegalArgumentException("amount can't be negative");
		}
		else{
			this.amount = amount;
		}
	}

	public int getPoundsPerItem() {
		return lb_unit;
	}

	public int getTotalWeight() {
		return lb_unit*amount;
	}

	public int getPricePerItem() {
		return price_unit;
	}

	public String getName() {
		return name;
	}
	

}
