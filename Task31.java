package by.htp.branchings.logic;

public class Task31 {
public static void task() {
	//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
	// Определить, пройдет ли кирпич через отверстие.
	
	int A, B, x, y;
	
	A = 40;
	B = 20; 
	x = 40; 
	y = 20; 
	
	if(A == x & B == y) System.out.print("Размеры кирпича сооответствуют размерам отверстия.");
	else System.out.print("Размеры кирпича не соответствуют размерам отверстия.");
}
}
