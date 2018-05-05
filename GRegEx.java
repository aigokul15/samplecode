//$Id$

import java.util.regex.Pattern;

public class GRegEx {

	private String pattern;
	
	public boolean isMatched(String c ) throws Exception {

		return Pattern.matches(this.pattern, c);	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println ( Pattern.matches("vowels\\Svf\\d{1,2}_[0-9]a.wav", "vowels\\vf01_2a.wav") );
		
	}

}
