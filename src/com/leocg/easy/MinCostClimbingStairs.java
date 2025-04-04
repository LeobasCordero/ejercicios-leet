package com.leocg.easy;

import com.leobas.impresion.Impresion;

import static com.leocg.utils.Utils.imprimirTitulo;

/**
 * You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
 *
 * You can either start from the step with index 0, or the step with index 1.
 *
 * Return the minimum cost to reach the top of the floor.
 *
 *
 *
 * Example 1:
 *
 * Input: cost = [10,15,20]
 * Output: 15
 * Explanation: You will start at index 1.
 * - Pay 15 and climb two steps to reach the top.
 * The total cost is 15.
 * Example 2:
 *
 * Input: cost = [1,100,1,1,1,100,1,1,100,1]
 * Output: 6
 * Explanation: You will start at index 0.
 * - Pay 1 and climb two steps to reach index 2.
 * - Pay 1 and climb two steps to reach index 4.
 * - Pay 1 and climb two steps to reach index 6.
 * - Pay 1 and climb one step to reach index 7.
 * - Pay 1 and climb two steps to reach index 9.
 * - Pay 1 and climb one step to reach the top.
 * The total cost is 6.
 *
 *
 * Constraints:
 *
 * 2 <= cost.length <= 1000
 * 0 <= cost[i] <= 999
 */
public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        imprimirTitulo("Min Cost Climbing Stairs");
        Impresion.impresionNormal("Input: ");
        Impresion.imprimirLista(cost);

        Impresion.impresionNormal("Output: ");
        /*
        if(cost.length == 1){
            return cost[0];
        }

        int[] minCostSteps = new int[cost.length];
        minCostSteps[cost.length-1] = cost[cost.length-1];
        minCostSteps[cost.length-2] = Math.min(cost[cost.length-1], cost[cost.length-2]);

        for(int i = cost.length - 3; i >= 0; i--){
            minCostSteps[cost.length - 1 - i] = Math.min(minCostSteps[i], minCostSteps[i + 1] + cost[i]);
        }

         */

        int n = cost.length;

        if (n == 1) return cost[0]; // Caso base si solo hay un escalón

        int[] dp = new int[n + 1]; // DP hasta el escalón final

        // Inicialización de los primeros escalones
        dp[0] = 0;
        dp[1] = 0;

        // Construcción de la solución óptima
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }

        Impresion.imprimirLista(dp);

        return dp[n]; // El mínimo costo para llegar al último escalón

        //Impresion.imprimirLista(minCostSteps);

        //return minCostSteps[0];
    }
}
