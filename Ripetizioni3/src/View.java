import java.util.Scanner;

public class View {

	public final String ERROR = "Error in the App!";
	private Scanner input;

	public int menu() {
		System.out.println("Program by Giovanni D'Andrea  -kr1ftkr4ft  V1.0");
		System.out.println("1)Binary to decimal");
		System.out.println("2)Decimal to binary");
		System.out.println("3)Decimale a binario");
		return readInt("What do you want to do?");
	}

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
	
	
	public void decimalConversion(int number) {
		boolean flag;
		do {
			flag = false;
			try {
				String num = Integer.toBinaryString(number);
				System.out.println("Bin: " + "["+num+"]");
			} catch (NumberFormatException e) {
				System.out.println(ERROR);
				flag = true;
			}
		} while (flag);
	}
	
}
