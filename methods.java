/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_class;

public class methods {
    static int sum(int x,int y){
        int z= x+y;
        return z;
    }
    int sub(int x,int y){
        int z= x-y;
        return z;
    }
    static int add(int x){
        int b = x+x;
        return b;
    }
    static int alladd(int ...arr){// this collec all argvar in array
        int res=0;
        for (int a:arr) {
            res +=arr[a];
        }
        return res;
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c =sum(a,b);
        System.out.println("sum = "+c);
        methods obj = new methods();
        int d = obj.sub(b,a);
        System.out.println("sub = "+d);
        System.out.println("sum = "+add(d));
        System.out.println("resulr : "+alladd(a,b,c,d));
    }
}
