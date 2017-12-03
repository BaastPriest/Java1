package javaapplication7;

public class JavaApplication7 {

    public static void main(String[] args) {
        
    }
    
}

class AP
{
    private int base, step;
    
    public void setup(int b, int s) {
        base=b; step=s;
    }
    
    public int getAn(int n){
        return base+n*step;
    }
}
