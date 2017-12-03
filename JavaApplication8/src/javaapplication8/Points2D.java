package javaapplication8;

public class Points2D {
    
    public final static  Point2D CENTER =  new Point2D();
    
     public static double distanceBetween(Point2D point, int x, int y) {
         return Math.sqrt((x-point.getX())*(x-point.getX()) +
                 (y - point.getY())*(y - point.getY()));
     }
    
}
