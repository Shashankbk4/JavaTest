package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Average {

public static void main(String[] args) {
	        
	        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

	    OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();
	                                  
            if (average.isPresent()) {
	            System.out.println("Average: " + average.getAsDouble()+" =====" +average);
	        }
	    }
	}


