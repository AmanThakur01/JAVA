/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first_class;


public class array1 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.print(arr.getClass().getSimpleName());
        
        //2d array
        //int [][] darr = new int[10][10];
        int darr[][]={
            {1,2,3},{4,5,6},{7,8,9}
        };
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(darr[i][j]+" ");
//            }
//        }
        for (int[] i : darr) {
            for (int j : i) {
                System.out.print(" "+j);
            }
        }
        
//jacked array
        /*
just change the value under array it work as it is .
*/
    }
}
