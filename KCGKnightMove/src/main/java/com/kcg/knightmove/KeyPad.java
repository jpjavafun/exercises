/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcg.knightmove;

/**
 *
 * @author jpaisley
 */

import java.util.*;

public class KeyPad {
    
    
    Set<Key> keys;
    
    KeyPad(){
        
        
        configureKeys();
    }
    
    
    
    public void configureKeys(){
        
        keys = new HashSet<>();
        keys.add(new Key('A', new char[] {'L','H'},true));
        keys.add(new Key('B', new char[] {'K','M','I'}, false));
        keys.add(new Key('C', new char[] {'F','L','N','J'}, false));
        keys.add(new Key('D', new char[] {'G','M','O'}, false));
        keys.add(new Key('E', new char[] {'H','N'}, true));
        keys.add(new Key('F', new char[] {'C','M','1'}, false));
        keys.add(new Key('G', new char[] {'D','N','2'}, false));
        keys.add(new Key('H', new char[] {'A','K','E','O','1','3'}, false));
        keys.add(new Key('I', new char[] {'B','L','2'}, true));
        keys.add(new Key('J', new char[] {'C','M','3'}, false));
        keys.add(new Key('K', new char[] {'B','H','2'}, false));
        keys.add(new Key('L', new char[] {'A','C','I','3'}, false));
        keys.add(new Key('M', new char[] {'F','B','D','J'}, false));
        keys.add(new Key('N', new char[] {'1','G','C','E'}, false));
        keys.add(new Key('O', new char[] {'2','H','D'}, true));
        keys.add(new Key('1', new char[] {'F','H','N'}, false));
        keys.add(new Key('2', new char[] {'K','G','I','O'}, false));
        keys.add(new Key('3', new char[] {'L','H','J'}, false));
        
        
        
    }
    
    
    public Key getKey(char key){
        
        
        for(Key k : this.keys){
            
            if(key == k.getName()){
                return k;
            }
        }
        return null;
    }
    
    
    
}
