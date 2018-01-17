import java.util.Scanner;

public class compute_area {
	public static void main(String[] args) {
		System.out.println("Compute radius and area of a cyclinder:" +
	"\n" +"Enter the radius: ");
		Scanner keyboard = new Scanner(System.in);
		double radius = keyboard.nextDouble();
		System.out.println("Enter Length: ");
		double length = keyboard.nextDouble();
		double Area = radius * radius * 3.1415;
		System.out.println("The area is: " + (Area) + "\n" +
				"and the volume is: " + (Area * length));
	}

}
