/*
Given an array of meeting time intervals where intervals[i] = [starti, endi],
determine if a person could attend all meetings.


Example 1:

Input: intervals = [[0,30],[5,10],[15,20]]
Output: false
Example 2:

Input: intervals = [[7,10],[2,4]]
Output: true

Approach 1:-
  0  1   0 1     2
[[0,30],[5,10],[15,20]]
    0      1      2
Arrays.sort(start_time)
0 - n - 1

endtime[i] > starttime[i+1]
     return false

return true

 */


package solutions;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MeetingRooms {


    class Sorting implements Comparator<int[]> {

        @Override
        public int compare(int[] o1, int[] o2) {

            System.out.println("o1" + o1[0]);
            System.out.println("o2" + o2[0]);
            return o1[0] - o2[0];
        }
    }


    public boolean meetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length <= 1)
            return true;

        Arrays.sort(intervals, new Sorting());

        System.out.println(Arrays.deepToString(intervals));

        for(int i = 0; i < intervals.length - 1; i++ ){
            if(intervals[i][1] > intervals[i+1][0])
                return false;
        }

        return true;

    }


}



