//ссылки
package javaapplication9;


public class JavaApplication9 {

    public static void main(String[] args) {
        
        String str1 = "Hello";
        String str2 = new String("Hello");
        
        if(str1.equals(str2)) System.out.println("OK");
        //equals сравнивает содержимое данных, а не ссылки
    }
    
}
