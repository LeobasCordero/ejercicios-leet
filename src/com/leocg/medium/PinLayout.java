package com.leocg.medium;

import com.leocg.objects.Pin;

import java.util.*;

/**
 *
 * hay una matriz de N columnas y debemos acomodar un listado de objetos como este
 *
 * pins = [
 *      {id: 1, height: 100 }
 *      {id: 2, height: 600 }
 *      {id: 3, height: 100 }
 *      {id: 4, height: 150 }
 *      {id: 5, height: 100 }
 * ]
 *
 * La idea es acomodar los objetos en las columnas basados en las alturas, siempre hay que revisar la altura
 * de las columnas de manera que se pueda equilibrar, adicional si hay un empate en la columna siguiente, el
 * objeto se colocara en la columna mas a la izquierda
 *
 * asi se llamarria la funcion
 *
 * layout(pins, 2)
 *
 * la salida seria como el siguiente formato
 *
 * [
 * //representa la primer columna
 * [{id: 1, height: 100 },
 * {id: 3, height: 100 },
 * {id: 4, height: 150 },
 * {id: 5, height: 100 }],
 * // representa la segunda columna del ejemplo
 * [{id: 2, height: 600 }]
 * ]
 */

public class PinLayout {

    public static List<List<Pin>> layout(List<Pin> pins, int columnsCount) {
        // Crear un arreglo para las columnas
        List<List<Pin>> columns = new ArrayList<>(columnsCount);
        for (int i = 0; i < columnsCount; i++) {
            columns.add(new ArrayList<>());
        }

        // Ordenar los pins en orden descendente por altura
        pins.sort((a, b) -> Integer.compare(b.height, a.height));

        // Colocar los elementos en las columnas
        int[] columnHeights = new int[columnsCount]; // Guarda las alturas acumuladas de cada columna
        for (Pin pin : pins) {
            // Encontrar la columna con menor altura (si hay empate, la columna más a la izquierda)
            int minColumn = 0;
            for (int i = 1; i < columnsCount; i++) {
                if (columnHeights[i] < columnHeights[minColumn]) {
                    minColumn = i;
                }
            }

            // Colocar el pin en la columna con la menor altura
            columns.get(minColumn).add(pin);
            columnHeights[minColumn] += pin.height;
        }

        return columns;
    }

}

