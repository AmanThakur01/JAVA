/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_class;

/**
 *
 * @author aman
 */
public class inhance_forloop {
    public static void main(String[] args) {
        char arr[] = new char[12];
        arr[0]='a';
        arr[1]='b';
        arr[2]='c';
        for (char i : arr) {
            System.out.println("values in arr[] : "+i);
        }
    }
    
}
