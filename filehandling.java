/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_class;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * @author aman
 */
public class filehandling {

    public static void main(String[] args) throws Exception {
        File f = new File("demo.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("this is demo of file handling");
        
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println("file :" + str);

        // file having key value pair
        Properties p = new Properties();
        OutputStream os = new FileOutputStream("dataConfig.properties");
        p.setProperty("url", "https://youtube/");
        p.setProperty("uname", "aman thakur");
        p.setProperty("pws", "password");
        
        p.store(os, "done");

        //propertie file input
        InputStream is = new FileInputStream("dataConfig.properties");
        p.load(is);
        System.out.println(p.getProperty("url"));
        p.list(System.out);
    }
}
