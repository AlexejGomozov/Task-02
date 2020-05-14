package by.htp.branchings.logic;

public class Task26 {
public static void task() {
	//Написать программу нахождения суммы большего и меньшего из трех чисел.
	
	int a, b, c, max, min, s;
	
	a = 3;
	b = 45;
	c = 13;
	
	
	if (a>b)  max = a;
	else max = b;
	
	if(c>max) max = c;
	
	if (a<b) min = a;
	else min = b;
	
	if (c<min) min = c;
	
	s = min + max;
	
	System.out.print(s);
	 
}
}
