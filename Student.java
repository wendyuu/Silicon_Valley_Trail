package a4jedi;

public class Student extends PersonImpl {

	public Student(String name) {
		super(name,80+(int)(Math.random()*41),30+(int)(Math.random()*41));	
	}

	@Override
	public void special() {
		java_skill++;
	}

}
