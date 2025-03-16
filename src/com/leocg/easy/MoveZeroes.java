package com.leocg.easy;

import com.leobas.impresion.Impresion;

import static com.leocg.utils.Utils.imprimirTitulo;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 *
 *
 * Follow up: Could you minimize the total number of operations done?
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        imprimirTitulo("Move Zeros");
        Impresion.impresionNormal("Input: ");
        Impresion.imprimirLista(nums);
        int j = 0;

        if (nums.length == 0) {
            Impresion.impresionNormal("Zeros: 0");
        }

        if(nums.length == 1){
            Impresion.impresionNormal("Zeros: 1");
        }

        for(int i = j; i < nums.length; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }

        for(int k = j; k < nums.length; k++){
            nums[k] = 0;
        }

        Impresion.impresionNormal("Output: ");
        Impresion.imprimirLista(nums);

        Impresion.impresionNormal("Zeros: " + j);

    }
}
