package com.leocg.easy;

import com.leobas.impresion.Impresion;

import java.util.Arrays;

import static com.leocg.utils.Utils.imprimirTitulo;

/**
 * Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,2,1]
 * Output: 1
 * Explanation:
 * The first distinct maximum is 3.
 * The second distinct maximum is 2.
 * The third distinct maximum is 1.
 * Example 2:
 *
 * Input: nums = [1,2]
 * Output: 2
 * Explanation:
 * The first distinct maximum is 2.
 * The second distinct maximum is 1.
 * The third distinct maximum does not exist, so the maximum (2) is returned instead.
 * Example 3:
 *
 * Input: nums = [2,2,3,1]
 * Output: 1
 * Explanation:
 * The first distinct maximum is 3.
 * The second distinct maximum is 2 (both 2's are counted together since they have the same value).
 * The third distinct maximum is 1.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 *
 *
 * Follow up: Can you find an O(n) solution?
 */
public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        imprimirTitulo("Third Maximum Number");
        Impresion.impresionNormal("Input: ");
        Impresion.imprimirLista(nums);

        int max = 0;
        int i = nums.length-1;

        if(nums.length == 1){
            return nums[0];
        }

        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }

        Arrays.sort(nums);

        while(max < 2 && i > 0){
            if(nums[i] != nums[i-1]){
                max++;
            }
            i--;
        }

        if(max < 2){
            return nums[nums.length-1];
        }

        Impresion.impresionNormal("Output: ");
        Impresion.imprimirLista(nums);

        return nums[i];

        /*
        if (nums == null || nums.length == 0) {
        throw new IllegalArgumentException("El arreglo no puede estar vacío o ser nulo.");
    }

    int firstMax = Integer.MIN_VALUE; // Mayor elemento único
    int secondMax = Integer.MIN_VALUE; // Segundo mayor elemento único

    for (int num : nums) {
        if (num > firstMax) {
            secondMax = firstMax; // El antiguo firstMax ahora es el segundo mayor
            firstMax = num; // Actualizamos el mayor
        } else if (num > secondMax && num < firstMax) {
            secondMax = num; // Actualizamos el segundo mayor
        }
    }

    // Si no hay un segundo mayor único, devolvemos el mayor
    if (secondMax == Integer.MIN_VALUE) {
        return firstMax;
    }

    return secondMax;
         */
    }
}
