/*
 * Author: john4s
 * Version: V1.1
 * Logical exercise for dummies(Me too)
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View view = new View();
		boolean flag = false;

		do {
			flag = true;
			switch (view.menu()) {			//switch(view.menu()) {
			case 1:
				String num = view.binaryControl("Insert a binary number: ");
				view.binaryConversion(num);
				break;
			case 2:
				int num2 = view.readInt("Insert a decimal number: ");
				view.decimalConversion(num2);
				break;
			case 3:
				int numa = view.readInt("Insert first number: ");
				int numb = view.readInt("Insert second number: ");
				view.sum(numa, numb);
				break;
			case 4:
				view.randomArrayNum();
				break;
			}
		} while (flag);



	}

}
