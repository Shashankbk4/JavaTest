package Stream;

import java.util.Arrays;
import java.util.List;

public class SortingStrings {

	 public static void main(String[] args) {
		
		 List<String> words=Arrays.asList("virat","rahul","jadeja","bumrah");
		 
		 words.stream().sorted().forEach(name -> System.out.print(name+ " "));
	}
}
