package com.leocg.easy;


import com.leobas.constantes.Constantes;
import com.leobas.impresion.Impresion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FriendshipList {

    /**
     * String[] employee_list = new String[]{
     *       "1,James,Accounting",
     *       "2,Ary,Administration",
     *       "3,Vika,Accounting",
     *       "4,Donnay,Finance",
     *       "5,Rox,HR",
     *       "6,Dan,Accounting",
     *       "9,Jessy,Finance"
     *     };
     *
     *     String[] friendship_list = new String[]{
     *       "1,2",
     *       "1,3",
     *       "1,4",
     *       "2,6"
     *     };
     *
     *     obtener
     */

    public void solution(String[] employee_list, String[] friendship_list){
        // Crear un mapa para almacenar las relaciones por ID de empleado
        Map<Integer, List<Integer>> relaciones = new HashMap<>();

        // Inicializar las listas vacías para cada empleado
        for (String employee : employee_list) {
            String[] datos = employee.split(Constantes.COMA);
            int employeeId = Integer.parseInt(datos[0]);
            relaciones.put(employeeId, new ArrayList<>());  // Inicializar la lista de relaciones vacía
        }

        // Procesar las relaciones de amistad
        for (String friendship : friendship_list) {
            String[] ids = friendship.split(",");
            int id1 = Integer.parseInt(ids[0]);
            int id2 = Integer.parseInt(ids[1]);

            // Agregar la relación a ambas listas
            relaciones.get(id1).add(id2);
            relaciones.get(id2).add(id1);
        }

        Impresion.imprimirHashMap(relaciones);
    }

}

