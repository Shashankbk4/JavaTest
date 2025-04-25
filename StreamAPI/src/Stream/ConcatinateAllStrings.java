package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatinateAllStrings {

	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("virat","rahul","jadeja","bumrah");
		
		String res=words.stream().collect(Collectors.joining());
		System.out.println(res);
	}
}
