package by.htp.branchings.logic;

public class Task15 {
public static void task() {
	/*  Даны действительные числа х и у, не равные друг другу.
	 *  Меньшее из этих двух чисел заменить половиной их суммы,
	 *   а большее — их удвоенным произведением.
	 */
	
	int x, y, a, b, min;
	
	x = 27;
	y = 53;
	
	a = (x+y)/2;
	b = 2*x*y;
	
	min = Math.min(x, b);
	//max = Math.max(a, b);
	
	if (x == min) {x = a; y =b; System.out.print("число \"x\" заменили на "+ x 
			+", а число \"y\" на "+y);
	}else  {y = a; x = b; System.out.print("число \"y\" заменили на "+ y 
			+", а число \"y\" на "+x);}
	
}
}
