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
public class Hash2List extends ClassList{
 
    public Hash2List (ClassHash hashAconvertir){
           Iterator it= hashAconvertir.miHashOriginal.keySet().iterator();  
           while (it.hasNext()){
           miLista.add(hashAconvertir.miHashOriginal.get(it.next()));
           }
    }
}
