import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double length;
        double width;
        double radius;
        double a;
        double b;
        double c;

        System.out.println("Enter length of rectangle (positive integer): ");
        length = scanner.nextDouble();
        System.out.println("Enter width of rectangle (positive integer): ");
        width = scanner.nextDouble();
        System.out.println("Now enter the radius of the circle (positive integer): ");
        radius = scanner.nextDouble();
        System.out.println("Enter side A of triangle (positive integer): ");
        a = scanner.nextDouble();
        System.out.println("Enter side B of triangle (positive integer): ");
        b = scanner.nextDouble();
        System.out.println("Enter side C of triangle (positive integer): ");
        c = scanner.nextDouble();

        double rectperimeter = (length + width)*2;
        double rectanglearea = width*length;
        double circumference = 2*3.14*radius;
        double circlearea = 3.14*(radius*radius);
        double triperimeter = a + b + c;
        double s = (a+b+c)/2;
        double trianglearea = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area of rectangle: " + rectanglearea);
        System.out.println("Area of circle: " + circlearea);
        System.out.println("Perimeter of rectangle: " + rectperimeter);
        System.out.println("Circumference of circle: " + circumference);
        System.out.println("Area of triangle: " + trianglearea);
        System.out.println("Perimeter of triangle: " + triperimeter);


        double spherer;
        double h;
        double d;
        double w;
        double cylr;
        double cylh;

        System.out.println("Enter the radius of the sphere: ");
        spherer = scanner.nextDouble();
        System.out.println("Enter the diameter of the rectangular prism: ");
        d = scanner.nextDouble();
        System.out.println("Enter the height of the rectangular prism: ");
        h = scanner.nextDouble();
        System.out.println("Enter the width of the rectangular prism: ");
        w = scanner.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        cylh = scanner.nextDouble();
        System.out.println("Enter the radius of the cylinder: ");
        cylr = scanner.nextDouble();

        double surfacesphere = 4*3.14*spherer*spherer;
        double volumesphere = 4*3.14*(spherer*spherer*spherer)/3;
        double surfacerect = 2 * ((h*d)+(h*w)+(d*w));
        double volumerect = h*d*w;
        double surfacecylinder = (2*3.14*cylr*cylh) + (2*3.14*cylr*cylr);
        double volumecylinder = 3.14*cylr*cylr*cylh;

        System.out.println("The surface area of the sphere is: " + surfacesphere);
        System.out.println("The volume of the sphere is: " + volumesphere);
        System.out.println("The surface area of the rectangular prism is: " + surfacerect);
        System.out.println("The volume of the rectangular prism is: " + volumerect);
        System.out.println("The surface area of the cylinder is: " + surfacecylinder);
        System.out.println("The volume of the cylinder is: " + volumecylinder);






    }


    }


