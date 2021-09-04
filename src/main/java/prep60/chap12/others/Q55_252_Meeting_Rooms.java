package prep60.chap12.others;

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
		for (int i = 0; i < intervals.length; i++) {
			for (int j = i + 1; j < intervals.length; j++) {
				if (overlap(intervals[i], intervals[j])) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean overlap(int[] i1, int[] i2) {
		return (i1[0] >= i2[0] && i1[0] < i2[1]) || (i2[0] >= i1[0] && i2[0] < i1[1]);
	}

}
