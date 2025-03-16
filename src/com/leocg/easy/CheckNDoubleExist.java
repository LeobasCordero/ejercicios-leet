package com.leocg.easy;

/**
 * Given an array arr of integers, check if there exist two indices i and j such that :
 *
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 *
 *
 * Example 1:
 *
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
 * Example 2:
 *
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: There is no i and j that satisfy the conditions.
 *
 *
 * Constraints:
 *
 * 2 <= arr.length <= 500
 * -103 <= arr[i] <= 103
 */

public class CheckNDoubleExist {

    public boolean checkIfExist(int[] arr) {
        if(arr.length < 2){
            return false;
        }
        boolean response = false;

        for(int i=0; i < arr.length; i++){
            int iVal = arr[i];
            int jValDouble = iVal * 2;
            int jValHalf = iVal / 2;
            boolean checkHalf = iVal % 2 == 0;
            for(int j=i+1; j < arr.length; j++){
                if(arr[j] == jValDouble || (checkHalf && arr[j] == jValHalf)){
                    response = true;
                    break;
                }
            }
            if(response){
                break;
            }
        }


        return response;
    }

    /*
    public boolean checkIfExist(int[] arr) {
        if (arr == null || arr.length < 2) {
            return false;
        }

        Set<Integer> seen = new HashSet<>();

        for (int iVal : arr) {
            if (seen.contains(iVal * 2) || (iVal % 2 == 0 && seen.contains(iVal / 2))) {
                return true;
            }
            seen.add(iVal);
        }

        return false;
    }

     */
}
