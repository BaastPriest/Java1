package javaapplication3;

public class JavaApplication3 
{
    public static void main(String[] args) 
    {
        
        String strl = new String("Hello"); //"Hello";
        //"Hello" + ' ' + "World!" + '!'
        
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(' ');
        sb.append("World");
        sb.append('!');
        
        System.out.println(sb);
    } 
}
