
import com.leobas.aleatorios.Aleatorios;
import com.leobas.constantes.Constantes;
import com.leobas.impresion.Impresion;
import com.leocg.easy.DuplicateZeros;
import com.leocg.easy.FriendshipList;
import com.leocg.easy.SquaredSortedArray;
import com.leocg.easy.TwoSum;
import com.leocg.hard.MedianTwoSortedArrays;
import com.leocg.medium.AddTwoNumbers;
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

    }
}
