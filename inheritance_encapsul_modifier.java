/*
 * java support only multi-level inharitance
 *  * polimorphysim is same name function but different parameters
 */
package first_class;

/**
 *
 * @author aman
 */
class A {

    private int a;//only class specific
    protected int b;//class and child class
    public int c = 0;//for all class

    public void show() {
        System.out.println("this is main show");
    }
}

class B extends A implements Cloneable {

    public void show() {
        System.out.println("this is class B show");
    }
    public int c = 1;

    public int getB() {//this is called Enscapsulation
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

public class inheritance_encapsul_modifier implements Cloneable {

    public static void main(String[] args) throws CloneNotSupportedException {

        A obja = new A();
        B objb = new B();
        objb.setB(12);
        System.out.println("c=" + objb.c);
        B k = (B) objb.clone();
        

    }

}
