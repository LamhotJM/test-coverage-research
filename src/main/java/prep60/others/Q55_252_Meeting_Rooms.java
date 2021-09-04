package prep60.others;

import java.util.Arrays;

public class Q55_252_Meeting_Rooms {
	/*
	 * Given an array of meeting time intervals consisting of start and end
	 * times[[s1,e1],[s2,e2],...](si< ei), determine if a person could attend all
	 * meetings.
	 * 
	 * Example 1:
	 * 
	 * Input: [[0,30],[5,10],[15,20]] Output: false Example 2:
	 * 
	 * Input:[[7,10],[2,4]]
	 * 
	 * Output:true
	 * 
	 */

	public class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

	public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0]) {
                return false;
            }
        }
        return true;
    }

}
