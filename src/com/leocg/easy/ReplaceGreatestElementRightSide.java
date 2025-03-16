package com.leocg.easy;

import com.leobas.impresion.Impresion;

import java.util.HashSet;

import static com.leocg.utils.Utils.imprimirTitulo;

/**
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
 *
 * After doing so, return the array.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [17,18,5,4,6,1]
 * Output: [18,6,6,6,1,-1]
 * Explanation:
 * - index 0 --> the greatest element to the right of index 0 is index 1 (18).
 * - index 1 --> the greatest element to the right of index 1 is index 4 (6).
 * - index 2 --> the greatest element to the right of index 2 is index 4 (6).
 * - index 3 --> the greatest element to the right of index 3 is index 4 (6).
 * - index 4 --> the greatest element to the right of index 4 is index 5 (1).
 * - index 5 --> there are no elements to the right of index 5, so we put -1.
 * Example 2:
 *
 * Input: arr = [400]
 * Output: [-1]
 * Explanation: There are no elements to the right of index 0.
 *
 *
 * Constraints:
 *
 * 1 <= arr.length <= 104
 * 1 <= arr[i] <= 105
 */
public class ReplaceGreatestElementRightSide {

    public int[] replaceElements(int[] arr) {
        imprimirTitulo("Replace Elements with Greatest Element on Right Side");

        int n = arr.length;
        int max = -1;  // Último elemento siempre será -1

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];  // Guardamos el valor actual
            arr[i] = max;       // Reemplazamos con el máximo de la derecha
            max = Math.max(max, temp);  // Actualizamos el máximo
        }

        return arr;
/*
// Mi codigo
        if(arr == null || arr.length < 2){
            return new int[] {-1};
        }

        for(int i = 0; i < arr.length-1; i++){
            int clearNum = 0;
            arr[i] = -1;
            for(int j = i; j < arr.length-1 ; j++){
                if(arr[i] < arr[j+1]){
                    arr[i] = arr[j+1];
                    clearNum = j+1;
                }
            }

            if(clearNum > 0){
            arr[i+1] = -1;
            }
        }

        return arr;

 */
    }
}
