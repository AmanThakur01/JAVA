/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_class;
import java.util.Scanner;
/**
 *
 * @author aman
 */
public class recurtion {
    static int fact(int n){
        if (n==1 || n==0) {
            return 1;
        }
        else{
            return n*(fact(n-1));
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Enter integer for factorial : ");
        Scanner scan = new Scanner(System.in);
        int factVal = scan.nextByte();
        System.out.println("Factorial is "+fact(factVal));
    }
}
