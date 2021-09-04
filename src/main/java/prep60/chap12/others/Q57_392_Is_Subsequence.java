package prep60.chap12.others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q57_392_Is_Subsequence {
	
	public boolean isSubsequence(String s, String t) {
        List<Integer>[] bucket = new List[256];
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (bucket[c] == null) bucket[c] = new ArrayList<>();
            bucket[c].add(i);
        }
        int prev = 0;
        for (char c : s.toCharArray()) {
            if (bucket[c] == null) return false;
            int j = Collections.binarySearch(bucket[c], prev);
            j = j < 0 ? -(j + 1) : j;
            if (j == bucket[c].size()) return false;
            prev = bucket[c].get(j) + 1;
        }
        return true;
    }

}
