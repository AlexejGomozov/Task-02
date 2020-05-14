package by.htp.branchings.logic;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class Task13 {
public static void task () {
	/* Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
	 *  которая из точек находится ближе к началу координат.
	 *  Формула расстояния от точки до начала координат ОА = √xa^2 + ya^2;
	 */
   double  x1, x2, y1, y2, l1, l2;
   
   x1 = 4;
   y1 = 5;
   
   x2 = 9;
   y2 = 2;
   
   l1 = sqrt((pow(x1,2)+pow(y1,2)));
   
	l2 = sqrt((pow(x2,2)+pow(y2,2)));
	
	if (l1>l2) System.out.print("точка с координатами x1, y1 ближе к началу координат");
	else System.out.print("точка с координатами x2, y2 ближе к началу координат");
	
}
}
