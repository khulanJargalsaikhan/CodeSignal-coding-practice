import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AllLongestStrings {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution2(new String[] {"aba", "aa", "ad", "vcd", "aba"})));
		System.out.println(Arrays.toString(solution2(new String[] {"abc", "eeee", "abcd", "dcd"})));


	}
	/*
	 * Given an array of strings, return another array containing all of its longest strings.

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
solution(inputArray) = ["aba", "vcd", "aba"].
	 */

	static String[] solution(String[] inputArray) {

		int maxLength = 0;

		for (int i=0; i<inputArray.length; i++){
			if (inputArray[i].length() >= maxLength) {
				maxLength = inputArray[i].length();
			}
		}

		List<String> list = new ArrayList<>();

		for (int i=0; i<inputArray.length; i++){
			if (inputArray[i].length() == maxLength){
				list.add(inputArray[i]);
			}
		}
		String[] array = list.toArray(new String[list.size()]);

		return array;

	}

	//solution 2 using lambda function
	static String[] solution2(String[] inputArray) {
		
		int longest = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i].length() > longest) {
				longest = inputArray[i].length();
			}
		}

		final int longestLength = longest;
		return Stream.of(inputArray).filter(s -> s.length() == longestLength).toArray(String[]::new);
	}

}
