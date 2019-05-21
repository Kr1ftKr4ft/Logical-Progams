
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View view = new View();
		int scelta = view.menu();
		switch (scelta) {
		case 1:
			String num = view.binaryControl("Insert a binary number: ");
			view.binaryConversion(num);
			break;
		case 2:
			int num2 = view.readInt("Insert a decimal number: ");
			view.decimalConversion(num2);
			break;
		}
		
	}

}
