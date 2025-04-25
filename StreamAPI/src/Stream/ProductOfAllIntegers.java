package Stream;

import java.util.Arrays;
import java.util.List;

public class ProductOfAllIntegers {

	public static void main(String[] args) {
		
		List<Integer> num=Arrays.asList(1,2,3,4,5);
		
     int [] number= {1};
		
	num.stream().forEach(n -> number[0]=number[0] * n);
	
	System.out.println(number[0]);
	
	}
}
