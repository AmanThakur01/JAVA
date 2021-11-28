/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first_class;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author aman
 */
class T{
    int k;
    public void show(){
        System.out.println("show is here");
    }
}
public class collectionNgenerics {
    public static void main(String[] args) {
        
        
        Collection<Integer> r = new ArrayList<>();
        r.add(1);
        System.out.println("collection : "+r);
        System.out.println("r.isEmpty() : "+r.isEmpty());
        r.remove(1);
        System.out.println("collection : "+r);
        
        /////////////////////////////////////////////////////
        T e = new T();
        e.k=3;
        Collection<T> c = new ArrayList<>();
        c.add(e);
        System.out.println("e : "+c);
        
        //////////////////////////////////////////////////////
        Collection value = new ArrayList();
        value.add("aman");
        value.add("q");
        value.add(1);
        value.add(1.2f);
        ///////////////////////////////////////////////////////
        
        for(int i : r){
            System.out.println(i);
        }
         Iterator i = value.iterator();
         while (i.hasNext()) {            
             System.out.println(i.next());
        }
         
         ///////////////////////////////////////////////////////
         
        Vector v = new Vector();// vector<integer>
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        
        List<Integer> ii = new ArrayList<>();
        ii.add(1);
        ii.add(2);
        ii.add(5);
        ii.add(12);
        ii.add(2);
        
        Comparator<Integer> comp = new impl();//interface
        Collections.sort(ii,comp);
    }
}
class impl implements Comparator<Integer>{
    @Override
    public int compare(Integer o1,Integer o2){
        if (o1>o2){
            return 1;
        }
        return   -1;
    }
}