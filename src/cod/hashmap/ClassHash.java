/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod.hashmap;

import java.util.HashMap;

/**
 *
 * @author Juan Martínez
 */
public class ClassHash implements InterfaceHash{

    public  HashMap<Integer, String> miHashOriginal = new HashMap<Integer, String>();
    
    @Override
    public void putValue(Integer key, String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getValue(Integer key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
