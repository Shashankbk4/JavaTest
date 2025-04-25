package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Squares {

	public static void main(String[] args) {
		
		List<Integer> num=Arrays.asList(1,2,3,4,5);
		
		List<Integer> square=num.stream().map(n -> n*n).collect(Collectors.toList());
		
		System.out.println(square);
		
		// without using map
		num.stream().forEach(n -> System.out.print( n*n+" "));
	}
}
