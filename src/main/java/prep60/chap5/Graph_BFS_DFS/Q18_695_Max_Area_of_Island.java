package prep60.chap5.Graph_BFS_DFS;

public class Q18_695_Max_Area_of_Island {
	/*
	 * You are given an m x n binary matrix grid. An island is a group of 1's
	 * (representing land) connected 4-directionally (horizontal or vertical.) You
	 * may assume all four edges of the grid are surrounded by water.
	 * 
	 * The area of an island is the number of cells with a value 1 in the island.
	 * 
	 * Return the maximum area of an island in grid. If there is no island, return
	 * 0.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * 
	 * Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0], [0,0,0,0,0,0,0,1,1,1,0,0,0],
	 * [0,1,1,0,1,0,0,0,0,0,0,0,0], [0,1,0,0,1,1,0,0,1,0,1,0,0],
	 * [0,1,0,0,1,1,0,0,1,1,1,0,0], [0,0,0,0,0,0,0,0,0,0,1,0,0],
	 * [0,0,0,0,0,0,0,1,1,1,0,0,0], [0,0,0,0,0,0,0,1,1,0,0,0,0]]
	 * 
	 * Output: 6 Explanation: The answer is not 11, because the island must be
	 * connected 4-directionally. Example 2:
	 * 
	 * Input: grid = [[0,0,0,0,0,0,0,0]] Output: 0
	 * 
	 * 
	 * Constraints:
	 * 
	 * m == grid.length n == grid[i].length 1 <= m, n <= 50 grid[i][j] is either 0
	 * or 1.
	 * 
	 */

	public int maxAreaOfIsland(int[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}

		int m = grid.length, n = grid[0].length;
		int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
		int maxArea = 0, area = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					area = getIslandArea(i, j, grid, directions);
					maxArea = Math.max(maxArea, area);
				}
			}
		}
		return maxArea;
	}

	public int getIslandArea(int row, int col, int[][] grid, int[][] directions) {
		int area = 1;
		grid[row][col] = 0;

		for (int[] direction : directions) {
			int nextRow = row + direction[0];
			int nextCol = col + direction[1];

			if (isValid(nextRow, nextCol, grid, directions)) {
				area += getIslandArea(nextRow, nextCol, grid, directions);
			}
		}
		return area;
	}

	public boolean isValid(int row, int col, int[][] grid, int[][] directions) {
		return row >= 0 && row < grid.length && col >= 0 && col < grid[0].length && grid[row][col] == 1;
	}

}
