package com.leocg.easy;

import java.util.Map;

public class CharSum {

    /*
    A - 1
    B - 2
    C - 3
            .
            .
    Z -26


    input abc1
    output - 7
*/

    public static int sumAlphanumeric(String input) {
        int sum = 0;

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += c - '0';  // Convertir de carácter a número
            } else if (Character.isLetter(c)) {
                sum += Character.toLowerCase(c) - 'a' + 1;  // Convertir a valor basado en a=1, b=2...
            }
        }

        return sum;
    }

    /*
    public int sumAlpha (String input){

        int sum = 0;
        char[] allChars = input.toCharArray();
        Hashmap<char, int> alphabetMap = new Map();
        //  lets assume alphabetMap contains all the alphabet and values

        for(int i =0; i < allChars.length; i++){
            // this can be extend for lower case
            if(allChars[i].getAsciiValue() > 64 ||  allChars[i].getAsciiValue() < 90){
                // char its from alphabet
                int value = alphabetMap.get(allChars[i]);
                sum+=value;
                continue;
            }
            if(Integer.valueOf(allChars[i]) > 0){
                sum+=allChars[i];
                continue;
            }else{
                throw new Exception("Not in the alphanumeric range")
            }

        }

        return sum;

    }

     */
}
