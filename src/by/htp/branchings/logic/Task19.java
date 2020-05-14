package by.htp.branchings.logic;

public class Task19 {
public static void task() {
	//Подсчитать количество положительных среди чисел а, b, с.
	
	int a, b, c, chet;
	
	a = 4;
	b = 5;
	c = 6;
	chet = 0;
	
	if (a>0) chet = chet+1; 
	if (b>0) chet = chet+1; 
	if (c>0) chet = chet+1; 
	
	System.out.print(chet);
	
}
}
