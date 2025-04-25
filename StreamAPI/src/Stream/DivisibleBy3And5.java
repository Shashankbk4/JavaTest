package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibleBy3And5 {

	public static void main(String[] args) {
		 
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9,15,30,60);
		
		List<Integer> divisible=num.stream().filter(n -> n%3 == 0 && n%5 ==0 ).collect(Collectors.toList());
		
		System.out.println(divisible);
       
	}
}
