package udemy;

public class FizzBuzzExample {

	public static void main(String args[]) {

		for (int i = 1; i <= 100; i++) {

			System.out.println("Number: " + i + ", " + FizzBuzz(i));

		}

	}

	public static String FizzBuzz(int num) {

		String fizz = (num % 3 == 0) ? "Fizz" : "";

		String buzz = (num % 5 == 0) ? "Buzz" : "";

		return fizz + buzz;

	}

}
