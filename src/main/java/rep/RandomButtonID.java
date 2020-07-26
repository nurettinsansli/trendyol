package rep;

import java.util.Random;


public class RandomButtonID {
	public String rnd_generator() {
	
	    	Random rnd = new Random();
	    	int number = rnd.nextInt(25);
	    	String xpath0= "/html/body/div[3]/div/div/div/div[2]/div[2]/div/div[";
	    	String xpath1 = Integer.toString(number);
	    	String xpath2 = "]";
	    	
	    	String xpath = xpath0+xpath1+xpath2;
	    	return xpath;
	    	
	}
	
}

