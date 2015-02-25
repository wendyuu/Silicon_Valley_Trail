package a4jedi;

public abstract class PersonImpl implements Person {

	private Status status;
	protected int current_hp;
	protected int max_hp;
	protected int java_skill;
	private String name;
	
	PersonImpl(String name,int max_hp,int java_skill) {
		if (name == null){
			throw new IllegalArgumentException("name is null");
		}
		status = Status.HEALTHY;
		this.max_hp = max_hp;
		this.java_skill = java_skill;
		this.name = name;
		this.current_hp = max_hp;
	}

	public int getCurrentHP() {
		return current_hp;
	}

	public int getMaxHP() {
		return max_hp;
	}

	public int getSkill() {
		return java_skill;
	}

	public void eat(Food food) throws NoFoodException{
		if (food == null){
			throw new IllegalArgumentException("food non-existant");
		}
		else{
			food.consume();
			int tmp_hp = current_hp + food.getFill();
			if (tmp_hp<max_hp && tmp_hp>=0){
				current_hp = tmp_hp;
			}
			else if (tmp_hp >= max_hp){
				current_hp = max_hp;
			}
			else{
				current_hp = 0;
			}
		}
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status new_status) {
		status = new_status;
	}

	public String getName() {
		return name;
	}

}
