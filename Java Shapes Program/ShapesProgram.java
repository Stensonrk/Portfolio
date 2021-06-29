/* Robert Stenson
 * June 28, 2020
 * main.java
 * Main class for the Shapes program
 */

package Project1;

//Imports to read input and to get and format date and time
import java.util.Scanner;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class ShapesProgram {

	public static void main(String[] args) {
		
		//Formats Date and Time
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			
		//Opens scanner to read input
		Scanner sc = new Scanner(System.in);
		
		//variable to compare input amongst options
		char choice;
		
		//Prints welcome message
		System.out.println("Welcome to the Java Shapes Program!");
		
		//Do Loop continues to repeat menu until program is exited
		do {
			System.out.println("Please choose an option from the menu below:");
			System.out.println("1) Construct a Circle");
			System.out.println("2) Construct a Rectangle");
			System.out.println("3) Construct a Square");
			System.out.println("4) Construct a Triangle");
			System.out.println("5) Construct a Sphere");
			System.out.println("6) Construct a Cube");
			System.out.println("7) Construct a Cone");
			System.out.println("8) Construct a Cylinder");
			System.out.println("9) Construct a Torus");
			System.out.println("10) Exit Program");
			int ch = sc.nextInt();
			
			//Switch Statement executes proper action based on input
			switch(ch) {
			//Circle
			case 1:
				System.out.println("You have selected Circle.");
				System.out.println("Please enter the Radius: ");
				int circleRadius = sc.nextInt();
				Circle circle = new Circle(circleRadius);
				System.out.println("The area of the Circle is: " + circle.getArea());
				break;
			//Rectangle
			case 2:
				System.out.println("You have selected Rectangle.");
				System.out.println("Please enter the Length: ");
				int rectLength = sc.nextInt();
				System.out.println("Please enter the Width: ");
				int rectWidth = sc.nextInt();
				Rectangle rectangle = new Rectangle(rectLength, rectWidth);
				System.out.println("The area of the Rectangle is: " + rectangle.getArea());
				break;
			//Square
			case 3:
				System.out.println("You have selected Square.");
				System.out.println("Please enter the Side Length: ");
				int squareSide = sc.nextInt();
				Square square = new Square(squareSide);
				System.out.println("The area of the Square is: " + square.getArea());
				break;
			//Triangle
			case 4:
				System.out.println("You have selected Triangle.");
				System.out.println("Please enter the Base: ");
				int triBase = sc.nextInt();
				System.out.println("Please enter the Height: ");
				int triHeight = sc.nextInt();
				Triangle triangle = new Triangle(triBase, triHeight);
				System.out.println("The area of the Triangle is: " + triangle.getArea());
				break;
			//Sphere
			case 5:
				System.out.println("You have selected Sphere.");
				System.out.println("Please enter the Radius: ");
				int sphereRadius = sc.nextInt();
				Sphere sphere = new Sphere(sphereRadius);
				System.out.println("The Volume of the Sphere is: " + sphere.getVolume());
				break;
			//Cube
			case 6:
				System.out.println("You have selected Cube.");
				System.out.println("Please enter the Side Length: ");
				int cubeSide = sc.nextInt();
				Cube cube = new Cube(cubeSide);
				System.out.println("The Volume of the Cube is: " + cube.getVolume());
				break;
			//Cone
			case 7:
				System.out.println("You have selected Cone.");
				System.out.println("Please enter the Radius: ");
				int coneRadius = sc.nextInt();
				System.out.println("Please enter the Height: ");
				int coneHeight = sc.nextInt();
				Cone cone = new Cone(coneRadius, coneHeight);
				System.out.println("The Volume of the Cone is: " + cone.getVolume());
				break;
			//Cylinder
			case 8:
				System.out.println("You have selected Cylinder.");
				System.out.println("Please enter the Radius: ");
				int cylRadius = sc.nextInt();
				System.out.println("Please enter the Height: ");
				int cylHeight = sc.nextInt();
				Cylinder cylinder = new Cylinder(cylRadius, cylHeight);
				System.out.println("The Volume of the Sphere is: " + cylinder.getVolume());
				break;
			//Torus
			case 9:
				System.out.println("You have selected Torus. ");
				System.out.println("Please enter the Major Radius: ");
				int majorRadius = sc.nextInt();
				System.out.println("Please enter the Minor Radius: ");
				int minorRadius = sc.nextInt();
				Torus torus = new Torus(majorRadius, minorRadius);
				System.out.println("The Volume of the Torus is: " + torus.getVolume());
				break;
			//Exit
			case 10:
				System.out.println("Thank you for using the Java Shapes Program.");
				//Gets date and time...sets it to variable now
				LocalDateTime now = LocalDateTime.now();
				System.out.println("Current time and date: " + dtf.format(now));
				sc.close();
				System.exit(0);
			}
			//Repeats after cases 1-9 asking to repeat program or exit
			System.out.println("Would you like to continue? (Y or N)");
			choice = sc.next().charAt(0);
		//Loops from beginning of Do when true
		} while(choice == 'Y');
		
		//Exit Statement
		sc.close();
		System.out.println("Thank you for using the Java Shapes Program.");
		//Gets date and time...sets it to variable now
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Current time and date: " + dtf.format(now));
		System.exit(0);;

	}

}
