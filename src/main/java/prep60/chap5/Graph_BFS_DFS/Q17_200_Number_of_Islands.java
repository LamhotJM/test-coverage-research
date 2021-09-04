package prep60.chap5.Graph_BFS_DFS;

import java.util.Arrays;
import java.util.Scanner;

public class Q17_200_Number_of_Islands {
	/*
	 * 200. Number of Islands
	 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

	An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
	
	 
	
	Example 1:
	
	Input: grid = [
	  ["1","1","1","1","0"],
	  ["1","1","0","1","0"],
	  ["1","1","0","0","0"],
	  ["0","0","0","0","0"]
	]
	Output: 1
	Example 2:
	
	Input: grid = [
	  ["1","1","0","0","0"],
	  ["1","1","0","0","0"],
	  ["0","0","1","0","0"],
	  ["0","0","0","1","1"]
	]
	Output: 3
	 
	
	Constraints:
	
	m == grid.length
	n == grid[i].length
	1 <= m, n <= 300
	grid[i][j] is '0' or '1'.

	 * */
	

    /**
     * Visit the entire island.
     * Recursive call.
     * Execution O(n * m)
     */
    void visitIsland(char[][] grid, int r, int c) {

        // **** base condition ****
        if (grid[r][c] == '0' || grid[r][c] == 'x')
            return;

        // **** flag as visited ****
        grid[r][c] = 'x';

        // **** recurse right ****
        if (c < grid[r].length - 1)
            visitIsland(grid, r, c + 1);

        // **** recurse down ****
        if (r < grid.length - 1)
            visitIsland(grid, r + 1, c);

        // **** recurse left ****
        if (c > 0)
            visitIsland(grid, r, c - 1);

        // **** recurse up ****
        if (r > 0)
            visitIsland(grid, r - 1, c);
    }

   int numIslands(char[][] grid) {
        
        // **** sanity check(s) ****
        if ((grid == null) || (grid.length == 0))
            return 0;

        // **** initialize variable(s) ****
        int num = 0;
        // **** loop once per row ****
        for (int r = 0; r < grid.length; r++) {

            // **** loop through each column ****
            for (int c = 0; c < grid[r].length; c++) {

                // **** visit cell (if on land) ****
                if (grid[r][c] == '1') {

                    // **** visit adjacent cells ****
                    visitIsland(grid, r, c);

                    // **** count this island ****
                    num++;
                }
      
            }
        }

        return num;
    }


    /**
     * Test scaffolding
     */
    public static void main(String[] args) {
    	 char[][] mygrid = new char[][]{
             {'1','1','1','1','0'},
             {'1','1','0','1','0'},
             {'1','1','0','0','0'},
             {'0','0','1','1','0'}
     };
     
     Q17_200_Number_of_Islands ob = new Q17_200_Number_of_Islands();
     

     System.out.println(ob.numIslands(mygrid));
    }

}
