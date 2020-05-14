package by.htp.branchings.logic;

public class Task8 {
	public static void task() {
 //Составить программу нахождения наименьшего из квадратов двух чисел а и b.
		
		double a, b, min;
		
		a = 7;
		b = 9;
		
		a = Math.pow(a, 2);
		b = Math.pow(b, 2);
		
		min = Math.min(a, b);
		
		System.out.print(min);
	
	}
}
