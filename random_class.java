/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_class;
import java.util.Random;
/**
 *
 * @author aman
 */
public class random_class {
    public static void main(String[] args) {
        int array[]=new int[10];
        Random r=new Random(10);
        for (int i=0;i<10;i++) {
            array[i]=r.nextInt(10);
        }
        for (int i : array) {
            System.out.println("ayyay is :"+i);
        }
    }
}
