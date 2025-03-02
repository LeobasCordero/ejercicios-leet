package com.leocg.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
 *
 * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 */
public class LetterCombinationPhone {

    /**
     * Ejemplos
     *
     * Example 1:
     *
     * Input: digits = "23"
     * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
     * Example 2:
     *
     * Input: digits = ""
     * Output: []
     * Example 3:
     *
     * Input: digits = "2"
     * Output: ["a","b","c"]
     *
     *
     * Constraints:
     *
     * 0 <= digits.length <= 4
     * digits[i] is a digit in the range ['2', '9'].
     */

    // Mapa para almacenar la relación entre dígitos y letras
    private final String[] digitToLetters = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };

    private List<String> result;

    public List<String> letterCombinations(String digits) {
        // Si la entrada está vacía, retornamos una lista vacía
        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        result = new ArrayList<>();
        backtrack(digits, 0, new StringBuilder());
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder currentCombination) {
        // Si hemos procesado todos los dígitos, agregamos la combinación actual al resultado
        if (index == digits.length()) {
            result.add(currentCombination.toString());
            return;
        }

        // Obtenemos las letras correspondientes al dígito actual
        String letters = digitToLetters[digits.charAt(index) - '0'];

        // Para cada letra correspondiente al dígito actual
        for (char letter : letters.toCharArray()) {
            // Agregamos la letra actual
            currentCombination.append(letter);

            // Llamada recursiva para el siguiente dígito
            backtrack(digits, index + 1, currentCombination);

            // Removemos la última letra para probar la siguiente combinación
            currentCombination.setLength(currentCombination.length() - 1);
        }
    }
}
