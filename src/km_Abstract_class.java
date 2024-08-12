import java.util.Scanner;

abstract class shape{
 abstract double calculate_Area();
 abstract double calc_perimeter();

 abstract double calculateArea();

 abstract double calculatePerimeter();
}
class circle implements circlee {
 private double r;

 public circle (double r){
  this.r =r;
 }
 @Override
 public double calculate_Area(){
  return Math.PI*r*r;
 }
 @Override
 public double calc_perimeter(){
  return 2*Math.PI*r;
 }
}
class Triangle extends shape {
 private double side1, side2, side3;

 public Triangle(double side1, double side2, double side3) {
  this.side1 = side1;
  this.side2 = side2;
  this.side3 = side3;
 }

 @Override
 double calculate_Area() {
  return 0;
 }

 @Override
 double calc_perimeter() {
  return 0;
 }

 @Override
 double calculateArea() {
  double s = (side1 + side2 + side3) / 2;
  return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 }

 @Override
 double calculatePerimeter() {
  return side1 + side2 + side3;
 }
}
public class km_Abstract_class {
 public static void main(String[] args) {
  System.out.println("Abstract Class ");
  Scanner scanner =new Scanner(System.in);

  System.out.println("Enter the radius of the circle: ");
  double radius = scanner.nextDouble();
 circle circle = new circle(65);

  System.out.print("Enter the lengths of the three sides of the triangle: ");
  double side1 = scanner.nextDouble();
  double side2 = scanner.nextDouble();
  double side3 = scanner.nextDouble();
  Triangle triangle = new Triangle(side1, side2, side3);

  // Calculate and display area and perimeter for both shapes
  System.out.println("Circle - Area: " + circle.calculate_Area() + ", Perimeter: " + circle.calc_perimeter());
  System.out.println("Triangle - Area: " + triangle.calc_perimeter() + ", Perimeter: " + triangle.calculate_Area());

  scanner.close();
 }
 }

