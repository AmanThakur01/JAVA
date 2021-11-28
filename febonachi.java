/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_class;
/**
 * @author aman
 */
public class febonachi {
    public static void main(String[] args) {
        System.out.println("0");
        int a=0,b=1,val=5;
        for (int i = 0; i < val; i++) {
            int sum = a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }
}
