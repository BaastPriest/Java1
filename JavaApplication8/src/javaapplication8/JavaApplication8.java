package javaapplication8;

public class JavaApplication8 {

    public static void main(String[] args) {
        Point2D point1 = new Point2D(2,3);
        Point2D point2 = new Point2D();
        
        point2.setX(5);
        point2.setY(-2);
        
        System.out.println(point1.length());
        System.out.println(point2.length());
        
        System.out.println(point1.distanceTo(point2));
        
        System.out.println(Points2D.distanceBetween(point1,
                Points2D.CENTER.getX(), Points2D.CENTER.getY()));
        
        Point2D point3 = new Point2D(2,3);
        if(point1.equals(point3)) System.out.println("OK");
        
        
        Point2D []points = {point1, point2,point3};
        for (Point2D point : points) {
            System.out.println(point);
        }
    }
}
