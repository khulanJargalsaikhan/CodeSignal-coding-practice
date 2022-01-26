
public class MatrixElementsSum {

	public static void main(String[] args) {
		int[][] matrix = { 	{1, 1, 1, 0}, 
		          			{0, 5, 0, 1}, 
		          			{2, 1, 3, 10} };    // solution(matrix) = 9.

		System.out.println(solution(matrix));
	}
	/*
	 * Given matrix, a rectangular matrix of integers, where each value represents the cost of the room, 
	 * your task is to return the total sum of all rooms that are suitable for the CodeBots 
	 * (ie: add up all the values that don't appear below a 0).
	 */
	static int solution(int[][] matrix) {
		
		int sum = 0;
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				if (matrix[i][j] == 0 && i<matrix.length-1) {
					matrix[i+1][j] = 0;
				}
				else {
					sum = sum + matrix[i][j];
				}		
			}
		}
		return sum;
	}

}
