package by.htp.branchings.logic;

public class Task14 {
public static void task() {
	/* Даны два угла треугольника (в градусах). Определить, существует ли
	 *  такой треугольник, и если да, то будет ли он прямоугольным.
	 */
	int a, b; 
	a = 54;
	b = 120;
	
	if  ((a + b)<180) System.out.println("данная фигура может быть треугольником");
	else System.out.println("данная фигура  не может быть треугольником");
	
	if ((a + b) == 90) System.out.println("данный треугольник прямоугольный");
	else System.out.println("данный треугольник не прямоугольный");
	
}
}
