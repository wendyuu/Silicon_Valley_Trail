package a4jedi;

public interface Clothing extends Supplies {
		
	Warmth getWarmth();
	public enum Warmth {
		LIGHT,
		MEDIUM,
		WARM;
	}	
}