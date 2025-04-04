package com.leocg.easy;


import com.leobas.impresion.Impresion;

import static com.leocg.utils.Utils.imprimirTitulo;

/**
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 *
 * Return any array that satisfies this condition.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,1,2,4]
 * Output: [2,4,3,1]
 * Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 5000
 * 0 <= nums[i] <= 5000
 */

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {
        imprimirTitulo("Sort Arrays By Parity");
        Impresion.impresionNormal("Input: ");
        Impresion.imprimirLista(nums);

        int j = nums.length-1;

        if(nums == null || nums.length == 0){
            return new int[0];
        }

        for(int i = j; i >= 0; i--){
            if(nums[i] % 2 != 0){
                int aux = nums[j];
                nums[j] = nums[i];
                nums[i] = aux;

                j--;
            }
        }
        /*
         int j = 0;  // Puntero para los números pares

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] % 2 == 0) {  // Si es par, intercambiamos con nums[j]
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;  // Avanzamos la posición de los pares
        }
    }
         */
        Impresion.impresionNormal("Output: ");
        Impresion.imprimirLista(nums);

        return nums;
    }
}
