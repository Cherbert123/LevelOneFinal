import static org.junit.Assert.*;

import org.junit.Test;

public class TestingStuff {
int largerlength = 0;
	@Test
	public void test1() {
		assertEquals("wpaafnfclaekses", weaveStrings("waffles","pancakes"));
		assertEquals("mntvrst",removeVowels("mounteverest"));
		assertEquals("tobortobor", reverseRepeat("robot"));
	}

	
	
	
	
	private String reverseRepeat(String string) {
		String toreturn = "";
		for (int i = string.length() - 1 ; i >= 0; i--) {
			 toreturn = toreturn + string.charAt(i);
				
			}
		return toreturn + toreturn;
	}





	private String removeVowels(String string) {
		int s1l = string.length();
		String toreturn = "";
		for (int i = 0; i < s1l; i++) {
			if (string.charAt(i) == 'i'){
				
			} else if (string.charAt(i) == 'a'){
				
			} else if (string.charAt(i) == 'e'){
				
			} else if (string.charAt(i) == 'o'){
				
			} else if (string.charAt(i) == 'u'){
				
			} else{
				
			toreturn = toreturn	+ string.charAt(i);
			}
		}
		return toreturn;
	}
	public String weaveStrings(String string, String string2) {
		int s1l = string.length();
		int s2l = string2.length();
		String toreturn = "";
		
		for (int i = 0; i < string.length(); i++) {
			
		toreturn = toreturn + string.charAt(i);
		if(s2l > i){
			toreturn = toreturn + string2.charAt(i);
		}
		}
		if(s2l> s1l){
			
			toreturn = toreturn + string2.substring(toreturn.length() - s1l, s2l);
		}
		return toreturn;
		
	}

}
