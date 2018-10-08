package calc;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Pierwsza liczba");
		double dblValue1 = Double.parseDouble(in.next());
		System.out.println("Druga liczba");
		double dblValue2 = Double.parseDouble(in.next());
		//double dblValue = in.nextDouble();
		in.close();
		
		System.out.printf("iloczyn=%8.2f\n", dblValue1*dblValue2);
		

	}

}
