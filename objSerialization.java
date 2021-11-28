/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author aman
 */
public class objSerialization {
    public static void main(String[] args) throws Exception{
        Save obj = new Save();
        obj.i=5;
        
        File f = new File("demo.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream dis = new ObjectInputStream(fis);
        Save readObj = (Save)dis.readObject();
        System.out.println("val of i :"+readObj.i);
        
    }
}
class Save implements Serializable{
    int i;
}