package by.htp.branchings.logic;

public class Task12 {
public static void task() {
	/* Даны три действительных числа. Возвести в квадрат те из них,
	 *  значения которых неотрицательны, и в четвертую степень — отрицательные.
	 */
	double a, b, c, otr, notr, otr1, notr1, otr2, notr2, otr3, notr3;
	
	a = -35;
	b = 34;
	c = 67;
	
	otr = 1;
	notr = 1;
	
	if (a<0) {
		otr1 = otr *  a; otr1 = Math.pow(otr1, 4); System.out.println("otr1 = "+otr1);
	} else {notr1= notr * a; notr1 = Math.pow(notr1, 2); System.out.println("notr1 = "+notr1);}
	
	if (b<0) {
		otr2 = otr *  b; otr2 = Math.pow(otr2, 4); System.out.println("otr2 = "+otr2);
	} else {notr2= notr * b; notr2 = Math.pow(notr2, 2); System.out.println("notr2 = "+notr2);}
	
	if (c<0) {
		otr3 = otr *  c; otr3 = Math.pow(otr3, 4); System.out.println("otr3 = "+otr3);
	} else {notr3= notr * c; notr3 = Math.pow(notr3, 2); System.out.println("notr3 = "+notr3);}
}
}
