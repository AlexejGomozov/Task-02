package by.htp.branchings.logic;

public class Task16 {
public static void task() {
	/*  На плоскости ХОY задана своими координатами точка А. Указать, 
	 * где она расположена (на какой оси или в каком координатном угле).
	 */
	
	int x, y;
	
	x = 15;
	y = -5;
	
	if (x == 0 & y == 0) System.out.println("В начале координат");
	else if (x==0 & y> 0 & y < 0) System.out.println("На оси  Y");
	else if (x <0 & x > 0 & y == 0)System.out.println("На оси  X");
	else if (x>0 & y > 0) System.out.println("1 четверть");
	else if (x<0 & y > 0) System.out.println("2 четверть");
	else if (x<0 & y < 0) System.out.println("3 четверть");
	else  System.out.println("4 четверть");
}
}
