package by.htp.branchings.logic;

public class Task5 {
	public static void task() {
		// Составить программу: определения наименьшего из двух чисел а и b.

		int a, b, y;
		a=3;
		b=5;
		
		y = a;
		
		if(b<y) {y = b; System.out.print("наименьшее значение "+y);}
		else {y = a; System.out.print("наименьшее значение "+y);}
		
		//int min = Math.min(a,b);
		//System.out.print(min);
	}

}
