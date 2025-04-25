package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLengthGreaterThan5 {

	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("virat","jadeja","bumrah","rahul","chahal");
		
 List<Integer> lenth=words.stream().map(String::length).collect(Collectors.toList());
	
       System.out.println("length of each string "+lenth);
      
       System.out.println("length greater than 5");
       
       words.stream().filter(n -> n.length()>5).forEach(n -> System.out.println(n));
	}
}
