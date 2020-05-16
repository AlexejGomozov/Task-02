package by.htp.branchings.logic;

public class Task30 {
public static void task () {
	/*Даны действительные числа а,b,с. Удвоить эти числа,
	если а > b > с, и заменить их абсолютными значениями, если
	это не так.*/
	int a, c, b;
	
	a = -262;
	b = -56;
	c = -83;
	
	if(a>b & b>c) { a = a*2; b = b*2; c = c*2; }
	else { if (a < 0) a = Math.abs(a);
	 if (b < 0) b = Math.abs(b);
	 if (c < 0) c = Math.abs(c);   }   
	
	
	System.out.print("a= "+a+ ", b= "+ b+ ", c= "+ c+ ".");
}
}

