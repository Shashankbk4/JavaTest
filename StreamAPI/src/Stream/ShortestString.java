package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ShortestString {

	public static void main(String[] args) {
		
	List<String> words=Arrays.asList("virat","jadeja","bumrah","chahal","abhisheksharma");
	

    Optional<String> shortest = words.stream()
                                     .min((s1, s2) -> Integer.compare(s1.length(), s2.length()));

    
      if(shortest.isPresent()) {
    	  System.out.println(shortest.get());
      }
	}
}
