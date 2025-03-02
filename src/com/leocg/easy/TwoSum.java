package com.leocg.easy;



import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
public class TwoSum {
    /**
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     *
     *
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     *
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     *
     * 2 <= nums.length <= 104
     * -109 <= nums[i] <= 109
     * -109 <= target <= 109
     */

    public int[] twoSum(int[] nums, int target) {
/*
        int[] result = {0,0};

        if(nums.length >= 2 && nums.length <= 104) {

            for (int i = 0; i < nums.length; i++) {
                int first = nums[i];
                if(first <-109 && first>109){
                    Impresion.impresionNormal("not valid value");
                    break;
                }

                int complement = target - first;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == complement) {
                        result = new int[]{i,j};
                    }
                }
            }
            return result;
        }else{
            Impresion.impresionNormal("not valid array");
        }

        return result;

 */

        Map<Integer, Integer> map = new HashMap<>();

        // Recorrer el array de números
        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];

            // Si el complemento ya existe en el mapa, devolver los índices
            // busca por containKey porque ese me traera devuelta el valor si es que existe  O (1)
            // NO se busca por containsValue porque iteraria todos los valosres y verificaria si el valor es el que busco O (n)
            if (map.containsKey(complemento)) {
                return new int[] { map.get(complemento), i };
            }

            // Si no, almacenar el número actual junto con su índice
            map.put(nums[i], i);
        }

        // Retornar un arreglo vacío si no hay solución (no debería ocurrir según la premisa)
        throw new IllegalArgumentException("No solution found");
    }
}
