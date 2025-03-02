package com.leocg.utils;

import com.leobas.constantes.Constantes;
import com.leobas.impresion.Impresion;
import com.leocg.objects.ListNode;

public class Utils {

    public static void imprimirLista(ListNode head) {
        ListNode actual = head;  // Comenzamos desde la cabeza de la lista
        while (actual != null) {
            System.out.print(actual.val);  // Imprimir el valor del nodo actual
            if (actual.next != null) {
                System.out.print(" -> ");  // Separador entre nodos
            }
            actual = actual.next;  // Mover al siguiente nodo
        }
        System.out.println();  // Nueva línea después de imprimir toda la lista
        System.out.println("--------- ");
    }

    public static void imprimirTitulo(String titulo){
        Impresion.impresionNormal(Constantes.SEPARADOR);
        Impresion.impresionNormal(titulo);
        Impresion.impresionNormal(Constantes.SEPARADOR);
    }


}
