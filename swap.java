/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_class;
/**
 * @author aman
 */
public class swap {
    public static void main(String[] args) {
        int a=2,b=1,c;
        a=a+b-(b=a);
        System.out.println("a"+a);
        System.out.println("b"+b);
    }
}
