

public class Test {

	public static void main(String[] args) {
		System.out.println(solution("010", "amazingamazing"));  //4
		System.out.println(solution("11", "bbbbbbbb"));			//7

	}

	static int solution(String pattern, String s) {

		
		int finalCount = 0;
		int index = 0;

		for (int i=0; i<s.length()-pattern.length()+1; i++,index++){
			int count = 0;
			
			for (int j=0; j<pattern.length(); j++){

				if (pattern.charAt(j)=='0' && (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='y'))
					count++;
				else if (pattern.charAt(j)=='1' && (s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u' && s.charAt(i)!='y'))
					count++;
				i++;
			}
			
			if (count == pattern.length()){
				finalCount++;
			} 
			i=index;
		}
		return finalCount;
	}
}
