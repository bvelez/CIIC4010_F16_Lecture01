import java.util.Scanner;

class MainClass {

	public static void main(String[] args) {

		double PI;
		PI = Math.PI;
		
		//double circunsference=0;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		double radius = in.nextDouble();

		double area = PI * radius * radius;
		System.out.println("Area of circle = " + area);

		in.close();
	}
}