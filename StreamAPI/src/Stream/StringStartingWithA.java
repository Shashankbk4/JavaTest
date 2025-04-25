package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStartingWithA {

	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("virat","jadeja","bumrah","rahul","chahal","abhishek sharma");
	
     List<String> startWithA=words.stream().filter(n -> n.startsWith("a")).collect(Collectors.toList());
	
		System.out.println(startWithA);
	}
}
