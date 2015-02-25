package a4jedi;

public interface Person {
	int getCurrentHP();
	int getMaxHP();
	int getSkill();
	
	void eat(Food food) throws NoFoodException;
	Status getStatus();
	void setStatus(Status new_status);
	String getName();
	
	void special();
	
	public enum Status {
		HEALTHY,
		NOROVIRUS,
		DYSENTERY;
	}
}