package com.hussaincode.javaIntro;

import java.util.Scanner;

public class ConditionalLoop03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println(subtractProductAndSum(236));


//   1. Area Of Circle Java Program
        /*System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();
        double area = 3.146*radius*radius;
        System.out.println("Area of circle is "+area);*/

//    2. Area Of triangle Java Program
       /* System.out.print("Enter height of trianle: ");
        double height = sc.nextDouble();
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        double areOfTriangle=(height*base)/2;
        System.out.print("Area of Trianle is "+areOfTriangle);*/

//    3.Area Of Rectangle Program
       /* System.out.print("Enter the length of rectangle");
        double length= sc.nextDouble();
        System.out.print("Enter the breadth of rectangle");
        double breadth =sc.nextDouble();
        double areOfRectangle=length*breadth;
        System.out.println("Area of Rectangle is "+areOfRectangle);*/

//     4.Area Of Isosceles Triangle
       /* System.out.print("Enter height of trianle: ");
        double height = sc.nextDouble();
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        double areOfTriangle=(height*base)/2;
        System.out.print("Area of Isosceles Trianle is "+areOfTriangle);*/

//      5.Area Of Parallelogram
       /* System.out.print("Enter the base and height of the parellogram : ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double area = b * h;
        System.out.println("Area of parellogram is " + area);*/

//      6. Area Of Rhombus
    /*    System.out.println("Enter the length of one diagonal of the rhombus: ");
        double d1 = sc.nextDouble();
        System.out.println("Enter the length of the other diagonal of the rhombus: ");
        double d2 = sc.nextDouble();
        double area = (d1*d2)/2;
        System.out.println("The area of the rhombus is: " + area);*/

//      7. Area Of Equilateral Triangle
       /* System.out.print("Enter the length of the side of the equilateral triangle: ");
        double side = sc.nextDouble();
        double area = (Math.sqrt(3)/4)*side*side;
        System.out.println("The area of the equilateral triangle is " + area);*/

//      8. Perimeter Of Circle
       /* System.out.println("Enter the radius of the circle");
        double radius = sc.nextDouble();
        System.out.println("The perimeter of the circle is " + (2 * Math.PI * radius));*/

//      9.Perimeter Of Equilateral Triangle
      /*  System.out.print("Enter the length of a side of equilateral triangle: ");
        double side = sc.nextDouble();
        System.out.println("The perimeter of the equilateral triangle is " + (3 * side) + ".");*/

//      10.Perimeter Of Parallelogram
       /* System.out.println("enter the base of Parallelogram: ");
        float base= sc.nextFloat();
        System.out.println("enter the height of Parallelogram: ");
        float height= sc.nextFloat();
        System.out.println("Perimeter Of Parallelogram is: " +2*(base+height));*/

//      11.Perimeter Of Rectangle
       /* System.out.println("enter the lenght of rectangle: ");
        float rect_len = sc.nextFloat();
        System.out.println("enter the width of rectangle: ");
        float rect_wid = sc.nextFloat();
        System.out.println("Perimeter Of Rectangle is: " + 2*(rect_len + rect_wid));*/

//      12.Perimeter Of Square
       /* System.out.println("Enter the length of the side of the square: ");
        double side = sc.nextDouble();
        System.out.println("The perimeter of the square is " + (side * 4));*/

//      13.Perimeter Of Rhombus
     /*   System.out.println("enter the side of Rhombus: ");
        float side= sc.nextFloat();
        System.out.println("ans is: " + (side*4));*/

//       14.Volume Of Cone Java Program
      /*  System.out.println("Enter the radius of the cone: ");
        double radius = sc.nextDouble();
        System.out.println("Enter the height of the cone: ");
        double height = sc.nextDouble();
        double volume = (Math.PI * radius * radius) * height / 3;
        System.out.println("The volume of the cone is: " + volume);*/

//      15.Volume Of Prism
       /* System.out.println("Enter the length of the prism");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the prism");
        double width = sc.nextDouble();
        System.out.println("Enter the height of the prism");
        double height = sc.nextDouble();
        double volume = length * width * height;
        System.out.println("The volume of the prism is " + volume);*/

//      16.Volume Of Cylinder
       /* System.out.println("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        double height = sc.nextDouble();
        double volume = Math.PI * (radius * radius) * height;
        System.out.println("The volume of the cylinder is: " + volume);*/

//      17.Volume Of Sphere
       /* System.out.println("Enter the radius of sphere");
        double radius = sc.nextDouble();
        System.out.println("The volume of sphere is " + (4 * Math.PI * radius * radius * radius)/3);*/

//      18.Volume Of Pyramid
       /* System.out.println("Enter the height of the pyramid: ");
        double height = sc.nextInt();
        System.out.println("Enter the width of the pyramid: ");
        double width = sc.nextInt();
        System.out.println("Enter the length of the pyramid: ");
        double length = sc.nextInt();
        double volume = (height * width * length) / 3;
        System.out.println("The volume of the pyramid is: " + volume);*/

//      19.Curved Surface Area Of Cylinder
      /*  System.out.println("Enter the radius of the cylinder");
        double r = sc.nextDouble();
        System.out.println("Enter the height of the cylinder");
        double h= sc.nextDouble();
        double curvedSurfaceArea = 2*Math.PI*r*h;
        System.out.println("Curved Surface Area Of Cylinder is " + curvedSurfaceArea);*/

//      20.Total Surface Area Of Cube
      /*  System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();
        double area = 2 * Math.PI * radius * height;
        System.out.println("The surface area of the cylinder is " + area);*/

//       21.Fibonacci Series In Java Programs
       /* System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" "+b);
        for(int i = 0; i < n; i++){
            int temp = a+b;
            System.out.print(" " + temp);
            a = b;
            b = temp; }*/

//       22.Subtract the Product and Sum of Digits of an Integer (Leetcode 1281 )
       /* static int subtractProductAndSum(int n) {
            int prod=1;
            int sum=0;
            int subs;
            while(n>0){
                int digit=n%10;
                prod=prod*digit;
                sum=sum+digit;
                n=n/10;
            }
            subs=prod-sum;
            return subs;
        }*/

//     23.Input a number and print all the factors of that number (use loops).
      /*  System.out.print("Enter a number: ");
        int num =sc.nextInt();
        for (int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i+" is factor of "+num);
            }
        }*/

//    24.Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

      /*  int n;
        int sum=0;
        System.out.println("Enter number: ");
        do{
            n=sc.nextInt();
            sum+=n;
        }while(n!=0);
            System.out.println("sum "+sum);*/

//     25.Take integer inputs till the user enters 0 and print the largest number from all.
       /* System.out.println("Please enter numbers: " );
        int input;
        int large = 0;
        int counter = 0;
        int small = 0;
        while ((input = sc.nextInt()) != 0) {

            if (counter == 0)
                small = large = input;

            counter++;

            if (input > large)
                large = input;

            if (input < small)
                small = input;

        }
        System.out.println(large);*/
    }
}
