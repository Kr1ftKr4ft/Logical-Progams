import java.util.Random;
import java.util.Scanner;

public class View {

	public final String ERROR = "Error in the App!";
	private Scanner input;

	// Options menu
	public int menu() {
		System.out.println("Program by Giovanni D'Andrea  -john4s  V1.1 23/05/2019");		//...
		System.out.println("1)Binary to decimal");
		System.out.println("2)Decimal to binary");
		System.out.println("3)Sum");
		System.out.println("4)Random number array");
		return readInt("What do you want to do?");
	}

	// Control the type Integer
	public int readInt(String s) {
		input = new Scanner(System.in);
		int num = 0;
		System.out.println(s);
		boolean flag;
		do {
			flag = false;
			try {
				num = Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				System.out.println(ERROR);
				flag = true;
			}
		} while (flag);
		return num;
	}

	// Control a string of number if there are a 0 and 1
	public String binaryControl(String s) {
		System.out.println(s);
		String number;
		boolean flag;

		do {
			flag = false;
			number = input.nextLine();
			for (int i = 0; i < number.length(); i++) {
				if (number.charAt(i) != '0' && number.charAt(i) != '1') {
					System.out.println(ERROR);
					flag = true;
				}
			}
		} while (flag);
		return number;
	}

	// Convert a decimal number to binary number
	public void binaryConversion(String number) {
		int j = 0;
		System.out.println("Bin: " + number);
		int result = 0;
		for (int i = number.length() - 1; i >= 0; i--, j++) {
			if (number.charAt(i) == '1') {
				result += Math.pow(2, j);
			}
		}
		System.out.println("Num: " + result);
	}

	// Convert a binary number to decimal number
	public void decimalConversion(int number) {
				String num = Integer.toBinaryString(number);
				System.out.println("Bin: " + "[" + num + "]");
	}

	// sum between two numbers passed from
	public void sum(int num1, int num2) {
		System.out.println("First number: " + num1 + ", Second number: " + num2);
		System.out.println("The sum is: " + (num1+num2)); //you could've just put (num1+num2) btw
	}

	// insert a random number(0 - 100) in an array of 10 positions
	public void randomArrayNum() {		//why does the function return an int? Johnny: "It doesn't."
		Random random = new Random();
		int i;
		int pos = 0;
		int num[] = new int[10];
		int max = num[0];
		for (i = 0; i < num.length; i++) {
			num[i] = random.nextInt(100);
			if (num[i] > max) {
				max = num[i];
				pos = i;
			}
			System.out.print(num[i] + ",");
		}
		System.out.println("\nMax number: " + max + ", in position: " + pos);
	}

}
