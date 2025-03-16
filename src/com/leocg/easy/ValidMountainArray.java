package com.leocg.easy;


/**
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 *
 * Recall that arr is a mountain array if and only if:
 *
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [2,1]
 * Output: false
 * Example 2:
 *
 * Input: arr = [3,5,5]
 * Output: false
 * Example 3:
 *
 * Input: arr = [0,3,2,1]
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= arr.length <= 104
 * 0 <= arr[i] <= 104
 *
 */
public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {

        if(arr == null || arr.length < 3){
            return false;
        }

        int i = 0;
        while (i < arr.length - 1 && (arr[i] < arr[i + 1])) {
            i++;
        }

        if (i == 0 || i == arr.length - 1) {
            return false;
        }

        while (i < arr.length - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == arr.length-1;

    }
}

/*
        boolean isEven = arr.length % 2 == 0;
        int centerIndex = arr.length / 2;
        if(isEven)
            centerIndex = arr[arr.length/2] > arr[arr.length/2 -1] ? arr.length/2 : arr.length/2 -1;

        int left = centerIndex -1;
        int right = centerIndex +1;

        while((arr[left] < arr[left+1] && left > 0) && arr[right] < arr[right-1]){
            left--;
            right++;
        }

        while(left > 0){
            if(arr[left] < arr[left+1]){
                left--;
            }else{
                result = false;
                break;
            }
        }

        while(right < arr.length){
            if(arr[right] < arr[right-1]){
                right++;
            }else{
                result = false;
                break;
            }
        }
*/
