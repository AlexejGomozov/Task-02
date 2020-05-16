package by.htp.branchings.logic;

public class Task32 {
public static void task() {
	//Написать программу, которая по заданным трем числам определяет, 
	//является ли сумма каких-либо двух из них положительной.
	
	int a, b, c, m;
	
	a = 30;
	b = 34;
	c = 375; 
	m = c+a;
	
	if (m > 0) System.out.print("Сумма чисел "+ a + " и "+ c + " = "+ m
			+ " и является положительной.");
	else System.out.print("Сумма чисел "+ a + " и "+ c + " = "+ m
			+ " и является отрицательной.");
}
}
