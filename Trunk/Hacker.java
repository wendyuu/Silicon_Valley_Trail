package a4jedi;


public class Hacker extends PersonImpl {

	private boolean beast_mode = false;
	
	public Hacker(String name) {
		super(name,60+(int)(Math.random()*41),60+(int)(Math.random()*41));
	}
	
	@Override
	public void special() {
		beast_mode = true;
	}
	
	@Override
	public void eat(Food food) throws NoFoodException{
		if (food == null){
			throw new IllegalArgumentException("food non-existant");
		}
		else{
			food.consume();
			int tmp_hp = current_hp - food.getFill();
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
}
