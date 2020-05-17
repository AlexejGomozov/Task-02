package by.htp.branchings.logic;

public class Task36 {
public static void task() {
	// Вычислить значение функции
	double f,  x;
	
	x = 5;

	if(x<=3)  {f =  Math.pow(x, 2) - (3*x +9); System.out.print(f);}
	 else if (x>3) { f = 1/(Math.pow(x,  3) + 6);System.out.print(f);}
}
}
