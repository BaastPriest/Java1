package javaapplication6;

public class JavaApplication6 
{
    public static void main(String[] args) 
    {
        Test t1 = new Test();
        t1.setX(-101);
        System.out.println(t1.getX());
    }
    
}   
    class Test 
        {
            private int x; 

            public void setX(int x)
            {
                if(x < 0)x = -x;
               this.x = x;
            }

            public int getX() 
            {
           return x;
            }     
        }
    


