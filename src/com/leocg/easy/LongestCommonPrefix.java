package com.leocg.easy;

import com.leobas.impresion.Impresion;

import static com.leocg.utils.Utils.imprimirTitulo;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters if it is non-empty.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        imprimirTitulo("Longest Common Prefix");
        Impresion.impresionNormal("Input: ");
        Impresion.imprimirLista(strs);

        if(strs.length == 1){
            return strs[0];
        }

        String result = strs[0];

        for(int i = 0; i < strs.length; i++){
            int j = Math.min(strs[i].length(), result.length());

            while(j > 0){
                if(strs[i].substring(0, j).equals(result.substring(0, j))){
                   result = strs[i].substring(0, j);
                   j=-1;
                }else{
                    j--;
                }
            }

            if(j == 0){
                i = strs.length;
                result = "";
            }
        }

        Impresion.impresionNormal("Output: ");
        return result;

        /*
         if (strs == null || strs.length == 0) return "";

    String prefix = strs[0];

    for (int i = 1; i < strs.length; i++) {
        int j = 0;

        // Compara carácter por carácter
        while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) {
            j++;
        }

        prefix = prefix.substring(0, j);  // Reduce el prefijo común

        if (prefix.isEmpty()) break;  // Si el prefijo se vuelve vacío, terminamos
    }

    return prefix;
         */
    }
}
