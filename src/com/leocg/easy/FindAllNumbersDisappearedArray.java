package com.leocg.easy;

import com.leobas.impresion.Impresion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static com.leocg.utils.Utils.imprimirTitulo;

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * Example 2:
 *
 * Input: nums = [1,1]
 * Output: [2]
 *
 *
 * Constraints:
 *
 * n == nums.length
 * 1 <= n <= 105
 * 1 <= nums[i] <= n
 *
 *
 * Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */
public class FindAllNumbersDisappearedArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        imprimirTitulo("Find All Numbers Dissapeared");
        Impresion.impresionNormal("Input: ");
        Impresion.imprimirLista(nums);
        List<Integer> result = new ArrayList<>();

        // Paso 1: Marcar los números presentes
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // Convertir el número a un índice válido
            if (nums[index] > 0) {
                nums[index] = -nums[index]; // Marcamos como negativo para indicar que el número está presente
            }
        }

        // Paso 2: Encontrar los números no marcados (desaparecidos)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1); // El número desaparecido es (índice + 1)
            }
        }

        /*


        if(nums.length == 1){
            Impresion.impresionNormal("Output: ");
            return new ArrayList<>();
        }

        HashSet<Integer> mapSorted = new HashSet();

        for (int num : nums) {
            mapSorted.add(num);
        }

        for(int j = 1; j <= nums.length; j++){
            if(!mapSorted.contains(j)){
                result.add(j);
            }
        }

         */

        Impresion.impresionNormal("Output: ");
        return result;
    }
}
