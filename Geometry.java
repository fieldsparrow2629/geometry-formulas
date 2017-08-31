
/**
 * Write a description of class Geometry here.
 * 
 * @author (Erik Blom) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    
    /**
     * returns the area of a triangle given the base and height
     * 
     * @param base base of triangle
     * @param height height of triangle
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    /**
     * returns the area of a parralelogram
     * 
     * @param base base of parallelogram
     * @param height height of parrallelogram
     */
    public static double parallelogram(double base, double height)
    {
        double area = base * height;
        
        return area;
    }
    
    /**
     * returns the area of a trapezoid
     * 
     * @param a one side of the parrallelogram
     * @param b another side of the parrallelogram
     * @param c third side of the parrallelogram
     */
    public static double trap(double a, double b, double h)
    {
        double area = 1.0/2.0 * h * (a + b);
        
        return area;
    }
    
    /**
     * return the volume of the rectangular prism
     * 
     * @param length length of prism
     * @param width width of prism
     * @param height height of prism
     */
    public static double rect_prism_volume(double length, double widht, double height)
    {
        double volume = length * widht * height;
        
        return volume;
    }
    
    /**
     * returns the volume of the cone
     * 
     * @param radius the radius of the base of the cone
     * @param height height of the cone
     */
    public static double cone(double radius, double height)
    {
        double volume = Math.PI * Math.pow(radius,2)*height*1.0/3.0;
        
        return volume;
    }
    
    /**
     * returns the surface area of a rectangular prism
     * 
     * @param base base of prims
     * @param width width of prism
     * @param height height of prism
     */
    public static double rect_prism_area(double base, double width, double height)
    {
        double area = 6 * base * height * width;
        
        return area;
    }
    
    /**
     * returns the hypotenuse of a triangle
     * 
     * @param leg1 length of one leg
     * @param leg2 length of second leg
     */
    public static double hypotenuse(double leg1, double leg2)
    {
        double hypo = Math.sqrt(Math.pow(leg1,2) * Math.pow(leg2,2));
        
        return hypo;
    }
    
    /**
     * returns the distance between two points
     * 
     * @param x1 x coordinate of first point
     * @param x2 x coordinate of second point
     * @param y1 y coordinate of first point
     * @param y2 y coordinate of second point
     */
    public static double distance( double x1, double x2, double y1, double y2)
    {
        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        
        return distance;
        
    }
    
    /**
     * return the area of a rectangle
     * 
     * @param length length of one side
     * @param width width of the second side
     */
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * returns the slope of a line given two points
     * 
     * @param x1 first x coordinate
     * @param x2 second x coordinate
     * @param y1 frist y coordinate
     * @param y2 second y coordinate
     */
    public static double slope(double x1, double x2, double y1, double y2)
    {
        double slope = (y2 -y1)/(x2 - x1);
        
        return slope;
    }
    
    /**
     * returns the volume of a sphere
     * 
     * @param radius radius of the volume
     */
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * returns the area of a triangle given only 3 sides
     * 
     * @param a one side of triangle
     * @param b another side
     * @param c third side
     */
    public static double herons(double a, double b, double c)
    {
        double p = (a+b+c)/2.0;
        
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        
        return area;
    }
    
    /**
     * takes all the geometry functions, inputs the parameters, and returns values
     */
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        double parallel = parallelogram(5.0,4.0);
        double trap = trap(3.4, 6.6, 5.0);
        double rect_prism_volume = rect_prism_volume(5.5, 4.9, 1.2);
        double cone = cone(5.5, 10.2);
        double rect_prism_area = rect_prism_area(4.0, 5.0,8.7);
        double hypotenuse = hypotenuse(5.6, 5.9);
        double distance = distance(5.0, 4.0, 4.3, 3.1);
        double slope = slope(5.6, 6.7, 1.2, 4.2);
        double sphereVolume = sphereVolume(12.5);
        double herons = herons(12.0, 14.0, 16.0);
        
        
        
        System.out.println(ta1);
        System.out.println(ta2);
        System.out.println(parallel);
        System.out.println(trap);
        System.out.println(rect_prism_volume);
        System.out.println(cone);
        System.out.println(rect_prism_area);
        System.out.println(hypotenuse);
        System.out.println(distance);
        System.out.println(slope);
        System.out.println(sphereVolume);
        System.out.println(herons);
        
        double ra1 = rectangleArea(5.2, 9.3);
        System.out.println(ra1);
    }
}
