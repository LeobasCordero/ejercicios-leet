package com.leocg.easy;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums is sorted in non-decreasing order.
 *
 *
 * Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 */
public class SquaresSortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] sortedSquares = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            sortedSquares[i] = nums[i]*nums[i];
        }

        Arrays.sort(sortedSquares);

        return sortedSquares;

        /*
        int n = nums.length;
    int[] sortedSquares = new int[n];
    int left = 0; // Puntero para el inicio del arreglo
    int right = n - 1; // Puntero para el final del arreglo
    int index = n - 1; // Índice para llenar el arreglo de resultados

    // Llenar el arreglo de resultados desde el final
    while (left <= right) {
        int leftSquare = nums[left] * nums[left];
        int rightSquare = nums[right] * nums[right];

        // Colocar el cuadrado más grande al final del arreglo de resultados
        if (leftSquare > rightSquare) {
            sortedSquares[index] = leftSquare;
            left++; // Movemos el puntero izquierdo
        } else {
            sortedSquares[index] = rightSquare;
            right--; // Movemos el puntero derecho
        }
        index--; // Movemos el índice hacia la izquierda
    }

    return sortedSquares;
         */
    }
}
