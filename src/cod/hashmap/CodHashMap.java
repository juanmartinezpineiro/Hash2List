/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod.hashmap;

/**
 *
 * @author Juan Martínez
 */
public class CodHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ClassList miLista = new ClassList();
        ClassHash miHash = new ClassHash();
        //añadir
//        miLista.putElement("UNO");
//        miLista.putElement("DOS");
//        miLista.putElement("TRES");
//        miLista.putElement("CUATRO");
        miHash.putValue(10, "uno");
        miHash.putValue(11, "dos");
        miHash.putValue(12, "tres");
//ADAPTADOR
Hash2List miHash2List = new Hash2List(miHash);
        //MOSTRAR
        //MostrarClassList.mostrar(miLista);
amosarClassList.mostrar(miHash2List);
    }
    
}
