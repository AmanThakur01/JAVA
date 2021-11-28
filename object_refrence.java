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

class A1
{
    public void A(){
        System.out.println("class A1");
        
    }
    public String toString(){
        return "here u can print all the members or class status data of object";
    }
}
class B1{
    public void B(){
        System.out.println("class B1");
    }
}
public class object_refrence {
    public static void main(String[] args) throws Exception {
//        A1 a =new A1();
      //refrence=object/instantiation
//        B1 b=new B1();
        

//        A1 o = new B1();//refrence of a=o
//        System.out.println(a); //by using this toString method u can print object
        
      // call class without object
      
      Class c = Class.forName("first_class.A1");
        System.out.println("class : "+c.isInterface());//c.getSuperClass,getClass,etc.
    }
}
