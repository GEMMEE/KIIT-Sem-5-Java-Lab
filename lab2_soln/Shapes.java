/**
 * Q3. WAP to define variables for all the shapes given below.  
 * Define separate operations for different figures.
 *   a) set required data,
 *   b) calculate area of a shape and
 *   c) display the details of that shape.
 * The geometric shapes are- a) circle, b) triangle, c) rectangle.
 * The output should be
 *      The area of Circle with radius is
 *      The area of Triangle with base and height is
 *      The area of Rectangle with length and breadth is
 *
 * @author: Gamachu
 * @date:
 */
 
 class Shapes {
 	public static void main(String [] args) {
 		double radius, areaOfCircle;
 		double base, height, areaOfTriangle;
 		double length, breadth, areaOfRectangle;
 		
 		java.util.Scanner scan = new java.util.Scanner(System.in);  // yeah! you can do this too if u hate import :-)
 		
 		System.out.println("Enter the radius of your circle: ");
 		radius = scan.nextDouble();
 		areaOfCircle = Math.PI * radius * radius;    // A = PI * r squared for a circle
 		System.out.println("Area of the circle is " + areaOfCircle);
 		
 		System.out.println("Enter the base of your triangle: ");
 		base = scan.nextDouble();
 		System.out.println("Enter the height of your trangle: ");
 		height = scan.nextDouble();
 		areaOfTriangle = 0.5 * base * height;    // A = (1/2)*b*h  for a triangle
 		System.out.println("Area of the triangle is " + areaOfTriangle);
 		
 		System.out.println("Enter the length of your rectangle: ");
 		length = scan.nextDouble();
 		System.out.println("Enter the breadth of your rectangle: ");
 		breadth = scan.nextDouble();
 		areaOfRectangle = length * breadth;   // A = l * w  for a rectangle
 		System.out.println("Area of the rectangle is " + areaOfRectangle);
 	}
 }
		
