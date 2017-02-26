import static org.junit.Assert.*;

import org.junit.Test;

public class INtroToTestes {

	@Test
	public void test() {
		assertEquals(7,add(4,3));
		assertEquals(25,squareNum(5));
		assertEquals("Hi Bob!", giveGreeting("Bob"));
		assertEquals("Hi Bob!!!", giveLoudGreeting("Bob"));
		assertTrue(isWeekend("Saturday"));
		assertFalse(isWeekend("Tuesday"));
		assertEquals("A", isGrade(97));
		assertEquals("D", isGrade(65));
		assertEquals("F", isGrade(42));
		assertEquals("C", isGrade(76));
		assertEquals("B", isGrade(81));
		assertEquals("StuffStuffStuff", repeatString(3,"Stuff"));
	}

	private String repeatString(int i, String string) {
		String repeated = "";
		for (int j = 0; j < i; j++) {
			repeated = repeated + string;
		} 
				
		return repeated;
	}

	private String isGrade(int i) {
		if(i > 89){
			return "A";
		} else if(i > 79 ){
			return "B";
			
		} else if(i > 69 ){
			return "C";
			
		} else if(i > 59 ){
			return "D";
			
		} else if(i > 39 ){
			return "F";
			
		}
		return null;
	}

	private boolean isWeekend(String string) {
		if(string.equals("Saturday")){
		return true;
		} else {
		return false;	
		}
	}

	private String giveLoudGreeting(String string) {
	
		return "Hi " + string + "!!!";
	}

	private String giveGreeting(String string) {
		
		return "Hi " + string + "!";
	}

	private int squareNum(int i) {
		
		return i * i;
	}

	private int add(int i, int j) {
		
		return i + j;
	}

}
