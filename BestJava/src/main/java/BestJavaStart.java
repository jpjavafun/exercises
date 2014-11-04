
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.jp.bestjava.collectionstudy.*;
import com.jp.bestjava.generics.*;
import com.jp.bestjava.equalsstudy.*;
import com.jp.bestjava.generics.*;
import com.jp.bestjava.enums.*;
import com.jp.bestjava.generics.*;
import com.jp.bestjava.datastructure.*;
import java.util.*;

/**
 *
 * @author jpaisley
 */
public class BestJavaStart {
    
     public static void main(String[] args){
        
        ListCreator c = new ListCreator();
        
        System.out.println(GenericsImpl.getNum(5));
        System.out.println(GenericsImpl.getNum("to"));
        
        
        ArrayList<Integer> arr = new ArrayList<>();
       
        for (int i=0; i<20; i++)
            arr.add(i);
        
        System.out.println(GenericsImpl.getCount(arr));
        
        JoeObj jo = new JoeObj(1,2);
        jo.hashCode();
        
        
        SingletonEnum.INSTANCE.doSomething();
        
        String s = GenericsImpl.getNum("s");
        
        ArraysStudy.createArrays();
        
    }
    
}
