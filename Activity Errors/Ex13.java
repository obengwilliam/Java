public class Ex13{


	public static void main(String[] args) {

		int no1 = 4;
		int no2 = 3;

		System.out.println("The result of the first calculation is "+ multiply(no1, no2));

		no1 = 7;
		no2 = 8;

		System.out.println("The result of the second calculation is "+ multiply(no1, no2));


	}


	static int multiply(int number1, int number2)
	{

		return number1 * number2;
	}

}