package Stream;

import java.util.Arrays;
import java.util.List;

public class CheckSpecificString {

	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("virat","rahul","jadeja","bumrah");
		
		String s1="virat";
		
		words.stream().filter(n -> n==s1).forEach(n -> System.out.println(n));
	}
}
