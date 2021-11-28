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
public class exception_handling {

    public static void main(String[] args) throws Exception{
        int i = 0;
        int j = 1;
        int k = 0;
        
        try {
            throw new myException("my exception called by me");
//            k = j/i;
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception:" + e);
        }
        catch (Exception e) {
            System.out.println("Exception:" + e);
        }
        finally{
            
            System.out.println("this is finally block");
        }
        throw new ArithmeticException();
    }
}
class myException extends Exception{
        public myException(String msg){
            super(msg);
        }
    }
