package com.leocg.easy;

import com.leobas.impresion.Impresion;

import java.util.Arrays;

import static com.leocg.utils.Utils.imprimirTitulo;

/**
 * A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
 *
 * You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
 *
 * Return the number of indices where heights[i] != expected[i].
 *
 *
 *
 * Example 1:
 *
 * Input: heights = [1,1,4,2,1,3]
 * Output: 3
 * Explanation:
 * heights:  [1,1,4,2,1,3]
 * expected: [1,1,1,2,3,4]
 * Indices 2, 4, and 5 do not match.
 * Example 2:
 *
 * Input: heights = [5,1,2,3,4]
 * Output: 5
 * Explanation:
 * heights:  [5,1,2,3,4]
 * expected: [1,2,3,4,5]
 * All indices do not match.
 * Example 3:
 *
 * Input: heights = [1,2,3,4,5]
 * Output: 0
 * Explanation:
 * heights:  [1,2,3,4,5]
 * expected: [1,2,3,4,5]
 * All indices match.
 *
 *
 * Constraints:
 *
 * 1 <= heights.length <= 100
 * 1 <= heights[i] <= 100
 */
public class HeightChecker {

    public int heightChecker(int[] heights) {
        imprimirTitulo("Height Checker");
        Impresion.impresionNormal("Input: ");
        Impresion.imprimirLista(heights);
/*
        int expected = 0;

        if(heights.length == 1){
            return expected;
        }

        for(int i = 0; i < heights.length-1; i++){
            if(heights[i] > heights[i+1]){
                int aux = heights[i];
                heights[i] = heights[i+1];
                heights[i+1] = aux;
                expected++;
            }
        }

        if(heights.length -1 == expected){
            expected++;
        }
        Impresion.impresionNormal("Output: ");
        Impresion.imprimirLista(heights);
*/

        // Crear una copia del arreglo y ordenarla
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);

        // Contar cuántos elementos difieren entre el arreglo original y el ordenado
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        Impresion.impresionNormal("Output: ");
        Impresion.imprimirLista(expected);

        return count;
    }
}
