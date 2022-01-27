
public class IsLucky {

	public static void main(String[] args) {
		System.out.println(solution2(1230));   //true
		System.out.println(solution2(239017));   //false

	}
	/*
	 * Ticket numbers usually consist of an even number of digits. A ticket number is considered 
	 * lucky if the sum of the first half of the digits is equal to the sum of the second half.
	 */
	
	// O(n^2)
	static boolean solution(int n) {
		
		String sNum = n + "";
		int sum = 0;
		int sum2 = 0;
		
		int len = sNum.length();
	    
		for (int i=0; i<len/2; i++) {
			sum += n % 10;
			n = n / 10;
		}
		
		for (int i=0; i<len/2; i++) {
			sum2 += n % 10;
			n = n / 10;
		}
		
		return sum == sum2;
	    
	}
	
	// O(n)
	static boolean solution2(int n) {

		//converting int to String
	    String s = n+"";
	    
	    int sum = 0;
	    
	    for(int i=0; i<s.length()/2; i++) {
	        sum += (s.charAt(i) - s.charAt(s.length()-1-i));
	    }
	    return sum==0;
	}

}
