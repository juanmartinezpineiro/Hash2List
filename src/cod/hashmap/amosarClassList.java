/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod.hashmap;

import java.util.Iterator;

/**
 *
 * @author Juan Martínez
 */
public class amosarClassList {
    public static void mostrar(ClassList lista) {
        String mensaje = "Lista: \n";
        Iterator it = lista.miLista.iterator();
        while (it.hasNext()) {
           mensaje = mensaje + " " + it.next() + "\n";
        }
        System.out.println(mensaje);
    } 
}
