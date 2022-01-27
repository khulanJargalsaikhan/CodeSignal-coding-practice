import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {

	public static void main(String[] args) {
		System.out.println(solution2(new int[] {2, 1, 3, 5, 3, 2}));

	}

	// solution O(n^2)
	static int solution(int[] a) {

		int minIndex = a.length;
		int index = 0;

		for (int i=0; i<a.length; i++){
			
			for (int j=i+1; j<a.length; j++){
				if (a[i] == a[j]) {
					index = j;
					if (index < minIndex)
						minIndex = index; 
				}
			} 
		}

		if (minIndex != a.length)
			return a[minIndex];
		else    
			return -1;    
	}
	
	//solution2 O(n)
	static int solution2(int[] a) {

		Set<Integer> seen = new HashSet<>();
		
		for (int i=0; i<a.length; i++) {
			if (seen.contains(a[i]))
				return a[i];
			else
				seen.add(a[i]);
		}
		return -1;
	}

}
