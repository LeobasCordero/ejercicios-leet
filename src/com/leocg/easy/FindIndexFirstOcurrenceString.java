package com.leocg.easy;

import com.leobas.impresion.Impresion;

import static com.leocg.utils.Utils.imprimirTitulo;

/**
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 *
 *
 * Example 1:
 *
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * Example 2:
 *
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 *
 *
 * Constraints:
 *
 * 1 <= haystack.length, needle.length <= 104
 * haystack and needle consist of only lowercase English characters.
 */
public class FindIndexFirstOcurrenceString {

    public int strStr(String haystack, String needle) {
        imprimirTitulo("Find the index of a first occurrence in a string");
        Impresion.impresionNormal("Input: ");
        Impresion.impresionNormal(haystack);
        Impresion.impresionNormal(needle);
/*
        int index = 0;
        int i = 0;
        int j = 0;

        while(i < haystack.length() && j < needle.length()){
            j = 0;
            while(j < needle.length()) {
                if (haystack.charAt(i) == needle.charAt(j)) {
                    j++;
                } else {
                    j = -1;
                }
            }

            i++;
        }

        index = j < needle.length() ? -1 : i - needle.length();
        */

        Impresion.impresionNormal("Output: ");
        if (needle.isEmpty()) return 0; // Caso especial: si needle está vacío, devuelve 0

        int hayLen = haystack.length();
        int needleLen = needle.length();

        for (int i = 0; i <= hayLen - needleLen; i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }

        return -1;

        //return index;
    }
}
