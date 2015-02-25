package a4jedi;

public class Brogrammer extends PersonImpl {
		
	public Brogrammer(String name) {
		super(name,110+(int)(Math.random()*71),10+(int)(Math.random()*31));	
	}

	@Override
	public void special() {
		this.setStatus(Status.HEALTHY);
	}

}
