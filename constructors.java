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

class school{
    int i=12;
    school(){
        System.out.println("this is constructor1");
    }
    school(int j){
        System.out.println("this is constructor2 i=");
    }
}
public class constructors {
    public static void main(String[] args) {
        school obj = new school();
        obj.i=10;
    }
}
