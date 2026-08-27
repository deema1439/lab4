import java.util.Scanner;

public class Main1 {

    public static void main (String[] args){
        Circle c1=new Circle(7.9);
        c1.setRadius(7.9);
        System.out.println(" The Redius is: "+c1.getRadius());
        System.out.println(" The Area For The Circle is : "+c1.calculateArea());
        System.out.println(" thw Circumference is : "+c1.calculateCircumference());
        System.out.println("____________________________________________________________");
        System.out.println("____________________________________________________________");
        System.out.println("____________________________________________________________");
        Rectangle r1=new Rectangle(8.0,5.0);
        r1.setWidth(5.0);
        System.out.println(" The width is: "+r1.getWidth());
        r1.setHeight(8.0);
        System.out.println(" The height is: "+r1.getHeight());
        System.out.println(" The Area of Rectangle: "+r1.calculateArea());
        System.out.println(" The Perimeter of Rectangle: "+r1.calculateCircumference());
        System.out.println("____________________________________________________________");
        System.out.println("____________________________________________________________");
        System.out.println("____________________________________________________________");
        Triangle t1=new Triangle(8.0,8.0);
        t1.setHeight(8.0);
        System.out.println(" The Height is : "+t1.getHeight());
        t1.setBase(8.0);
        System.out.println(" The base is : "+t1.getBase());
        System.out.println(" The Area of Triangle : "+t1.calculateArea());
        System.out.println(" The Perimeter of Triangle "+t1.calculateCircumference());
        System.out.println("____________________________________________________________");
        System.out.println("____________________________________________________________");
        System.out.println("____________________________________________________________");
        System.out.println("            Using Scanner s=new Scanner(System.in);                    ");
        System.out.println("____________________________________________________________");
        Scanner s=new Scanner(System.in);
        Circle c2=new Circle(5.7);
        System.out.print("enter Redius: ");
        double setR=s.nextDouble();
        c2.setRadius(setR);
        System.out.println(" The Redius is: "+c2.getRadius());
        System.out.println(" The Area For The Circle is : "+c2.calculateArea());
        System.out.println(" thw Circumference is : "+c2.calculateCircumference());
        System.out.println("____________________________________________________________");
        System.out.println("____________________________________________________________");
        System.out.println("____________________________________________________________");
        Rectangle r2=new Rectangle(8.0,5.0);
        System.out.println("enter the width for Rectangle: ");
        double setW=s.nextDouble();
        r2.setWidth(setW);
        System.out.println(" The width is: "+r2.getWidth());
        System.out.print(" enter the Height for Rectangle: : ");
        double setH=s.nextDouble();
        r2.setHeight(setH);
        System.out.println(" The height is: "+r2.getHeight());
        System.out.println(" The Area of Rectangle: "+r2.calculateArea());
        System.out.println(" The Perimeter of Rectangle: "+r2.calculateCircumference());
        System.out.println("____________________________________________________________");
        System.out.println("____________________________________________________________");
        System.out.println("____________________________________________________________");
        Triangle t2=new Triangle(8.0,8.0);
        System.out.println("enter the height for Triangle: ");
        double setH2=s.nextDouble();
        t2.setHeight(setH2);
        System.out.println(" The Height is : "+t2.getHeight());
        System.out.println("enter the base for Triangle: ");
        double setb=s.nextDouble();
        t2.setBase(setb);
        System.out.println(" The base is : "+t2.getBase());
        System.out.println(" The Area of Triangle : "+t2.calculateArea());
        System.out.println(" The Perimeter of Triangle "+t2.calculateCircumference());
        System.out.println("____________________________________________________________");
        System.out.println("____________________________________________________________");
        System.out.println("____________________________________________________________");




















































    }


































































}
