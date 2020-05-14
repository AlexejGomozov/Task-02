package by.htp.branchings.logic;

public class Task18 {
public static void task () {
	//Подсчитать количество отрицательных среди чисел а, b, с.
	
	int a, b, c, nech;
	
	a = -1;
	b = -2;
	c = -3;
	
	nech = 0;
	
	if (a < 0) nech = nech + 1;
	if (b < 0) nech = nech + 1;
	if (c < 0) nech = nech + 1;
	
	System.out.print(nech);
}
}
