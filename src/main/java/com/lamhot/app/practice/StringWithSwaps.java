package com.lamhot.app.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class StringWithSwaps {

	public static void main(String args[]) {
		StringWithSwaps ob = new StringWithSwaps();
	

		String s = "dcab";
		List<List<Integer>> pairs = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2));
		System.out.println(ob.smallestStringWithSwaps(s, pairs));
		// Input: s = "dcab", pairs = [[0,3],[1,2],[0,2]]
		// Output: "abcd"
		pairs = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2), Arrays.asList(0, 2));
		System.out.println(ob.smallestStringWithSwaps(s, pairs));

	}

	public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
		
		HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
        int n = s.length();

        for(int i = 0; i < pairs.size(); i ++){
            int u = pairs.get(i).get(0);
            int v = pairs.get(i).get(1);
            if(!graph.containsKey(u)) graph.put(u, null);
            if(!graph.containsKey(v)) graph.put(v, null);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        char[] ans = new char[n];
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++){
            if(visited[i]) continue;
            visited[i] = true;
            List<Integer> components = new ArrayList<>();
            List<Character> chars = new ArrayList<>();
            dfs(graph, s, visited, components, chars, i);
            Collections.sort(components);
            Collections.sort(chars);
            for(int j = 0; j < components.size(); j++){
                ans[components.get(j)] = chars.get(j);
            }
        }
        return String.valueOf(ans);
	}
	
	private void dfs(HashMap<Integer, ArrayList<Integer>> graph, String s, boolean[] visited , List<Integer> components, List<Character> chars, int curr){
        visited[curr] = true;
        components.add(curr);
        chars.add(s.charAt(curr));
        if(!graph.containsKey(curr)) return;
        for(Integer k:  graph.get(curr)){
            if(visited[k]) continue;
            dfs(graph, s, visited, components, chars, k);
        }
    }
}