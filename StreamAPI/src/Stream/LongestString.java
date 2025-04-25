package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class LongestString {

	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("virat","jadeja","rahul","bumrah");

		   Optional<String> longest = words.stream()
                   .max((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		   if (longest.isPresent()) {
         System.out.println("Longest string: " + longest.get());
        
		   } 
	}
}
