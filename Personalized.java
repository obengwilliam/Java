import java.util.Scanner;


public class Personalized

{

	

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);


		System.out.println("Please Enter your name:");
		String name=inp.nextLine();

		System.out.println("Please Enter your age:");
        int age=inp.nextInt();



		System.out.println("Please Enter your height:");
		double  height=inp.nextDouble();

		String heights=Double.toString(height);

		System.out.println("Hello " + name + "."+" So you are " + age + " years old and your height is " + heights+" ." );
	}
}