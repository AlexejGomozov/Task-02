package by.htp.branchings.logic;

public class Task22 {
public static void task() {
	//Перераспределить значения переменных х и у так, чтобы в х оказалось
	//большее из этих значений, а в y - меньшее.

	int x, y, s;
	
	y = 54;
	x = 43;
	
	s = x; 
	//max = Math.max(x, y);
	
	if  (x > y) {  System.out.println("x = "+x + ", y = "+y);}
	else {  x = y; y = s; System.out.println("x = "+x + ", y = "+y);}
}
}
