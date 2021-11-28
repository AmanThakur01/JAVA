package first_class;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author aman
 */
public class threadings {

    public static void main(String[] args) {
        Abc obj = new Abc();
        Abc2 obj2 = new Abc2();
        obj.start();
        obj2.start();
//        Runnable r = () -> {
//            for (int i = 0; i < 5; i++) {
//                System.out.println("hey");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(Abc.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        };
//Thread t = 
//annonymous object when only use once a time
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hey");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Abc.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
//        t.start();

    }
}

class Abc extends Thread {

    public void show() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hii");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Abc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void run() {
        show();

    }
}

class Abc2 extends Thread {

    public void show() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Abc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void run() {
        show();

    }
}
