package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class UpperCase {

	public static void main(String[] args) {
	        
	        List<String> words = Arrays.asList("virat", "rahul", "jaiswal", "gill");

	        List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
	                                 
	          System.out.println(upperCaseWords);
	    }
	}


