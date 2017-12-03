package javaapplication8;

public class Point2D {
    
    private int x,y;
    private double length;
    
    static {
        System.out.println("Configuration... ");
        // тут можно подготовить к работе объекты 
    }

    public Point2D() {
        this(0,0); //1!!
//обязательно первой,т.к. происходит вызов конструктора ниже
    }
 
    public Point2D(int x, int y) {
        setX(x);
        setY(y);
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
        calcLength();
    }

    public void setY(int y) {
        this.y = y;
        calcLength();
    }
    
    public double length() {
        return length; //getter 
    }
    
    private void calcLength(){
        length = Math.sqrt(x*x + y*y);
    }
          
    
    public double distanceTo(Point2D rPoint){
        return Math.sqrt((x - rPoint.x)*(x-rPoint.x) +
                (y-rPoint.y)*(y-rPoint.y));
    }

    @Override //переопределение метода
    public boolean equals(Object obj) {
        Point2D p = (Point2D) obj;
        if((x==p.x) && (y==p.y)) return true;
        return false;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
  }  

