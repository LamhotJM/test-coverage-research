package prep60.chap12.others;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

import com.lamhot.app.common.Interval;

public class Q56_253_MeetingRooms_II {
	
	class IntervalComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval i1, Interval i2) {
            return i1.start - i2.start;
        }
    }
    public int minMeetingRooms(Interval[] intervals) {
        PriorityQueue<Integer> end = new PriorityQueue<Integer>();
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, new IntervalComparator());
        end.add(intervals[0].end);
        for (int i = 1; i < intervals.length; i ++) {
            if (intervals[i].start >= end.peek()) {
                end.poll();
            }
            end.add(intervals[i].end);
        }
        return end.size();
    }

}
