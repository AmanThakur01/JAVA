/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_class;

import java.util.Hashtable;

/**
 *
 * @author aman
 */
public class frameworkDict {
    public static void main(String[] args) {
        Hashtable <String,String> dict = new Hashtable<String,String>();
        dict.put("name", "Aman");
        dict.put("name", "Thakur");
        System.out.println(dict.get("name"));
        System.out.println(dict.isEmpty());
        System.out.println(dict.size());
    }
}
