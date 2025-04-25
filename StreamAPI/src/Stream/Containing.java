package Stream;


import java.util.Arrays;
import java.util.List;
  
  public class Containing {

	public static void main(String[] args) {
	        
	        List<String> words = Arrays.asList("virat", "rahul", "dhoni", "gill", "jadeja", "bhuvi");

	        // Count strings containing the character 'a'
	        long count = words.stream()
	                          .filter(word -> word.contains("a"))
	                          .count();

	  System.out.println("Number of strings containing a character: " + count);
	    }
	}


