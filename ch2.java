/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aman
 */
//import java.util.Scanner;
public class ch2 {
    public static void main(String[] args) {
         System.out.println("hello world");
        int integers = 12;
        byte  byteValue = 19;
        short small = 35;
        long large = 34764723l;

        float desimal = 34544.34f;

        char character = 'a';

        boolean boll = true;
        String str = "this is string";
//        Scanner scan = new Scanner(System.in);
//        String st = scan.nextLine();
//        System.out.println(str+"  : this is str");
//        int a = scan.nextInt();
//        System.out.println("a = "+a);
        String lstr = str.toLowerCase();
        String ustr = str.toUpperCase();
        String trimstr = lstr.trim();
        System.out.println("trimstr"+trimstr);  /*remove front and back spaces*/
        System.out.println(ustr+"  : this is str");
        System.out.println(str.substring(1,7));
        System.out.println(str.replace('s','q'));
        System.out.println(str.startsWith("H"));
        System.out.println(str.endsWith("Ht"));
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf("in"));
        System.out.println(str.equals("this is string"));
        System.out.println(trimstr+"  : this is str");
        if (boll){
            System.out.println("this is if statment");
        }
        else{
            System.out.println("this is else statment");
        }
        
        
        while(boll!=true){
            System.out.println("never execute");
        }
        
        
        do{
            System.out.println("this is do statment");
        }while(boll!=true);
        
        
        for(int i=0;i<3;i++){
            System.out.println("this is for loop");
        }
        int a = 2;
        switch(a){
            case 2 -> System.out.println("this is 2");
            case 3 -> System.out.println("this is 3");
            default -> System.out.println("this is default");
        } 
//              for(int i = 0; true; i++) { System.out.println("Hello"); break; } 
    }

}

