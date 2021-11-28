/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first_class;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author aman
 */
public class readInSystem {
    public static void main(String[] args) throws IOException{
        int i;
//        i= System.in.read();
        

//buffer reader
         BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
         String name = reader.readLine();
        

//console
// it work on console
        String sname = System.console().readLine();
    }
}
