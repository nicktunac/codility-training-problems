package com.kodigo.codility.lesson_2_arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
A non-empty zero-indexed array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

        For example, in array A such that:

        A[0] = 9  A[1] = 3  A[2] = 9
        A[3] = 3  A[4] = 9  A[5] = 7
        A[6] = 9
        the elements at indexes 0 and 2 have value 9,
        the elements at indexes 1 and 3 have value 3,
        the elements at indexes 4 and 6 have value 9,
        the element at index 5 has value 7 and is unpaired.
        Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

        For example, given array A such that:

        A[0] = 9  A[1] = 3  A[2] = 9
        A[3] = 3  A[4] = 9  A[5] = 7
        A[6] = 9
        the function should return 7, as explained in the example above.

        Assume that:

        N is an odd integer within the range [1..1,000,000];
        each element of array A is an integer within the range [1..1,000,000,000];
        all but one of the values in A occur an even number of times.
        Complexity:

        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
*/


public class OddOccurrencesInArray {


    public static void main(String[] args) {


        System.out.println(solution(new int[]{9, 3, 9, 3, 9, 7, 9}));

    }


    public static int solution(int[] A) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : A) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                map.put(num, ++count);
            } else {
                map.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) return entry.getKey();
        }

        return 0;
    }

    public static int solution2(int[] A) {
        if(A.length == 1) return A[0];

        Arrays.sort(A);

        int counter = 1;
        int curretNum = A[0];

        for(int i = 1; i<A.length - 1; i++){

            if(curretNum == A[i]) {
                counter++;
            } else {
                if(counter % 2 == 1) return curretNum;
                curretNum = A[i];
                counter = 1;
            }
        }
        return A[A.length - 1];
    }
}
