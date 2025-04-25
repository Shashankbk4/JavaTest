package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecLargest {

	public static void main(String[] args) {
		
		List<Integer> num=Arrays.asList(10,20,30,40,50,60);
		
Optional<Integer> secondLargest = num.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
   
    System.out.println("second largest is "+ secondLargest.get());
		
	}
}
