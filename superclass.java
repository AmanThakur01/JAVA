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

class A2{
    A2(){
        System.out.println("default A");
    }
    A2(int i){
        System.out.println("const i A");
    }
}
class Aa extends A2{
    int j =0;
    Aa(){
        System.out.println("default Aa");
    }
    Aa(int i){
        super(i);
        System.out.println("const i Aa");
    }
}

class c extends Aa {
    int j=1;
    public void show(){
        System.out.println("j="+super.j);
    }
}

public class superclass {
    public static void main(String[] args) {
        int i =0;
//        Aa obj = new Aa(i);
        c ob = new c();
        ob.show();
    }
}
