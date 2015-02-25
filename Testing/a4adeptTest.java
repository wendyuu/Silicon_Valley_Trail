package a4junit;
import a4adept.*;
import static org.junit.Assert.*;
import a4adept.*;

import org.junit.Test;

public class a4adeptTest {

	@Test
	public void checkStudentMaxHPRange() {
	    Person a;
	    int highMaxHP = -10000;
	    int lowMaxHP = 10000;
	    Class b = Student.class;
	    for (int i = 0; i < 100000; i++) {
	        a = new Student("A");
	        
	        if (a.getMaxHP() < lowMaxHP) {
	            lowMaxHP = a.getMaxHP();
	        }
	        if (a.getMaxHP() > highMaxHP) {
	            highMaxHP = a.getMaxHP();
	        }
	    }

	    if (highMaxHP == lowMaxHP) {
	        System.out.println(b + ": The highest possible max HP is the same "
	        		+ "as the lowest possible max HP. Check that the method "
	        		+ "is returning a random number, and re-run the test.");
	        fail();
	    }

	    if (lowMaxHP != 80) {
	        System.out.println(b + ": The lowest possible max HP is " 
	        		+ lowMaxHP + " and it should be 80.");
	        fail();
	    }

	    if (highMaxHP != 120) {
	        System.out.println(b + ": The highest possible max HP is " 
	        		+ highMaxHP + " and it should be 120.");
	        fail();
	    }

	}
	
	@Test
	public void checkBrogrammerMaxHPRange() {
	    Person a;
	    int highMaxHP = -10000;
	    int lowMaxHP = 10000;
	    Class b = Brogrammer.class;

	    for (int i = 0; i < 100000; i++) {
	        a = new Brogrammer("A");
	        
	        if (a.getMaxHP() < lowMaxHP) {
	            lowMaxHP = a.getMaxHP();
	        }
	        if (a.getMaxHP() > highMaxHP) {
	            highMaxHP = a.getMaxHP();
	        }
	    }

	    if (highMaxHP == lowMaxHP) {
	        System.out.println(b + ": The highest possible max HP is the same "
	        		+ "as the lowest possible max HP. Check that the method "
	        		+ "is returning a random number, and re-run the test.");
	        fail();
	    }

	    if (lowMaxHP != 110) {
	        System.out.println(b + ": The lowest possible max HP is " 
	        		+ lowMaxHP + " and it should be 110.");
	        fail();
	    }

	    if (highMaxHP != 180) {
	        System.out.println(b + ": The highest possible max HP is "
	        		+ highMaxHP + " and it should be 180.");
	        fail();
	    }

	}
	
	@Test
	public void checkHackerMaxHPRange() {
	    Person a;
	    int highMaxHP = -10000;
	    int lowMaxHP = 10000;
	    Class b = Hacker.class;

	    for (int i = 0; i < 100000; i++) {
	        a = new Hacker("A");
	        
	        if (a.getMaxHP() < lowMaxHP) {
	            lowMaxHP = a.getMaxHP();
	        }
	        if (a.getMaxHP() > highMaxHP) {
	            highMaxHP = a.getMaxHP();
	        }
	    }

	    if (highMaxHP == lowMaxHP) {
	        System.out.println(b + ": The highest possible max HP is the same "
	        		+ "as the lowest possible max HP. Check that the method "
	        		+ "is returning a random number, and re-run the test.");
	        fail();
	    }

	    if (lowMaxHP != 60) {
	        System.out.println(b + ": The lowest possible max HP is " 
	        		+ lowMaxHP + " and it should be 60.");
	        fail();
	    }

	    if (highMaxHP != 100) {
	        System.out.println(b + ": The highest possible max HP is " 
	        		+ highMaxHP + " and it should be 100.");
	        fail();
	    }

	}
	
	@Test
	public void checkStudentJavaSkillRange() {
	    Person a;
	    int highJavaSkill = -10000;
	    int lowJavaSkill = 10000;
	    Class b = Student.class;

	    for (int i = 0; i < 100000; i++) {
	        a = new Student("A");
	        
	        if (a.getSkill() < lowJavaSkill) {
	            lowJavaSkill = a.getSkill();
	        }
	        if (a.getSkill() > highJavaSkill) {
	            highJavaSkill = a.getSkill();
	        }
	    }

	    if (highJavaSkill == lowJavaSkill) {
	        System.out.println(b + ": The highest possible java skill is the "
	        		+ "same as the lowest possible java skill. Check that "
	        		+ "the method is returning a random number, and re-run "
	        		+ "the test.");
	        fail();
	    }

	    if (lowJavaSkill != 30) {
	        System.out.println(b + ": The lowest java skill is " + lowJavaSkill
	        		+ " and it should be 30.");
	        fail();
	    }

	    if (highJavaSkill != 70) {
	        System.out.println(b + ": The highest possible java skill is " 
	        		+ highJavaSkill + " and it should be 70.");
	        fail();
	    }

	}
	
	@Test
	public void checkBrogrammerJavaSkillRange() {
	    Person a;
	    int highJavaSkill = -10000;
	    int lowJavaSkill = 10000;
	    Class b = Brogrammer.class;

	    for (int i = 0; i < 100000; i++) {
	        a = new Brogrammer("A");
	        
	        if (a.getSkill() < lowJavaSkill) {
	            lowJavaSkill = a.getSkill();
	        }
	        if (a.getSkill() > highJavaSkill) {
	            highJavaSkill = a.getSkill();
	        }
	    }

	    if (highJavaSkill == lowJavaSkill) {
	        System.out.println(b + ": The highest possible java skill is the "
	        		+ "same as the lowest possible java skill. Check that "
	        		+ "the method is returning a random number, and re-run "
	        		+ "the test.");
	        fail();
	    }

	    if (lowJavaSkill != 10) {
	        System.out.println(b + ": The lowest possible java skill is "
	        		+ lowJavaSkill + " and it should be 10.");
	        fail();
	    }

	    if (highJavaSkill != 40) {
	        System.out.println(b+ ": The highest possible java skill is "
	        		+ highJavaSkill + " and it should be 40.");
	        fail();
	    }

	}
	
	@Test
	public void checkHackerJavaSkillRange() {
	    Person a;
	    int highJavaSkill = -10000;
	    int lowJavaSkill = 10000;
	    Class b = Hacker.class;

	    for (int i = 0; i < 100000; i++) {
	        a = new Hacker("A");
	        
	        if (a.getSkill() < lowJavaSkill) {
	            lowJavaSkill = a.getSkill();
	        }
	        if (a.getSkill() > highJavaSkill) {
	            highJavaSkill = a.getSkill();
	        }
	    }

	    if (highJavaSkill == lowJavaSkill) {
	        System.out.println(b + ": The highest possible java skill is the "
	        		+ "same as the lowest possible java skill. Check that "
	        		+ "the method is returning a random number, and re-run "
	        		+ "the test.");
	        fail();
	    }

	    if (lowJavaSkill != 60) {
	        System.out.println(b + ": The lowest possible java skill is " 
	        		+ lowJavaSkill + " and it should be 60.");
	        fail();
	    }

	    if (highJavaSkill != 100) {
	        System.out.println(b + ": The highest possible java skill is " 
	        		+ highJavaSkill + " and it should be 100.");
	        fail();
	    }

	}
	
	@Test
	public void StudentTest() {
		Person a = new Student("abcdefg");
		Class b = Student.class;
		Person c = new Student("C");
		Person d = new Student("D");
		
		int origHP = a.getCurrentHP();
		PowerUp rb = new RedBison(100);
		Food s = new Sushi(100);
 		Food bur = new Burrito(0);
		Food f = null;
		
		try{assertEquals(a.getMaxHP(), a.getCurrentHP());
		} catch (AssertionError ae) {
			System.out.println(b + ".getCurrentHP() does not return the "
					+ "correct value upon intialization");
			System.out.println("Expected: max HP equal to current HP");
			System.out.println("Actual: max HP = " + a.getMaxHP() + ", current"
					+ " HP = " + a.getCurrentHP());
			fail();
		}
		
		try {a.eat(rb);} catch (Exception e) {System.out.println(b + 
				": Caught unexpected exception on .eat() method");
				e.printStackTrace();
		}
		
		try{assertEquals(a.getCurrentHP(), origHP-10);
		} catch (AssertionError ae) {
			System.out.println(b + ".eat() does not increase/decrease "
					+ "HP when called");
			System.out.println("Expected: " + (origHP-10));
			System.out.println("Actual: " + a.getCurrentHP());
			fail();
		}
		
		try{assertEquals(rb.getAmount(), 99);
		} catch (AssertionError ae) {
			System.out.println(b + ".eat() does not decrement the food amount "
					+ "when called");
			System.out.println("Expected: 99");
			System.out.println("Actual: " + rb.getAmount());
			fail();
		}
		
		boolean illegalArgExcept = false;
		boolean nofoodExcept = false;
		
		try{a.eat(f);
		} catch (IllegalArgumentException iae) {
			illegalArgExcept = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception");
				e.printStackTrace();
		}
		
		try{a.eat(bur);
		} catch (NoFoodException nfe) {
			nofoodExcept = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception");
				e.printStackTrace();
		}
		
		try{assertTrue(illegalArgExcept);
		} catch (AssertionError ae) {
			System.out.println(b + ".eat() method does not throw "
					+ "IllegalArgumentException correctly");
			fail();
		}
		
		try{assertTrue(nofoodExcept);
		} catch (AssertionError ae) {
			System.out.println(b + ".eat() method does not throw "
					+ "NoFoodException correctly");
			fail();
		}
		
		for (int i = 0; i<99; i++) {
			try {c.eat(rb);}
			catch (Exception e) {System.out.println(b + ": Caught "
					+ "unexpected exception on .eat() method");
					e.printStackTrace();
			}
		}
		
		for (int i = 0; i<100; i++) {
			try {d.eat(s);}
			catch (Exception e) {System.out.println(b + ": Caught "
					+ "unexpected exception on .eat() method");
					e.printStackTrace();
			}
		}
		
		try{assertEquals(c.getCurrentHP(), 0);
		} catch (AssertionError ae) {
			System.out.println(b + ": lowest possible current HP is not "
					+ "the correct value");
			System.out.println("Expected: current HP = 0");
			System.out.println("Actual: current HP = " + c.getCurrentHP());
			fail();
		}
		
		try{assertEquals(d.getCurrentHP(), d.getMaxHP());
		} catch (AssertionError ae) {
			System.out.println(b + ": highest possible current HP is not "
					+ "the correct value");
			System.out.println("Expected: current HP = " + d.getMaxHP());
			System.out.println("Actual: current HP = " + d.getCurrentHP());
			fail();
		}
	
		try{assertEquals(a.getStatus(), Person.Status.HEALTHY);
		} catch (AssertionError ae) {
			System.out.println(b + ".getStatus() does not return the "
					+ "correct value");
			System.out.println("Expected: HEALTHY");
			System.out.println("Actual: " + a.getStatus());
			fail();
		}
		
		a.setStatus(Person.Status.NOROVIRUS);
		
		try{assertEquals(a.getStatus(), Person.Status.NOROVIRUS);
		} catch (AssertionError ae) {
			System.out.println(b + ".setStatus() does not set status to the "
					+ "expected value");
			System.out.println("Expected: NOROVIRUS");
			System.out.println("Actual: " + a.getStatus());
			fail();
		}
		
		try{assertTrue(a.getName().equals("abcdefg"));
		} catch (AssertionError ae) {
			System.out.println(b + ".getName() does not return the expected "
					+ "value");
			System.out.println("Expected: abcdefg");
			System.out.println("Actual: " + a.getName());
			fail();
		}
		
		boolean illegalConstruct = false;
		
		try {Person e = new Student(null);
		} catch (IllegalArgumentException iae) {
			illegalConstruct = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on constructor");
				e.printStackTrace();
		}
		
		try {assertTrue(illegalConstruct);
		} catch (AssertionError ae) {
			System.out.println(b + " constructor does not throw "
					+ "IllegalArgumentException if name parameter is null");
			fail();
		}
		
		Person g = new Student("G");
		int javabaseline = g.getSkill();
		g.special();
		try {
		assertEquals(g.getSkill(), javabaseline+1);
		} catch (AssertionError ae) {
			System.out.println(b + ".special() method does not "
								+ "increase java skill by 1");
			fail();
		}
	}
	
	@Test
	public void BrogrammerTest() {
		Person a = new Brogrammer("abcdefg");
		Class b = Brogrammer.class;
		Person c = new Brogrammer("C");
		Person d = new Brogrammer("D");
		
		int origHP = a.getCurrentHP();
		PowerUp rb = new RedBison(100);
		Food s = new Sushi(100);
 		Food bur = new Burrito(0);
		Food f = null;
		
		try{assertEquals(a.getMaxHP(), a.getCurrentHP());
		} catch (AssertionError ae) {
			System.out.println(b + ".getCurrentHP() does not return the "
					+ "correct value upon intialization");
			System.out.println("Expected: max HP equal to current HP");
			System.out.println("Actual: max HP = " + a.getMaxHP() + ", current"
					+ " HP = " + a.getCurrentHP());
			fail();
		}
		
		try {a.eat(rb);} catch (Exception e) {System.out.println(b + 
				": Caught unexpected exception on .eat() method");
				e.printStackTrace();
		}
		
		try{assertEquals(a.getCurrentHP(), origHP-10);
		} catch (AssertionError ae) {
			System.out.println(b + ".eat() does not increase/decrease "
					+ "HP when called");
			System.out.println("Expected: " + (origHP-10));
			System.out.println("Actual: " + a.getCurrentHP());
			fail();
		}
		
		try{assertEquals(rb.getAmount(), 99);
		} catch (AssertionError ae) {
			System.out.println(b + ".eat() does not decrement the food amount "
					+ "when called");
			System.out.println("Expected: 99");
			System.out.println("Actual: " + rb.getAmount());
			fail();
			
		}
		
		boolean illegalArgExcept = false;
		boolean nofoodExcept = false;
		
		try{a.eat(f);
		} catch (IllegalArgumentException iae) {
			illegalArgExcept = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on eat() method");
				e.printStackTrace();
		}
		
		try{a.eat(bur);
		} catch (NoFoodException nfe) {
			nofoodExcept = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on eat() method");
				e.printStackTrace();
		}
		
		try{assertTrue(illegalArgExcept);
		} catch (AssertionError ae) {
			System.out.println(b + ".eat() method does not throw "
					+ "IllegalArgumentException correctly");
			fail();
		}
		
		try{assertTrue(nofoodExcept);
		} catch (AssertionError ae) {
			System.out.println(b + ".eat() method does not throw "
					+ "NoFoodException correctly");
			fail();
		}
		
		for (int i = 0; i<99; i++) {
			try {c.eat(rb);} catch (Exception e) {System.out.println(b 
					+ ": Caught unexpected exception on eat() method");
					e.printStackTrace();
			}
		}
		
		for (int i = 0; i<100; i++) {
			try {d.eat(s);} catch (Exception e) {System.out.println(b 
					+ ": Caught unexpected exception on eat() method");
					e.printStackTrace();
			}
		}
		
		try{assertEquals(c.getCurrentHP(), 0);
		} catch (AssertionError ae) {
			System.out.println(b + ": lowest possible current HP is not "
					+ "the correct value");
			System.out.println("Expected: current HP = 0");
			System.out.println("Actual: current HP = " + c.getCurrentHP());
			fail();
		}
		
		try{assertEquals(d.getCurrentHP(), d.getMaxHP());
		} catch (AssertionError ae) {
			System.out.println(b + ": highest possible current HP is not "
					+ "the correct value");
			System.out.println("Expected: current HP = " + d.getMaxHP());
			System.out.println("Actual: current HP = " + d.getCurrentHP());
			fail();
		}
	
		try{assertEquals(a.getStatus(), Person.Status.HEALTHY);
		} catch (AssertionError ae) {
			System.out.println(b + ".getStatus() does not return the "
					+ "correct value");
			System.out.println("Expected: HEALTHY");
			System.out.println("Actual: " + a.getStatus());
			fail();
		}
		
		a.setStatus(Person.Status.NOROVIRUS);
		
		try{assertEquals(a.getStatus(), Person.Status.NOROVIRUS);
		} catch (AssertionError ae) {
			System.out.println(b + ".setStatus() does not set status to the "
					+ "expected value");
			System.out.println("Expected: NOROVIRUS");
			System.out.println("Actual: " + a.getStatus());
			fail();
		}
		
		try{assertTrue(a.getName().equals("abcdefg"));
		} catch (AssertionError ae) {
			System.out.println(b + ".getName() does not return the expected "
					+ "value");
			System.out.println("Expected: abcdefg");
			System.out.println("Actual: " + a.getName());
			fail();
		}
		
		boolean illegalConstruct = false;
		
		try {Person e = new Brogrammer(null);
		} catch (IllegalArgumentException iae) {
			illegalConstruct = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on constructor");
				e.printStackTrace();
		}
		
		try {assertTrue(illegalConstruct);
		} catch (AssertionError ae) {
			System.out.println(b + " constructor does not throw "
					+ "IllegalArgumentException if name parameter is null");
			fail();
		}
		
		Person g = new Brogrammer("A");
		g.setStatus(Person.Status.NOROVIRUS);
		g.special();
		try {
		assertEquals(g.getStatus(), Person.Status.HEALTHY);
		} catch (AssertionError ae) {
			System.out.println(b + ".special() method does not "
								+ "return status to HEALTHY");
			fail();
		}
	}
	
	@Test
	public void HackerTest() {
		Person a = new Hacker("abcdefg");
		Class b = Hacker.class;
		Person c = new Hacker("C");
		Person d = new Hacker("D");
		
		int origHP = a.getCurrentHP();
		PowerUp rb = new RedBison(99);
		Food s = new Sushi(101);
 		Food bur = new Burrito(0);
		Food f = null;
		
		try{assertEquals(a.getMaxHP(), a.getCurrentHP());
		} catch (AssertionError ae) {
			System.out.println(b + ".getCurrentHP() does not return the "
					+ "correct value upon intialization");
			System.out.println("Expected: max HP equal to current HP");
			System.out.println("Actual: max HP = " + a.getMaxHP() + ", current"
					+ " HP = " + a.getCurrentHP());
			fail();
		}
		
		try {a.eat(s);} catch (Exception e) {System.out.println(b 
				+ ": Caught unexpected exception on eat() method");
				e.printStackTrace();
		}
		
		try{assertEquals(a.getCurrentHP(), origHP-15);
		} catch (AssertionError ae) {
			System.out.println(b + ".eat() does not increase/decrease "
					+ "HP when called");
			System.out.println("Expected: " + (origHP-15));
			System.out.println("Actual: " + a.getCurrentHP());
			fail();
		}
		
		try{assertEquals(s.getAmount(), 100);
		} catch (AssertionError ae) {
			System.out.println(b + ".eat() does not decrement the food amount "
					+ "when called");
			System.out.println("Expected: 100");
			System.out.println("Actual: " + s.getAmount());
			fail();
		}
		
		boolean illegalArgExcept = false;
		boolean nofoodExcept = false;
		
		try{a.eat(f);
		} catch (IllegalArgumentException iae) {
			illegalArgExcept = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on eat() method");
				e.printStackTrace();
		}
		
		try{a.eat(bur);
		} catch (NoFoodException nfe) {
			nofoodExcept = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on eat() method");
				e.printStackTrace();
		}
		
		try{assertTrue(illegalArgExcept);
		} catch (AssertionError ae) {
			System.out.println(b + ".eat() method does not throw "
					+ "IllegalArgumentException correctly");
			fail();
		}
		
		try{assertTrue(nofoodExcept);
		} catch (AssertionError ae) {
			System.out.println(b + ".eat() method does not throw "
					+ "NoFoodException correctly");
			fail();
		}
		
		for (int i = 0; i<70; i++) {
			try {d.eat(rb);} catch (Exception e) {System.out.println(b 
					+ ": Caught unexpected exception on eat() method");
					e.printStackTrace();
			}
		}
		
		for (int i = 0; i<70; i++) {
			try {c.eat(s);} catch (Exception e) {System.out.println(b 
					+ ": Caught unexpected exception on eat() method");
					e.printStackTrace();
			}
		}
		
		try{assertEquals(c.getCurrentHP(), 0);
		} catch (AssertionError ae) {
			System.out.println(b + ": lowest possible current HP is not "
					+ "the correct value");
			System.out.println("Expected: current HP = 0");
			System.out.println("Actual: current HP = " + c.getCurrentHP());
			fail();
		}
		
		try{assertEquals(d.getCurrentHP(), d.getMaxHP());
		} catch (AssertionError ae) {
			System.out.println(b + ": highest possible current HP is not "
					+ "the correct value");
			System.out.println("Expected: current HP = " + d.getMaxHP());
			System.out.println("Actual: current HP = " + d.getCurrentHP());
		}
	
		try{assertEquals(a.getStatus(), Person.Status.HEALTHY);
		} catch (AssertionError ae) {
			System.out.println(b + ".getStatus() does not return the "
					+ "correct value");
			System.out.println("Expected: HEALTHY");
			System.out.println("Actual: " + a.getStatus());
			fail();
		}
		
		a.setStatus(Person.Status.NOROVIRUS);
		
		try{assertEquals(a.getStatus(), Person.Status.NOROVIRUS);
		} catch (AssertionError ae) {
			System.out.println(b + ".setStatus() does not set status to the "
					+ "expected value");
			System.out.println("Expected: NOROVIRUS");
			System.out.println("Actual: " + a.getStatus());
			fail();
		}
		
		try{assertTrue(a.getName().equals("abcdefg"));
		} catch (AssertionError ae) {
			System.out.println(b + ".getName() does not return the expected "
					+ "value");
			System.out.println("Expected: abcdefg");
			System.out.println("Actual: " + a.getName());
			fail();
		}
		
		boolean illegalConstruct = false;
		
		try {Person e = new Hacker(null);
		} catch (IllegalArgumentException iae) {
			illegalConstruct = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on constructor");
				e.printStackTrace();
		}
		
		try {assertTrue(illegalConstruct);
		} catch (AssertionError ae) {
			System.out.println(b + " constructor does not throw "
					+ "IllegalArgumentException if name parameter is null");
			fail();
		}
		
//		Person g = new Hacker("A");
//		g.special();
//		try {
//		assertTrue(((Hacker) g).getBeastModeStatus()); 
//		} catch (AssertionError ae) {
//			System.out.println("Hacker.special() method does not "
//								+ "enable beast mode");
//			fail();
//		}
	}
	
	@Test
	public void RamenTest() {
		Food a = new Ramen(10);
		Class b = Ramen.class;
		
		try {assertEquals(a.getAmount(), 10);
		} catch (AssertionError ae) {
			System.out.println(b + ".getAmmount() does not "
					+ "return expected value");
			System.out.println("Expected: 10");
			System.out.println("Actual: " + a.getAmount());
			fail();
		}
		try {assertEquals(a.getPoundsPerItem(), 1);
		} catch (AssertionError ae) {
			System.out.println(b + ".getPoundsPerItem() does not "
					+ "return expected value");
			System.out.println("Expected: 1");
			System.out.println("Actual: " + a.getPoundsPerItem());
			fail();
		}
		
		try {assertEquals(a.getPricePerItem(), 1);
		} catch (AssertionError ae) {
			System.out.println(b + ".getPricePerItem() does not "
					+ "return expected value");
			System.out.println("Expected: 1");
			System.out.println("Actual: " + a.getPricePerItem());
			fail();
		}
		
		try {assertEquals(a.getFill(), 1);
		} catch (AssertionError ae) {
			System.out.println(b + ".getFill() does not "
					+ "return expected value");
			System.out.println("Expected: 1");
			System.out.println("Actual: " + a.getFill());
			fail();
		}
		
		try {assertEquals(a.getName(), "ramen noodles");
		} catch (AssertionError ae) {
			System.out.println(b + ".getName() does not "
					+ "return expected value");
			System.out.println("Expected: ramen noodles");
			System.out.println("Actual: " + a.getName());
			fail();
		}
		
		try {assertEquals(a.getTotalWeight(), 10);	
		} catch (AssertionError ae) {
			System.out.println(b + ".getTotalWeight() does not "
					+ "return expected value");
			System.out.println("Expected: 10");
			System.out.println("Actual: " + a.getTotalWeight());
			fail();
		}
		
		try {assertEquals(a.getDaysTillExpiration(), 1000);
		} catch (AssertionError ae) {
			System.out.println(b + ".getDaysTillExpiration() does not "
					+ "return expected value");
			System.out.println("Expected: 1000");
			System.out.println("Actual: " + a.getDaysTillExpiration());
			fail();
		}
		
		try {a.consume();} catch (Exception e) {System.out.println(b 
				+ ": Caught unexpected exception on consume() method");
				e.printStackTrace();
		}
		
		try {a.age();} catch (Exception e) {System.out.println(b 
				+ ": Caught unexpected exception on age() method");
				e.printStackTrace();
		}

		try {assertEquals(a.getAmount(), 9);
		} catch (AssertionError ae) {
			System.out.println(b + ".consume() does not "
					+ "decrement amount correctly");
			System.out.println("Expected: 9");
			System.out.println("Actual: " + a.getAmount());
			fail();
		}
		
		try {assertEquals(a.getDaysTillExpiration(), 999);
		} catch (AssertionError ae) {
			System.out.println(b + ".age() does not "
					+ "decrement daysTilExpiration correctly");
			System.out.println("Expected: 999");
			System.out.println("Actual: " + a.getDaysTillExpiration());
			fail();
		}
		
		Food c = new Ramen(1);
		boolean expiredException = false;
		boolean nofoodException = false;
		int count = c.getDaysTillExpiration();
		
		try{
			for (int i = 0; i<(count); i++){
				c.age();
			}
		} catch (FoodExpiredException fee) {
			expiredException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on age() method");
				e.printStackTrace();
		}	
		
		c.setAmount(0);
		try {assertEquals(c.getAmount(), 0);
		} catch (AssertionError ae) {
			System.out.println(b + ".setAmmount() does not "
					+ "change amount correctly");
			System.out.println("Expected: 0");
			System.out.println("Actual: " + a.getAmount());
			fail();
		}
		
		try {c.consume();
		} catch (NoFoodException nfe) {
			nofoodException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on consume() method");
				e.printStackTrace();
		}
		
		try {assertTrue(expiredException);
		} catch (AssertionError ae) {
			System.out.println(b + ".age() does not throw "
					+ "FoodExpiredException correctly");
			fail();
		}
		
		try {assertTrue(nofoodException);
		} catch (AssertionError ae) {
			System.out.println(b + ".consume() does not throw "
					+ "NoFoodException correctly");
			fail();
		}
		
		boolean illegalArgException = false;
		
		try {c.setAmount(-1);
		} catch (IllegalArgumentException iae) {
			illegalArgException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on setAmount() method");
				e.printStackTrace();
		}
		
		try{assertTrue(illegalArgException);
		} catch(AssertionError ae) {
			System.out.println(b + ".setAmount() does not throw "
					+ "IllegalArgumentException correctly");
			fail();
		}
		
		boolean constructorError = false;
		
		try{@SuppressWarnings("unused")
		Food d = new Ramen(-1);
		} catch (IllegalArgumentException iae) {
			constructorError = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on constructor");
				e.printStackTrace();
		}
		
		try{assertTrue(constructorError);
		} catch(AssertionError ae) {
			System.out.println(b + " constructor does not throw "
					+ "an IllegalArgumentException for negative amounts");
			fail();
		}
		
	}
	
	@Test
	public void BurritoTest() {
		Food a = new Burrito(10);
		Class b = Burrito.class;
		
		try {assertEquals(a.getAmount(), 10);
		} catch (AssertionError ae) {
			System.out.println(b + ".getAmmount() does not "
					+ "return expected value");
			System.out.println("Expected: 10");
			System.out.println("Actual: " + a.getAmount());
			fail();
		}
		try {assertEquals(a.getPoundsPerItem(), 5);
		} catch (AssertionError ae) {
			System.out.println(b + ".getPoundsPerItem() does not "
					+ "return expected value");
			System.out.println("Expected: 5");
			System.out.println("Actual: " + a.getPoundsPerItem());
			fail();
		}
		
		try {assertEquals(a.getPricePerItem(), 7);
		} catch (AssertionError ae) {
			System.out.println(b + ".getPricePerItem() does not "
					+ "return expected value");
			System.out.println("Expected: 7");
			System.out.println("Actual: " + a.getPricePerItem());
			fail();
		}
		
		try {assertEquals(a.getFill(), 10);
		} catch (AssertionError ae) {
			System.out.println(b + ".getFill() does not "
					+ "return expected value");
			System.out.println("Expected: 10");
			System.out.println("Actual: " + a.getFill());
			fail();
		}
		
		try {assertEquals(a.getName(), "burrito");
		} catch (AssertionError ae) {
			System.out.println(b + ".getName() does not "
					+ "return expected value");
			System.out.println("Expected: burrito");
			System.out.println("Actual: " + a.getName());
			fail();
		}
		
		try {assertEquals(a.getTotalWeight(), 50);	
		} catch (AssertionError ae) {
			System.out.println(b + ".getTotalWeight() does not "
					+ "return expected value");
			System.out.println("Expected: 50");
			System.out.println("Actual: " + a.getTotalWeight());
			fail();
		}
		
		try {assertEquals(a.getDaysTillExpiration(), 5);
		} catch (AssertionError ae) {
			System.out.println(b + ".getDaysTillExpiration() does not "
					+ "return expected value");
			System.out.println("Expected: 5");
			System.out.println("Actual: " + a.getDaysTillExpiration());
			fail();
		}
		
		try {a.consume();} catch (Exception e) {System.out.println(b 
				+ ": Caught unexpected exception on consume() method");
				e.printStackTrace();
		}
		
		try {a.age();} catch (Exception e) {System.out.println(b 
				+ ": Caught unexpected exception on age() method");
				e.printStackTrace();
		}

		try {assertEquals(a.getAmount(), 9);
		} catch (AssertionError ae) {
			System.out.println(b + ".consume() does not "
					+ "decrement amount correctly");
			System.out.println("Expected: 9");
			System.out.println("Actual: " + a.getAmount());
			fail();
		}
		
		try {assertEquals(a.getDaysTillExpiration(), 4);
		} catch (AssertionError ae) {
			System.out.println(b + ".age() does not "
					+ "decrement daysTilExpiration correctly");
			System.out.println("Expected: 4");
			System.out.println("Actual: " + a.getDaysTillExpiration());
			fail();
		}
		
		Food c = new Burrito(1);
		boolean expiredException = false;
		boolean nofoodException = false;
		int count = c.getDaysTillExpiration();
		
		try{
			for (int i = 0; i<(count); i++){
				c.age();
			}
		} catch (FoodExpiredException fee) {
			expiredException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on age() method");
				e.printStackTrace();
		}
		
		c.setAmount(0);
		try {assertEquals(c.getAmount(), 0);
		} catch (AssertionError ae) {
			System.out.println(b + ".setAmmount() does not "
					+ "change amount correctly");
			System.out.println("Expected: 0");
			System.out.println("Actual: " + c.getAmount());
			fail();
		}
		
		try {c.consume();
		} catch (NoFoodException nfe) {
			nofoodException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on consume() method");
				e.printStackTrace();
		}
		
		try {assertTrue(expiredException);
		} catch (AssertionError ae) {
			System.out.println(b + ".age() does not throw "
					+ "FoodExpiredException correctly");
			fail();
		}
		
		try {assertTrue(nofoodException);
		} catch (AssertionError ae) {
			System.out.println(b + ".consume() does not throw "
					+ "NoFoodException correctly");
			fail();
		}
		
		boolean illegalArgException = false;
		
		try {c.setAmount(-1);
		} catch (IllegalArgumentException iae) {
			illegalArgException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on setAmount() method");
				e.printStackTrace();
		}
		
		try{assertTrue(illegalArgException);
		} catch(AssertionError ae) {
			System.out.println(b + ".setAmount() does not throw "
					+ "IllegalArgumentException correctly");
			fail();
		}
		
		boolean constructorError = false;
		
		try{@SuppressWarnings("unused")
		Food d = new Burrito(-1);
		} catch (IllegalArgumentException iae) {
			constructorError = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on constructor");
				e.printStackTrace();
		}
		
		try{assertTrue(constructorError);
		} catch(AssertionError ae) {
			System.out.println(b + " constructor does not throw "
					+ "an IllegalArgumentException for negative amounts");
			fail();
		}
		
	}

	@Test
	public void SushiTest() {
		Food a = new Sushi(10);
		Class b = Sushi.class;
		
		try {assertEquals(a.getAmount(), 10);
		} catch (AssertionError ae) {
			System.out.println(b + ".getAmmount() does not "
					+ "return expected value");
			System.out.println("Expected: 10");
			System.out.println("Actual: " + a.getAmount());
			fail();
		}
		try {assertEquals(a.getPoundsPerItem(), 3);
		} catch (AssertionError ae) {
			System.out.println(b + ".getPoundsPerItem() does not "
					+ "return expected value");
			System.out.println("Expected: 3");
			System.out.println("Actual: " + a.getPoundsPerItem());
			fail();
		}
		
		try {assertEquals(a.getPricePerItem(), 15);
		} catch (AssertionError ae) {
			System.out.println(b + ".getPricePerItem() does not "
					+ "return expected value");
			System.out.println("Expected: 15");
			System.out.println("Actual: " + a.getPricePerItem());
			fail();
		}
		
		try {assertEquals(a.getFill(), 15);
		} catch (AssertionError ae) {
			System.out.println(b + ".getFill() does not "
					+ "return expected value");
			System.out.println("Expected: 15");
			System.out.println("Actual: " + a.getFill());
			fail();
		}
		
		try {assertEquals(a.getName(), "sushi");
		} catch (AssertionError ae) {
			System.out.println(b + ".getName() does not "
					+ "return expected value");
			System.out.println("Expected: sushi");
			System.out.println("Actual: " + a.getName());
			fail();
		}
		
		try {assertEquals(a.getTotalWeight(), 30);	
		} catch (AssertionError ae) {
			System.out.println(b + ".getTotalWeight() does not "
					+ "return expected value");
			System.out.println("Expected: 30");
			System.out.println("Actual: " + a.getTotalWeight());
			fail();
		}
		
		try {assertEquals(a.getDaysTillExpiration(), 2);
		} catch (AssertionError ae) {
			System.out.println(b + ".getDaysTillExpiration() does not "
					+ "return expected value");
			System.out.println("Expected: 2");
			System.out.println("Actual: " + a.getDaysTillExpiration());
			fail();
		}
		
		try {a.consume();} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on consume() method");
				e.printStackTrace();
		}
		
		try {a.age();} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on age() method");
				e.printStackTrace();
		}

		try {assertEquals(a.getAmount(), 9);
		} catch (AssertionError ae) {
			System.out.println(b + ".consume() does not "
					+ "decrement amount correctly");
			System.out.println("Expected: 9");
			System.out.println("Actual: " + a.getAmount());
			fail();
		}
		
		try {assertEquals(a.getDaysTillExpiration(), 1);
		} catch (AssertionError ae) {
			System.out.println(b + ".age() does not "
					+ "decrement daysTilExpiration correctly");
			System.out.println("Expected: 1");
			System.out.println("Actual: " + a.getDaysTillExpiration());
			fail();
		}
		
		Food c = new Sushi(1);
		boolean expiredException = false;
		boolean nofoodException = false;
		int count = c.getDaysTillExpiration();
		
		try{
			for (int i = 0; i<(count); i++){
				c.age();
			}
		} catch (FoodExpiredException fee) {
			expiredException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on age() method");
				e.printStackTrace();
		}
		
		c.setAmount(0);
		try {assertEquals(c.getAmount(), 0);
		} catch (AssertionError ae) {
			System.out.println(b + ".setAmmount() does not "
					+ "change amount correctly");
			System.out.println("Expected: 0");
			System.out.println("Actual: " + c.getAmount());
			fail();
		}
		
		try {c.consume();
		} catch (NoFoodException nfe) {
			nofoodException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on consume() method");
				e.printStackTrace();
		}
		
		try {assertTrue(expiredException);
		} catch (AssertionError ae) {
			System.out.println(b + ".age() does not throw "
					+ "FoodExpiredException correctly");
			fail();
		}
		
		try {assertTrue(nofoodException);
		} catch (AssertionError ae) {
			System.out.println(b + ".consume() does not throw "
					+ "NoFoodException correctly");
			fail();
		}
		
		boolean illegalArgException = false;
		
		try {c.setAmount(-1);
		} catch (IllegalArgumentException iae) {
			illegalArgException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on setAmount() method");
				e.printStackTrace();
		}
		
		try{assertTrue(illegalArgException);
		} catch(AssertionError ae) {
			System.out.println(b + ".setAmount() does not throw "
					+ "IllegalArgumentException correctly");
			fail();
		}
		
		boolean constructorError = false;
		
		try{@SuppressWarnings("unused")
		Food d = new Sushi(-1);
		} catch (IllegalArgumentException iae) {
			constructorError = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on constructor");
				e.printStackTrace();
		}
		
		try{assertTrue(constructorError);
		} catch(AssertionError ae) {
			System.out.println(b + " constructor does not throw "
					+ "an IllegalArgumentException for negative amounts");
			fail();
		}
		
	}
	
	@Test
	public void BisonJerkyTest() {
		Food a = new BisonJerky(10);
		Class b = BisonJerky.class;
		
		try {assertEquals(a.getAmount(), 10);
		} catch (AssertionError ae) {
			System.out.println(b + ".getAmmount() does not "
					+ "return expected value");
			System.out.println("Expected: 10");
			System.out.println("Actual: " + a.getAmount());
			fail();
		}
		try {assertEquals(a.getPoundsPerItem(), 5);
		} catch (AssertionError ae) {
			System.out.println(b + ".getPoundsPerItem() does not "
					+ "return expected value");
			System.out.println("Expected: 5");
			System.out.println("Actual: " + a.getPoundsPerItem());
			fail();
		}
		
		try {assertEquals(a.getPricePerItem(), 10);
		} catch (AssertionError ae) {
			System.out.println(b + ".getPricePerItem() does not "
					+ "return expected value");
			System.out.println("Expected: 10");
			System.out.println("Actual: " + a.getPricePerItem());
			fail();
		}
		
		try {assertEquals(a.getFill(), 6);
		} catch (AssertionError ae) {
			System.out.println(b + ".getFill() does not "
					+ "return expected value");
			System.out.println("Expected: 6");
			System.out.println("Actual: " + a.getFill());
			fail();
		}
		
		try {assertEquals(a.getName(), "bison jerky");
		} catch (AssertionError ae) {
			System.out.println(b + ".getName() does not "
					+ "return expected value");
			System.out.println("Expected: bison jerky");
			System.out.println("Actual: " + a.getName());
			fail();
		}
		
		try {assertEquals(a.getTotalWeight(), 50);	
		} catch (AssertionError ae) {
			System.out.println(b + ".getTotalWeight() does not "
					+ "return expected value");
			System.out.println("Expected: 50");
			System.out.println("Actual: " + a.getTotalWeight());
			fail();
		}
		
		try {assertEquals(a.getDaysTillExpiration(), 40);
		} catch (AssertionError ae) {
			System.out.println(b + ".getDaysTillExpiration() does not "
					+ "return expected value");
			System.out.println("Expected: 40");
			System.out.println("Actual: " + a.getDaysTillExpiration());
			fail();
		}
		
		
		try {a.consume();} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on consume() method");	
				e.printStackTrace();
		}
		
		try {a.age();} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on age() method");
				e.printStackTrace();
		}

		try {assertEquals(a.getAmount(), 9);
		} catch (AssertionError ae) {
			System.out.println(b + ".consume() does not "
					+ "decrement amount correctly");
			System.out.println("Expected: 9");
			System.out.println("Actual: " + a.getAmount());
			fail();
		}
		
		try {assertEquals(a.getDaysTillExpiration(), 39);
		} catch (AssertionError ae) {
			System.out.println(b + ".age() does not "
					+ "decrement daysTilExpiration correctly");
			System.out.println("Expected: 39");
			System.out.println("Actual: " + a.getDaysTillExpiration());
			fail();
		}
		
		Food c = new BisonJerky(1);
		boolean expiredException = false;
		boolean nofoodException = false;
		int count = c.getDaysTillExpiration();
		
		try{
			for (int i = 0; i<(count); i++){
				c.age();
			}
		} catch (FoodExpiredException fee) {
			expiredException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on age() method");
				e.printStackTrace();
		}
		
		c.setAmount(0);
		try {assertEquals(c.getAmount(), 0);
		} catch (AssertionError ae) {
			System.out.println(b + ".setAmmount() does not "
					+ "change amount correctly");
			System.out.println("Expected: 0");
			System.out.println("Actual: " + c.getAmount());
			fail();
		}
		
		try {c.consume();
		} catch (NoFoodException nfe) {
			nofoodException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on consume() method");
			e.printStackTrace();
		}
		
		try {assertTrue(expiredException);
		} catch (AssertionError ae) {
			System.out.println(b + ".age() does not throw "
					+ "FoodExpiredException correctly");
			fail();
		}
		
		try {assertTrue(nofoodException);
		} catch (AssertionError ae) {
			System.out.println(b + ".consume() does not throw "
					+ "NoFoodException correctly");
			fail();
		}
		
		boolean illegalArgException = false;
		
		try {c.setAmount(-1);
		} catch (IllegalArgumentException iae) {
			illegalArgException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on setAmount() method");
				e.printStackTrace();
		}
		
		try{assertTrue(illegalArgException);
		} catch(AssertionError ae) {
			System.out.println(b + ".setAmount() does not throw "
					+ "IllegalArgumentException correctly");
			fail();
		}
		
		boolean constructorError = false;
		
		try{@SuppressWarnings("unused")
		Food d = new BisonJerky(-1);
		} catch (IllegalArgumentException iae) {
			constructorError = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on constructor");
				e.printStackTrace();
		}
		
		try{assertTrue(constructorError);
		} catch(AssertionError ae) {
			System.out.println(b + " constructor does not throw "
					+ "an IllegalArgumentException for negative amounts");
			fail();
		}
		
	}
	
	@Test
	public void CoffeeTest() {
		PowerUp a = new Coffee(10);
		Class b = Coffee.class;
		
		try {assertEquals(a.getAmount(), 10);
		} catch (AssertionError ae) {
			System.out.println(b + ".getAmmount() does not "
					+ "return expected value");
			System.out.println("Expected: 10");
			System.out.println("Actual: " + a.getAmount());
			fail();
		}
		try {assertEquals(a.getPoundsPerItem(), 1);
		} catch (AssertionError ae) {
			System.out.println(b + ".getPoundsPerItem() does not "
					+ "return expected value");
			System.out.println("Expected: 1");
			System.out.println("Actual: " + a.getPoundsPerItem());
			fail();
		}
		
		try {assertEquals(a.getPricePerItem(), 5);
		} catch (AssertionError ae) {
			System.out.println(b + ".getPricePerItem() does not "
					+ "return expected value");
			System.out.println("Expected: 5");
			System.out.println("Actual: " + a.getPricePerItem());
			fail();
		}
		
		try {assertEquals(a.getFill(), 0);
		} catch (AssertionError ae) {
			System.out.println(b + ".getFill() does not "
					+ "return expected value");
			System.out.println("Expected: 0");
			System.out.println("Actual: " + a.getFill());
			fail();
		}
		
		try {assertEquals(a.getName(), "coffee");
		} catch (AssertionError ae) {
			System.out.println(b + ".getName() does not "
					+ "return expected value");
			System.out.println("Expected: coffee");
			System.out.println("Actual: " + a.getName());
			fail();
		}
		
		try {assertEquals(a.getTotalWeight(), 10);	
		} catch (AssertionError ae) {
			System.out.println(b + ".getTotalWeight() does not "
					+ "return expected value");
			System.out.println("Expected: 10");
			System.out.println("Actual: " + a.getTotalWeight());
			fail();
		}
		
		try {assertEquals(a.getDaysTillExpiration(), 100);
		} catch (AssertionError ae) {
			System.out.println(b + ".getDaysTilExpiration() does not "
					+ "return expected value");
			System.out.println("Expected: 100");
			System.out.println("Actual: " + a.getDaysTillExpiration());
			fail();
		}
		
		try {assertEquals(a.getDuration(), 1);
		} catch (AssertionError ae) {
			System.out.println(b + ".getDuration() does not "
					+ "return expected value");
			System.out.println("Expected: 1");
			System.out.println("Actual: " + a.getDuration());
			fail();
		}
		
		try {a.consume();} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on consume() method");
				e.printStackTrace();
		}
		
		try {a.age();} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on age() method");
				e.printStackTrace();
		}

		try {assertEquals(a.getAmount(), 9);
		} catch (AssertionError ae) {
			System.out.println(b + ".consume() does not "
					+ "decrement amount correctly");
			System.out.println("Expected: 9");
			System.out.println("Actual: " + a.getAmount());
			fail();
		}
		
		try {assertEquals(a.getDaysTillExpiration(), 99);
		} catch (AssertionError ae) {
			System.out.println(b + ".age() does not "
					+ "decrement daysTilExpiration correctly");
			System.out.println("Expected: 99");
			System.out.println("Actual: " + a.getDaysTillExpiration());
			fail();
		}
		
		PowerUp c = new Coffee(1);
		boolean expiredException = false;
		boolean nofoodException = false;
		int count = c.getDaysTillExpiration();
		
		try{
			for (int i = 0; i<(count); i++){
				c.age();
			}
		} catch (FoodExpiredException fee) {
			expiredException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on age() method");
				e.printStackTrace();
		}
		
		c.setAmount(0);
		try {assertEquals(c.getAmount(), 0);
		} catch (AssertionError ae) {
			System.out.println(b + ".setAmmount() does not "
					+ "change amount correctly");
			System.out.println("Expected: 0");
			System.out.println("Actual: " + c.getAmount());
			fail();
		}
		
		try {c.consume();
		} catch (NoFoodException nfe) {
			nofoodException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on consume() method");
				e.printStackTrace();
		}
		
		try {assertTrue(expiredException);
		} catch (AssertionError ae) {
			System.out.println(b + ".age() does not throw "
					+ "FoodExpiredException correctly");
			fail();
		}
		
		try {assertTrue(nofoodException);
		} catch (AssertionError ae) {
			System.out.println(b + ".consume() does not throw "
					+ "NoFoodException correctly");
			fail();
		}
		
		boolean illegalArgException = false;
		
		try {c.setAmount(-1);
		} catch (IllegalArgumentException iae) {
			illegalArgException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on setAmount() method");
				e.printStackTrace();
		}
		
		try{assertTrue(illegalArgException);
		} catch(AssertionError ae) {
			System.out.println(b + ".setAmount() does not throw "
					+ "IllegalArgumentException correctly");
			fail();
		}
		
		boolean constructorError = false;
		
		try{@SuppressWarnings("unused")
		PowerUp d = new Coffee(-1);
		} catch (IllegalArgumentException iae) {
			constructorError = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on constructor");
				e.printStackTrace();
		}
		
		try{assertTrue(constructorError);
		} catch(AssertionError ae) {
			System.out.println(b + " constructor does not throw "
					+ "an IllegalArgumentException for negative amounts");
			fail();
		}
		
	}
	
	@Test
	public void RedBisonTest() {
		PowerUp a = new RedBison(10);
		Class b = RedBison.class;
		
		try {assertEquals(a.getAmount(), 10);
		} catch (AssertionError ae) {
			System.out.println(b + ".getAmmount() does not "
					+ "return expected value");
			System.out.println("Expected: 10");
			System.out.println("Actual: " + a.getAmount());
			fail();
		}
		try {assertEquals(a.getPoundsPerItem(), 2);
		} catch (AssertionError ae) {
			System.out.println(b + ".getPoundsPerItem() does not "
					+ "return expected value");
			System.out.println("Expected: 2");
			System.out.println("Actual: " + a.getPoundsPerItem());
			fail();
		}
		
		try {assertEquals(a.getPricePerItem(), 7);
		} catch (AssertionError ae) {
			System.out.println(b + ".getPricePerItem() does not "
					+ "return expected value");
			System.out.println("Expected: 7");
			System.out.println("Actual: " + a.getPricePerItem());
			fail();
		}
		
		try {assertEquals(a.getFill(), -10);
		} catch (AssertionError ae) {
			System.out.println(b + ".getFill() does not "
					+ "return expected value");
			System.out.println("Expected: -10");
			System.out.println("Actual: " + a.getFill());
			fail();		
		}
		
		try {assertEquals(a.getName(), "Red Bison");
		} catch (AssertionError ae) {
			System.out.println(b + ".getName() does not "
					+ "return expected value");
			System.out.println("Expected: Red Bison");
			System.out.println("Actual: " + a.getName());
			fail();
		}
		
		try {assertEquals(a.getTotalWeight(), 20);	
		} catch (AssertionError ae) {
			System.out.println(b + ".getTotalWeight() does not "
					+ "return expected value");
			System.out.println("Expected: 20");
			System.out.println("Actual: " + a.getTotalWeight());
			fail();
		}
		
		try {assertEquals(a.getDaysTillExpiration(), 100);
		} catch (AssertionError ae) {
			System.out.println(b + ".getDaysTillExpiration() does not "
					+ "return expected value");
			System.out.println("Expected: 100");
			System.out.println("Actual: " + a.getDaysTillExpiration());
			fail();
		}
		
		try {assertEquals(a.getDuration(), 5);
		} catch (AssertionError ae) {
			System.out.println(b + ".getDuration() does not "
					+ "return expected value");
			System.out.println("Expected: 5");
			System.out.println("Actual: " + a.getDuration());
			fail();
		}
		
		try {a.consume();} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on consume() method");
				e.printStackTrace();
		}
		
		try {a.age();} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on age() method");
				e.printStackTrace();
		}

		try {assertEquals(a.getAmount(), 9);
		} catch (AssertionError ae) {
			System.out.println(b + ".consume() does not "
					+ "decrement amount correctly");
			System.out.println("Expected: 9");
			System.out.println("Actual: " + a.getAmount());
			fail();
		}
		
		try {assertEquals(a.getDaysTillExpiration(), 99);
		} catch (AssertionError ae) {
			System.out.println(b + ".age() does not "
					+ "decrement daysTilExpiration correctly");
			System.out.println("Expected: 99");
			System.out.println("Actual: " + a.getDaysTillExpiration());
			fail();
		}
		
		PowerUp c = new RedBison(1);
		boolean expiredException = false;
		boolean nofoodException = false;
		int count = c.getDaysTillExpiration();
		
		try{
			for (int i = 0; i<(count); i++){
				c.age();
			}
		} catch (FoodExpiredException fee) {
			expiredException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on age() method");
				e.printStackTrace();
		}
		
		c.setAmount(0);
		try {assertEquals(c.getAmount(), 0);
		} catch (AssertionError ae) {
			System.out.println(b + ".setAmmount() does not "
					+ "change amount correctly");
			System.out.println("Expected: 0");
			System.out.println("Actual: " + c.getAmount());
			fail();
		}
		
		try {c.consume();
		} catch (NoFoodException nfe) {
			nofoodException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on consume() method");
				e.printStackTrace();
		}
		
		try {assertTrue(expiredException);
		} catch (AssertionError ae) {
			System.out.println(b + ".age() does not throw "
					+ "FoodExpiredException correctly");
			fail();
		}
		
		try {assertTrue(nofoodException);
		} catch (AssertionError ae) {
			System.out.println(b + ".consume() does not throw "
					+ "NoFoodException correctly");
			fail();
		}
		
		boolean illegalArgException = false;
		
		try {c.setAmount(-1);
		} catch (IllegalArgumentException iae) {
			illegalArgException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on setAmount() method");
				e.printStackTrace();
		}
		
		try{assertTrue(illegalArgException);
		} catch(AssertionError ae) {
			System.out.println(b + ".setAmount() does not throw "
					+ "IllegalArgumentException correctly");
			fail();
		}
		
		boolean constructorError = false;
		
		try{@SuppressWarnings("unused")
		PowerUp d = new RedBison(-1);
		} catch (IllegalArgumentException iae) {
			constructorError = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on constructor");
				e.printStackTrace();
		}
		
		try{assertTrue(constructorError);
		} catch(AssertionError ae) {
			System.out.println(b + " constructor does not throw "
					+ "an IllegalArgumentException for negative amounts");
			fail();
		}
		
	}
	
	@Test
	public void TShirtTest() {
		Clothing a = new TShirt(10);
		Class b = TShirt.class;
		
		try {assertEquals(a.getAmount(), 10);
		} catch (AssertionError ae) {
			System.out.println(b + ".getAmmount() does not "
					+ "return expected value");
			System.out.println("Expected: 10");
			System.out.println("Actual: " + a.getAmount());
			fail();
		}
		try {assertEquals(a.getPoundsPerItem(), 1);
		} catch (AssertionError ae) {
			System.out.println(b + ".getPoundsPerItem() does not "
					+ "return expected value");
			System.out.println("Expected: 1");
			System.out.println("Actual: " + a.getPoundsPerItem());
			fail();
		}
		
		try {assertEquals(a.getPricePerItem(), 20);
		} catch (AssertionError ae) {
			System.out.println(b + ".getPricePerItem() does not "
					+ "return expected value");
			System.out.println("Expected: 20");
			System.out.println("Actual: " + a.getPricePerItem());
			fail();
		}
		
		try {assertEquals(a.getName(), "t-shirt");
		} catch (AssertionError ae) {
			System.out.println(b + ".getName() does not "
					+ "return expected value");
			System.out.println("Expected: t-shirt");
			System.out.println("Actual: " + a.getName());
			fail();
		}
		
		try {assertEquals(a.getTotalWeight(), 10);	
		} catch (AssertionError ae) {
			System.out.println(b + ".getTotalWeight() does not "
					+ "return expected value");
			System.out.println("Expected: 10");
			System.out.println("Actual: " + a.getTotalWeight());
			fail();
		}
		
		try {assertEquals(a.getWarmth(), Clothing.Warmth.LIGHT);
		} catch (AssertionError ae) {
			System.out.println(b + ".getWarth() does not "
					+ "return expected value");
			System.out.println("Expected: LIGHT");
			System.out.println("Actual: " + a.getWarmth());
			fail();
		}
		
		Clothing c = new TShirt(1);
		
		c.setAmount(0);
		try {assertEquals(c.getAmount(), 0);
		} catch (AssertionError ae) {
			System.out.println(b + ".setAmmount() does not "
					+ "change amount correctly");
			System.out.println("Expected: 0");
			System.out.println("Actual: " + c.getAmount());
			fail();
		}
		
		boolean illegalArgException = false;
		
		try {c.setAmount(-1);
		} catch (IllegalArgumentException iae) {
			illegalArgException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on setAmount() method");
				e.printStackTrace();
		}
		
		try{assertTrue(illegalArgException);
		} catch(AssertionError ae) {
			System.out.println(b + ".setAmount() does not throw "
					+ "IllegalArgumentException correctly");
			fail();
		}
		
		boolean constructorError = false;
		
		try{@SuppressWarnings("unused")
		Clothing d = new TShirt(-1);
		} catch (IllegalArgumentException iae) {
			constructorError = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on constructor");
				e.printStackTrace();
		}
		
		try{assertTrue(constructorError);
		} catch(AssertionError ae) {
			System.out.println(b + " constructor does not throw "
					+ "an IllegalArgumentException for negative amounts");
			fail();
		}
	
	}	
	
	@Test
	public void ButtonUpTest() {
		Clothing a = new ButtonUp(10);
		Class b = ButtonUp.class;
		
		try {assertEquals(a.getAmount(), 10);
		} catch (AssertionError ae) {
			System.out.println(b + ".getAmmount() does not "
					+ "return expected value");
			System.out.println("Expected: 10");
			System.out.println("Actual: " + a.getAmount());
			fail();
		}
		try {assertEquals(a.getPoundsPerItem(), 5);
		} catch (AssertionError ae) {
			System.out.println(b + ".getPoundsPerItem() does not "
					+ "return expected value");
			System.out.println("Expected: 5");
			System.out.println("Actual: " + a.getPoundsPerItem());
			fail();
		}
		
		try {assertEquals(a.getPricePerItem(), 50);
		} catch (AssertionError ae) {
			System.out.println(b + ".getPricePerItem() does not "
					+ "return expected value");
			System.out.println("Expected: 50");
			System.out.println("Actual: " + a.getPricePerItem());
			fail();
		}
		
		try {assertEquals(a.getName(), "button-up");
		} catch (AssertionError ae) {
			System.out.println(b + ".getName() does not "
					+ "return expected value");
			System.out.println("Expected: button-up");
			System.out.println("Actual: " + a.getName());
			fail();
		}
		
		try {assertEquals(a.getTotalWeight(), 50);	
		} catch (AssertionError ae) {
			System.out.println(b + ".getTotalWeight() does not "
					+ "return expected value");
			System.out.println("Expected: 50");
			System.out.println("Actual: " + a.getTotalWeight());
			fail();
		}
		
		try {assertEquals(a.getWarmth(), Clothing.Warmth.MEDIUM);
		} catch (AssertionError ae) {
			System.out.println(b + ".getWarth() does not "
					+ "return expected value");
			System.out.println("Expected: MEDIUM");
			System.out.println("Actual: " + a.getWarmth());
			fail();
		}
		
		Clothing c = new ButtonUp(1);
		
		c.setAmount(0);
		try {assertEquals(c.getAmount(), 0);
		} catch (AssertionError ae) {
			System.out.println(b + ".setAmmount() does not "
					+ "change amount correctly");
			System.out.println("Expected: 0");
			System.out.println("Actual: " + c.getAmount());
			fail();
		}
		
		boolean illegalArgException = false;
		
		try {c.setAmount(-1);
		} catch (IllegalArgumentException iae) {
			illegalArgException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on setAmount() method");
				e.printStackTrace();
		}
		
		try{assertTrue(illegalArgException);
		} catch(AssertionError ae) {
			System.out.println(b + ".setAmount() does not throw "
					+ "IllegalArgumentException correctly");
			fail();
		}
		
		boolean constructorError = false;
		
		try{@SuppressWarnings("unused")
		Clothing d = new ButtonUp(-1);
		} catch (IllegalArgumentException iae) {
			constructorError = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on constructor");
				e.printStackTrace();
		}
		
		try{assertTrue(constructorError);
		} catch(AssertionError ae) {
			System.out.println(b + " constructor does not throw "
					+ "an IllegalArgumentException for negative amounts");
			fail();
		}
	
	}	
	
	@Test
	public void FleeceTest() {
		Clothing a = new Fleece(10);
		Class b = Fleece.class;
		
		try {assertEquals(a.getAmount(), 10);
		} catch (AssertionError ae) {
			System.out.println(b + ".getAmmount() does not "
					+ "return expected value");
			System.out.println("Expected: 10");
			System.out.println("Actual: " + a.getAmount());
			fail();
		}
		try {assertEquals(a.getPoundsPerItem(), 10);
		} catch (AssertionError ae) {
			System.out.println(b + ".getPoundsPerItem() does not "
					+ "return expected value");
			System.out.println("Expected: 10");
			System.out.println("Actual: " + a.getPoundsPerItem());
			fail();
		}
		
		try {assertEquals(a.getPricePerItem(), 100);
		} catch (AssertionError ae) {
			System.out.println(b + ".getPricePerItem() does not "
					+ "return expected value");
			System.out.println("Expected: 100");
			System.out.println("Actual: " + a.getPricePerItem());
			fail();
		}
		
		try {assertEquals(a.getName(), "fleece");
		} catch (AssertionError ae) {
			System.out.println(b + ".getName() does not "
					+ "return expected value");
			System.out.println("Expected: fleece");
			System.out.println("Actual: " + a.getName());
			fail();
		}
		
		try {assertEquals(a.getTotalWeight(), 100);	
		} catch (AssertionError ae) {
			System.out.println(b + ".getTotalWeight() does not "
					+ "return expected value");
			System.out.println("Expected: 100");
			System.out.println("Actual: " + a.getTotalWeight());
			fail();
		}
		
		try {assertEquals(a.getWarmth(), Clothing.Warmth.WARM);
		} catch (AssertionError ae) {
			System.out.println(b + ".getWarth() does not "
					+ "return expected value");
			System.out.println("Expected: WARM");
			System.out.println("Actual: " + a.getWarmth());
			fail();
		}
		
		Clothing c = new Fleece(1);
		
		c.setAmount(0);
		try {assertEquals(c.getAmount(), 0);
		} catch (AssertionError ae) {
			System.out.println(b + ".setAmmount() does not "
					+ "change amount correctly");
			System.out.println("Expected: 0");
			System.out.println("Actual: " + c.getAmount());
			fail();
		}
		
		boolean illegalArgException = false;
		
		try {c.setAmount(-1);
		} catch (IllegalArgumentException iae) {
			illegalArgException = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on setAmount() method");
				e.printStackTrace();
		}
		
		try{assertTrue(illegalArgException);
		} catch(AssertionError ae) {
			System.out.println(b + ".setAmount() does not throw "
					+ "IllegalArgumentException correctly");
			fail();
		}
		
		boolean constructorError = false;
		
		try{@SuppressWarnings("unused")
		Clothing d = new Fleece(-1);
		} catch (IllegalArgumentException iae) {
			constructorError = true;
		} catch (Exception e) {System.out.println(b + ": Caught "
				+ "unexpected exception on constructor");
				e.printStackTrace();
		}
		
		try{assertTrue(constructorError);
		} catch(AssertionError ae) {
			System.out.println(b + " constructor does not throw "
					+ "an IllegalArgumentException for negative amounts");
			fail();
		}
	
	}
	
	@Test
	public void InheritanceTest() {
		try{assertTrue(Supplies.class.isAssignableFrom(Food.class));}
		catch(AssertionError ae) {
			System.out.println("Food interface does not extend Supplies interface");
			fail();
		}
		
		try{assertTrue(Food.class.isAssignableFrom(PowerUp.class));}
		catch(AssertionError ae) {
			System.out.println("PowerUp interface does not extend Food interface");
			fail();
		}
		
		try{assertTrue(Supplies.class.isAssignableFrom(Food.class));}
		catch(AssertionError ae) {
			System.out.println("Food interface does not extend Supplies interface");
			fail();
		}
		
		try{assertTrue(Supplies.class.isAssignableFrom(SuppliesImpl.class));}
		catch(AssertionError ae) {
			System.out.println("SuppliesImpl does not implement Supplies interface");
			fail();
		}
		
		try{assertTrue(FoodImpl.class.getSuperclass().equals(SuppliesImpl.class));}
		catch(AssertionError ae) {
			System.out.println("FoodImpl does not extend SuppliesImpl");
			fail();
		}
		
		try{assertTrue(Food.class.isAssignableFrom(FoodImpl.class));}
		catch(AssertionError ae) {
			System.out.println("FoodImpl does not implement Food interface");
			fail();
		}
		
		try{assertTrue(ClothingImpl.class.getSuperclass().equals(SuppliesImpl.class));}
		catch(AssertionError ae) {
			System.out.println("ClothingImpl does not extend SuppliesImpl");
			fail();
		}
		
		try{assertTrue(Clothing.class.isAssignableFrom(ClothingImpl.class));}
		catch(AssertionError ae) {
			System.out.println("ClothingImpl does not implement Clothing interface");
			fail();
		}
		
		try{assertTrue(PowerUpImpl.class.getSuperclass().equals(FoodImpl.class));}
		catch(AssertionError ae) {
			System.out.println("PowerUpImpl does not extend FoodImpl");
			fail();
		}
		
		try{assertTrue(PowerUp.class.isAssignableFrom(PowerUpImpl.class));}
		catch(AssertionError ae) {
			System.out.println("PowerUpImpl does not implement PowerUp interface");
			fail();
		}
		
		try{assertTrue(BisonJerky.class.getSuperclass().equals(FoodImpl.class));}
		catch(AssertionError ae) {
			System.out.println("BisonJerky does not extend FoodImpl");
			fail();
		}
		
		try{assertTrue(Burrito.class.getSuperclass().equals(FoodImpl.class));}
		catch(AssertionError ae) {
			System.out.println("Burrito does not extend FoodImpl");
			fail();		
		}
		
		try{assertTrue(Ramen.class.getSuperclass().equals(FoodImpl.class));}
		catch(AssertionError ae) {
			System.out.println("Ramen does not extend FoodImpl");
			fail();
		}
		
		try{assertTrue(Sushi.class.getSuperclass().equals(FoodImpl.class));}
		catch(AssertionError ae) {
			System.out.println("Sushi does not extend FoodImpl");
			fail();
		}
		
		try{assertTrue(Coffee.class.getSuperclass().equals(PowerUpImpl.class));}
		catch(AssertionError ae) {
			System.out.println("Coffee does not extend PowerUpImpl");
			fail();
		}
		
		try{assertTrue(RedBison.class.getSuperclass().equals(PowerUpImpl.class));}
		catch(AssertionError ae) {
			System.out.println("RedBison does not extend PowerUpImpl");
			fail();
		}
		
		try{assertTrue(ButtonUp.class.getSuperclass().equals(ClothingImpl.class));}
		catch(AssertionError ae) {
			System.out.println("ButtonUp does not extend ClothingImpl");
			fail();
		}
		
		try{assertTrue(Fleece.class.getSuperclass().equals(ClothingImpl.class));}
		catch(AssertionError ae) {
			System.out.println("Fleece does not extend ClothingImpl");
			fail();
		}
		
		try{assertTrue(TShirt.class.getSuperclass().equals(ClothingImpl.class));}
		catch(AssertionError ae) {
			System.out.println("TShirt does not extend ClothingImpl");
			fail();		
		}
		
		try{assertTrue(Person.class.isAssignableFrom(PersonImpl.class));}
		catch(AssertionError ae) {
			System.out.println("PersonImpl does not implement Person interface");
			fail();
		}
		
		try{assertTrue(Hacker.class.getSuperclass().equals(PersonImpl.class));}
		catch(AssertionError ae) {
			System.out.println("Hacker does not extend PersonImpl");
			fail();
		}
		
		try{assertTrue(Brogrammer.class.getSuperclass().equals(PersonImpl.class));}
		catch(AssertionError ae) {
			System.out.println("Brogrammer does not extend PersonImpl");
			fail();
		}
		
		try{assertTrue(Student.class.getSuperclass().equals(PersonImpl.class));}
		catch(AssertionError ae) {
			System.out.println("Student does not extend PersonImpl");
			fail();
		}	
	} 
}
