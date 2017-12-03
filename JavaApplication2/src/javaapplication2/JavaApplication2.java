package javaapplication2;

public class JavaApplication2 {

    public static void main(String[] args) {
       
        int a = sum(1,2);
        System.out.println(a);
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4));
    }

//    private static int sum(int a, int b) {
//        return a + b;
//    }
//    private static int sum(int a, int b, int c){
//        return a + b + c;
//    }
    private static int sum(int ... x){
        int s = 0;
        for (int tmp : x) s += tmp;
        return s;
    }
}
