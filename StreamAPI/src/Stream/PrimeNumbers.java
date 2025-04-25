package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> primeNumbers=num.stream().filter(n -> n>1 && IntStream.range(2, n-1).noneMatch(i -> n%i==0) ).collect(Collectors.toList());
		  
		System.out.println(primeNumbers);
		
				
				
		
	}
}
