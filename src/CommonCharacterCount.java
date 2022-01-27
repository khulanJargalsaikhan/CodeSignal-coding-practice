
public class CommonCharacterCount {

	public static void main(String[] args) {
		System.out.println(solution2("aabcc", "adcaa"));
		System.out.println(solution2("zzzz", "zzzzzzzzzzzz"));

	}

/*
 * Given two strings, find the number of common characters between them.

Example
For s1 = "aabcc" and s2 = "adcaa", the output should be
solution(s1, s2) = 3.
 */
	
	//my solution using 2 loops 
	static int solution(String s1, String s2) {

		int count = 0;

		StringBuilder sb1 = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder(s2);
		
		for (int i=0; i<sb1.length(); i++) {
			for (int j=0; j<sb2.length(); j++) {
				if (sb1.charAt(i) == sb2.charAt(j)) {
					count++;
					sb2.deleteCharAt(j);
					break;
				}
			}
		}
		
		return count;
	}
	
	//better solution using 1 loop
	static int solution2(String s1, String s2) {
	    int count = 0;
	    for(int i = 0; i < s1.length(); i++){
	        if(s2.contains(String.valueOf(s1.charAt(i)))){
	            count++;
	            s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
	        }
	    }
	    return count;
	}

}
