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
abstract class Ab{
        public void f1(){
            System.out.println("feature 1");
        }
        public abstract void f2();
        public abstract void f3();
        }

abstract class Bb extends Ab{
    public void f2(){
        System.out.println("feature 2");
    }
}
class C1 extends Bb{
    @Override
    public void f3(){
        System.out.println("feature 3");
    }
}
public class anonymus_abstract {
    public static void main(String[] args) {
        C1 on =new C1();
        on.f1();
        on.f2();
      
        new C1().f3();//annonymous object
    }
            
}
