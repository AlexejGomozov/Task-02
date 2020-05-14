package by.htp.branchings.logic;

public class Task20 {
public static void task() {
	//Определить, делителем каких чисел а, b, с является число k.
	
	int a, b, c, k;
	
	a = 4;
	b = 7;
	c = 24;
	k = 2;
	
	if (a%k == 0) System.out.println(k+ " является делителем  "+a);
	if (b%k == 0) System.out.println(k+ " является делителем  "+b);
	if (c%k == 0) System.out.println(k+ " является делителем  "+c);
	
}
}
