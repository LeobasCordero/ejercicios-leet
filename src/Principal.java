
import com.leobas.aleatorios.Aleatorios;
import com.leobas.generacion.GeneracionNodos;
import com.leobas.impresion.Impresion;
import com.leocg.easy.*;
import com.leocg.hard.MedianTwoSortedArrays;
import com.leocg.medium.AddTwoNumbers;
import com.leocg.medium.ContainerWithMostWater;
import com.leocg.easy.LongestCommonPrefix;
import com.leocg.medium.LongestPalindrome;
import com.leobas.objects.ListNode;
import com.leocg.objects.Pin;

import java.util.ArrayList;
import java.util.List;

import static com.leocg.medium.PinLayout.layout;
import static com.leocg.utils.Utils.imprimirTitulo;

public class Principal {

    public static void main(String[] args){

        //nums = {2, 7, 11, 15} y target = 9
        TwoSum twoSum = new TwoSum();
        int[] nums = {21, 7, 11, 2, 0, -16};
        int[] response = twoSum.twoSum(nums, 11);

        imprimirTitulo("Two Sum");
        Impresion.imprimirLista(response);
        Impresion.imprimirSeparadorResultados();


        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        //128
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(8, null)));
        //2231
        ListNode l2 = new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(1, null))));
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);//1143
        imprimirTitulo("Add Two Numbers");
        Impresion.imprimirLista(result);

        LongestPalindrome longestPalindrome = new LongestPalindrome();
        imprimirTitulo("Longest Paindrome");
        Impresion.impresionNormal(longestPalindrome.longestPalindrome("6514anitalavalatina1"));
        Impresion.imprimirSeparadorResultados();

        FriendshipList relationFriendList = new FriendshipList();

        // Lista de empleados
        String[] employee_list = new String[]{
                "1,James,Accounting",
                "2,Ary,Administration",
                "3,Vika,Accounting",
                "4,Donnay,Finance",
                "5,Rox,HR",
                "6,Dan,Accounting",
                "9,Jessy,Finance"
        };

        // Lista de amistades entre empleados (pares de ID)
        String[] friendship_list = new String[]{
                "1,2",
                "1,3",
                "1,4",
                "2,6"
        };


        imprimirTitulo("Friendship List");
        relationFriendList.solution(employee_list, friendship_list);


        int[] array1 = Aleatorios.getInstance().generarIntArray(5, Boolean.TRUE);
        int[] array2 = Aleatorios.getInstance().generarIntArray(10, Boolean.TRUE);


        MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();
        double mediana = medianTwoSortedArrays.findMedianSortedArrays(array1, array2);
        imprimirTitulo("Median Two Sorted Arrays");
        Impresion.imprimirLista(array1);
        Impresion.imprimirLista(array2);
        System.out.println("");
        Impresion.impresionNormal(mediana);



        // Crear los pins
        List<Pin> pins = new ArrayList<>();
        pins.add(new Pin(1, 100));
        pins.add(new Pin(2, 600));
        pins.add(new Pin(3, 100));
        pins.add(new Pin(4, 150));
        pins.add(new Pin(5, 100));

        // Llamar a la función layout con 2 columnas
        List<List<Pin>> resultPin = layout(pins, 2);

        // Imprimir el resultado
        for (List<Pin> column : resultPin) {
            Impresion.imprimirLista(column, false);
        }

        int[] input = {-4,-1,0,3,10};
        SquaredSortedArray squaredSortedArray = new SquaredSortedArray();
        squaredSortedArray.sortedSquares(input);

        DuplicateZeros duplicateZeros = new DuplicateZeros();
        int[] inputDup = {1,0,2,3,0,4,5,0};
        duplicateZeros.duplicateZeros(inputDup);

        RemoveElement removeElement = new RemoveElement();
        int[] intArray = {3,2,2,3};
        int val = 3;
        removeElement.removeElement(intArray, val);

        RemoveDuplicatesSortedArray removeDuplicatesSortedArray = new RemoveDuplicatesSortedArray();
        int[] orderedArray ={0,0,1,1,1,2,2,3,3,4};
        //int[] orderedArray ={1,1,1};
        //int[] orderedArray ={1,1,1,2};
        //int[] orderedArray ={1,2,2};
        //int[] orderedArray ={1,1};
        int resultOrderedArray = removeDuplicatesSortedArray.removeDuplicates(orderedArray);
        Impresion.impresionNormal(resultOrderedArray);

        CheckNDoubleExist checkNDoubleExist = new CheckNDoubleExist();
        int[] arrayInput = {10,2,5,3};
        Impresion.impresionNormal(checkNDoubleExist.checkIfExist(arrayInput));

        ValidMountainArray validMountainArray = new ValidMountainArray();
        //int[] arrMountain = {2,1}; //false
        //int[] arrMountain = {3,5,5}; //false
        //int[] arrMountain = {0,3,2,1}; //true
        //int[] arrMountain = {0,2,3,4,5,2,1,0}; //true
        //int[] arrMountain = {0,1,2,3,4,8,9,10,11,12,11}; //true
        int[] arrMountain = {0,1,2,3,4,5,6,7,8,9}; //false
        Impresion.impresionNormal(validMountainArray.validMountainArray(arrMountain));

        ReplaceGreatestElementRightSide replaceGreatestElementRightSide = new ReplaceGreatestElementRightSide();
        int[] arrGreatest = {17,18,5,4,6,1};
        //int[] arrGreatest = {17,1};
        Impresion.imprimirLista(replaceGreatestElementRightSide.replaceElements(arrGreatest));

        MoveZeroes moveZeroes = new MoveZeroes();
        int[] arrZeros = {0,1,0,3,12};
        moveZeroes.moveZeroes(arrZeros);

        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int[] arrParity = {3,1,2,4};
        sortArrayByParity.sortArrayByParity(arrParity);

        HeightChecker heightChecker = new HeightChecker();
        //int[] arrHeighChecker = {3,1,2,4};
        //int[] arrHeighChecker = {1,1,4,2,1,3};
        int[] arrHeighChecker = {1,2,1,2,1,1,1,2,1};
        //int[] arrHeighChecker = {5,1,2,3,4};
        Impresion.impresionNormal("result: " + heightChecker.heightChecker(arrHeighChecker));

        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        int[] numsMax = {1,1,2};
        //int[] numsMax = {3,1,2,4};
        Impresion.impresionNormal("result: " + thirdMaximumNumber.thirdMax(numsMax));

        FindAllNumbersDisappearedArray findAllNumbersDisappearedArray = new FindAllNumbersDisappearedArray();
        //int[] numsMissing = {1,1,2};
        int[] numsMissing = {4,3,2,7,8,2,3,1};
        //int[] numsMissing = {1,1};
        //int[] numsMissing = {1};
        Impresion.imprimirListaHorizontal(findAllNumbersDisappearedArray.findDisappearedNumbers(numsMissing));

        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] heightArray = {1,8,6,2,5,4,8,3,7};
        Impresion.impresionNormal(containerWithMostWater.maxArea(heightArray));

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        //String[] stringArray = {"flower","flow","flight"};
        //String[] stringArray = {"reflower","flow","flight"};
        //String[] stringArray = {"acc","aaa","aaba"};
        //String[] stringArray = {"ab", "a"};
        String[] stringArray = {"a"};
        Impresion.impresionNormal(longestCommonPrefix.longestCommonPrefix(stringArray));

        ValidParentheses validParentheses = new ValidParentheses();
        String stringParenthesis = "([])";
        //String stringParenthesis = "()[]{}";
        //String stringParenthesis = ")(){}";
        //String stringParenthesis = "(]";
        //String stringParenthesis = "([)]";
        //String stringParenthesis = "(}{)";
        //String stringParenthesis = "[])";
        Impresion.impresionNormal(validParentheses.isValid(stringParenthesis));

        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        int[] ln1Nums = {}; int[] ln2Nums = {};
        //int[] ln1Nums = {}; int[] ln2Nums = {0};
        //int[] ln1Nums = {-6,-5,6,6,7}; int[] ln2Nums = {0};
        //int[] ln1Nums = {1}; int[] ln2Nums = {};
        //int[] ln1Nums = {1,2,4}; int[] ln2Nums = {1,3,4};
        ListNode listNode1 = GeneracionNodos.setListNodes(ln1Nums);
        ListNode listNode2 = GeneracionNodos.setListNodes(ln2Nums);
        Impresion.imprimirLista(mergeTwoLists.mergeTwoLists(listNode1, listNode2));

        FindIndexFirstOcurrenceString findIndexFirstOcurrenceString = new FindIndexFirstOcurrenceString();
        String haystack = "mississippi";String needle = "issip";
        //
        // String haystack = "leetcode";String needle = "leeto";
        //String haystack = "sadbutsad";String needle = "sad";
        Impresion.impresionNormal(findIndexFirstOcurrenceString.strStr(haystack, needle));

        MaxConsecutiveOnesII maxConsecutiveOnesII = new MaxConsecutiveOnesII();
        //int[] binaryArray = {1,0,1,1,0};
        //int[] binaryArray = {1,0,1,1,0,1};
        //int[] binaryArray = {1,1,0,1};
        //int[] binaryArray = {1};
        //int[] binaryArray = {0};
        int[] binaryArray = {0,1};
        Impresion.impresionNormal(maxConsecutiveOnesII.findMaxConsecutiveOnes(binaryArray));

        HouseRobber houseRobber = new HouseRobber();
        int[] robHouses = {1,2,3,1};
        Impresion.impresionNormal(houseRobber.rob(robHouses));

        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
        //int[] minCostArray = {10,15,20};
        int[] minCostArray = {1,100,1,1,1,100,1,1,100,1};
        Impresion.impresionNormal(minCostClimbingStairs.minCostClimbingStairs(minCostArray));
    }
}
