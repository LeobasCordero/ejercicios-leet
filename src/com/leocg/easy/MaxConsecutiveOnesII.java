package com.leocg.easy;

import com.leobas.impresion.Impresion;

import static com.leocg.utils.Utils.imprimirTitulo;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array if you can flip at most one 0.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,0,1,1,0]
 * Output: 4
 * Explanation:
 * - If we flip the first zero, nums becomes [1,1,1,1,0] and we have 4 consecutive ones.
 * - If we flip the second zero, nums becomes [1,0,1,1,1] and we have 3 consecutive ones.
 * The max number of consecutive ones is 4.
 * Example 2:
 *
 * Input: nums = [1,0,1,1,0,1]
 * Output: 4
 * Explanation:
 * - If we flip the first zero, nums becomes [1,1,1,1,0,1] and we have 4 consecutive ones.
 * - If we flip the second zero, nums becomes [1,0,1,1,1,1] and we have 4 consecutive ones.
 * The max number of consecutive ones is 4.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * nums[i] is either 0 or 1.
 *
 *
 * Follow up: What if the input numbers come in one by one as an infinite stream? In other words, you can't store all numbers coming from the stream as it's too large to hold in memory. Could you solve it efficiently?
 */
public class MaxConsecutiveOnesII {

    public int findMaxConsecutiveOnes(int[] nums) {
        imprimirTitulo("Max Consecutives Ones II");
        Impresion.impresionNormal("Input: ");
        Impresion.imprimirLista(nums);
/*
        int maxConsec = 0;
        int lastIndex = 0;
        int remains = 0;

        if(nums.length == 1){
            return 1;
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                int newMaxConsec = i - lastIndex + remains;
                if(newMaxConsec > maxConsec){
                    maxConsec = newMaxConsec;
                    lastIndex = i+1;
                    remains = 0;
                }
            }else{
                remains++;
            }
        }

        if(maxConsec == 0){
            maxConsec+=remains;
        }

 */

        int maxConsec = 0; // Máximo número de 1s consecutivos
        int left = 0; // Puntero izquierdo
        int zeroCount = 0; // Cuenta los 0s en la ventana

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++; // Contamos los 0s en la ventana
            }

            // Si hay más de un '0', movemos el puntero izquierdo para reducir la ventana
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--; // Reducimos el conteo de 0s al mover left
                }
                left++; // Movemos la ventana a la derecha
            }

            // Actualizamos la longitud máxima de la ventana actual
            maxConsec = Math.max(maxConsec, right - left + 1);
        }

        Impresion.impresionNormal("Output: ");

        return maxConsec;
    }
}
