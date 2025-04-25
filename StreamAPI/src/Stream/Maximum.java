package Stream;


import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

  public class Maximum {

   public static void main(String[] args) {
	       
	        List<Integer> numbers = Arrays.asList(15, 42, 7, 89, 34, 66);

	        OptionalInt max = numbers.stream().mapToInt(Integer::intValue).max();
                    
	         if (max.isPresent()) {
	            
	        	 System.out.println("Maximum element: " + max.getAsInt());
	        }
	    }
	}


