package javaapplication1; 

import java.util.Arrays;

public class JavaApplication1 {

    public static void main(String[] args) {
        
        System.out.printf("Hello World!\n");
        System.out.println("Hello World!");
        
        int a =101;
        System.out.println("a = " + a);
        
        a+=2;
        System.out.println("a = " + a);
        
        float b;
        b = (float) (1. / 0.);
        System.out.println("a = " + b);
        
        if(a < b) System.out.println("ok");
        
        int []m = {2,1,3,5,4};
        Arrays.sort(m);
        
        System.out.println(m);
        
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
      
        for(int mi : m){
            System.out.println(mi);
        }
        
        
    }
    
}
