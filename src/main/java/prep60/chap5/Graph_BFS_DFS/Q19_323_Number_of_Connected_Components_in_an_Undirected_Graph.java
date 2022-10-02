package prep60.chap5.Graph_BFS_DFS;

public class Q19_323_Number_of_Connected_Components_in_an_Undirected_Graph {

	/*
	 * 
	 * LeetCode 323. Number of Connected Components in an Undirected Graph
	 * 
	 * Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each
	 * edge is a pair of nodes), write a function to find the number of connected
	 * components in an undirected graph.
	 * 
	 * Example 1: 0 3 | | 1 --- 2 4 Given n = 5 and edges = [[0, 1], [1, 2], [3,
	 * 4]], return 2.
	 * 
	 * Example 2: 0 4 | | 1 --- 2 --- 3 Given n = 5 and edges = [[0, 1], [1, 2], [2,
	 * 3], [3, 4]], return 1.
	 * 
	 * Note: You can assume that no duplicate edges will appear in edges. Since all
	 * edges are undirected, [0, 1] is the same as [1, 0] and thus will not appear
	 * together in edges.
	 */

	public int countComponents(int n, int[][] edges) {
		int[] root = new int[n];
		for (int i = 0; i < n; i++) {
			root[i] = i;
		}
		int count = n;
		for (int i = 0; i < edges.length; i++) {
			int r1 = getRoot(root, edges[i][0]);
			int r2 = getRoot(root, edges[i][1]);
			if (r1 != r2) {
				root[r1] = r2;
				count--;
			}
		}
		return count;
	}

	private int getRoot(int[] root, int i) {
		while (root[i] != i) {
			root[i] = root[root[i]];
			i = root[i];
		}
		return i;
	}

}
