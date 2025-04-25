package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxLength {

	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("virat","rahul","gill","jadeja");
		
        int maxLength = words.stream().mapToInt(String::length).max().orElse(0);

    List<String> longestWords = words.stream().filter(word -> word.length() == maxLength)
                            .collect(Collectors.toList());
    
    System.out.println(longestWords);
	}
}
