/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_class;
//import java.lang.Math;
import java.util.Scanner;
/**
 * @author aman
 */
public class palondrome {
    public static void main(String[] args) {
        System.out.print("Enter a number to check plaondrome : ");
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();
        int count=0,digit=val,revDigit=0;
        int [] reminder=new int[9];
        while(true){
            if(digit==0){
                break;
            }
            else{
                reminder[count]=digit%10;
//                System.out.println("reminder = "+reminder[count]);
                if (count==0) {
                    revDigit=reminder[0];
                    count++;
                    digit = digit/10;
                    continue;
                }
                revDigit=(int) (reminder[count]+(10*revDigit));
            }
            count++;
            digit = digit/10;
//            System.out.println("digit = "+digit);
//            System.out.println("count : "+count);
//            System.out.println("revdigit = "+revDigit);
        }
        if (revDigit==val){
            System.out.println("its palondrome...");
        }
        else{
            System.out.println("it is not a palondrome");
        }
        
    }
}
