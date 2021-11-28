/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_class;

import java.util.ArrayList;

/**
 *
 * @author aman
 */
public class wraperClass {
    public static void main(String[] args) {
        System.out.println("Wraper classes\n");
        Integer in = new Integer(3);
        System.out.println(in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(in);
    }
}
