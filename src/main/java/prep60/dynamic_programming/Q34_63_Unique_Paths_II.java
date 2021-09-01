package prep60.dynamic_programming;

public class Q34_63_Unique_Paths_II {
	/*
	 * 63. Unique Paths II
	 * 
	 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

		The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
		
		Now consider if some obstacles are added to the grids. How many unique paths would there be?
		
		An obstacle and empty space is marked as 1 and 0 respectively in the grid.
		
		Note: m and n will be at most 100.
		Example 1:
		
		Input:
		[
		  [0,0,0],
		  [0,1,0],
		  [0,0,0]
		]
		Output: 2
		Explanation:
		There is one obstacle in the middle of the 3x3 grid above.
		There are two ways to reach the bottom-right corner:
		1. Right -> Right -> Down -> Down
		2. Down -> Down -> Right -> Right

	 */
	
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
	    int C = obstacleGrid[0].length;
	    int[] dp = new int[C];
	    dp[0] = 1;
	    for (int[] row : obstacleGrid) {
	      for (int col = 0; col < C; col++) {
	        if (row[col] == 1) {
	          dp[col] = 0;
	        } else if (col >= 1) { 
	          dp[col] += dp[col - 1];
	        }
	      }
	    }
	    return dp[C - 1];
	  }

}
