package com.leocg.easy;

import static com.leocg.utils.Utils.imprimirTitulo;

/**
 * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
 *
 * Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * Example 2:
 *
 * Input: arr = [1,2,3]
 * Output: [1,2,3]
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 *
 *
 * Constraints:
 *
 * 1 <= arr.length <= 104
 * 0 <= arr[i] <= 9
 */
public class DuplicateZeros {

    public int[] duplicateZeros(int[] arr) {
        imprimirTitulo("Duplicate Zeros");
        int[] response = new int[arr.length];
        int i = 0;
        int j = 0;

        while(j < response.length){
            response[j] = arr[i];
            j++;
            if(arr[i] == 0){
                response[j]=0;
                j++;
            }
            i++;
        }

        return response;
    }

    /**
     * int n = arr.length;
     *         int countZero = 0;
     *
     *         // Contamos cuántos ceros cabrán dentro del límite del array
     *         int i = 0;
     *         for (; i + countZero < n; i++) {
     *             if (arr[i] == 0) {
     *                 countZero++;
     *             }
     *         }
     *
     *         // i ahora apunta a la posición del último elemento que se copiará
     *         // Comenzamos a copiar desde el final hacia el principio
     *         int j = n - 1; // índice para escribir
     *         i--; // ajustamos i para que apunte al último elemento leído
     *
     *         while (i >= 0) {
     *             // Copiamos el elemento en la nueva posición
     *             arr[j] = arr[i];
     *             j--;
     *
     *             // Si el elemento es cero, duplicamos
     *             if (arr[i] == 0 && i + countZero < n) {
     *                 arr[j] = 0;
     *                 j--;
     *             }
     *
     *             i--;
     *         }
     */

}
