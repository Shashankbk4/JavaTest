package Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		List<Integer> num=Arrays.asList(10,20,30,10,50,20);
		
		Set<Integer> s1=new HashSet<>();
		
		List<Integer> duplicates=num.stream().filter(n ->s1.add(n)).collect(Collectors.toList());
	
		System.out.println(" removing the duplicate numbers ---> "+ duplicates);
	}
}
