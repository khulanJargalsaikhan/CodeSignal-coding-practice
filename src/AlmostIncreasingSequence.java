
public class AlmostIncreasingSequence {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {1, 2, 3, 4, 3, 6}));   //true
		System.out.println(solution(new int[] {1, 2, 1, 2}));   //false

		System.out.println(solution(new int[] {10, 1, 2, 3, 4, 5}));   //true
	}


	/*
	 * Given a sequence of integers as an array, determine whether it is possible to obtain a strictly 
	 * increasing sequence by removing no more than one element from the array.
	 */
	static boolean solution(int[] sequence) {

		int count = 0;
		for (int i = 0; i < sequence.length - 1; i++) {
			if (sequence[i] - sequence[i+1] >= 0) {
				count += 1;
				if (i > 0 && i <= sequence.length - 2 && sequence[i] - sequence[i+2] >= 0 && sequence[i-1] - sequence[i+1] >= 0) {
					return false;
				}
			}
		}
		return count <= 1;
	}

}
