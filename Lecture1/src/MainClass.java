import java.util.Scanner;


class MainClass {
	public static int MU = 0;
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double PI = 3.14, area, ci;
		
		System.out.println(MU);
		
		System.out.println("Enter radius of circle: ");
		double rad = in.nextDouble();
		
		area = Math.PI * rad * rad;
		System.out.println("Area of circle = " + area);

		ci = 2.0 * PI * rad;
		System.out.println("Circumference = " + ci);

		in.close();
	}
}