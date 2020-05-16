package by.htp.branchings.logic;

public class Task28 {
public static void task() {
	//Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно 
	//d, то найти max(d — a, d — b, d — c).
	
	int a, b, c, d, d1, d2, d3, max;
	
	a = 5;
	b = 4;
	c = 6;
	d = 34; 
    d1 = 1;
    d2 = 1;
    d3 = 1;
    
	max = 1;
	
	if (d!=a & d!=b & d!=c)
	       { d1 = d1*(d - a); d2 = d2*(d - b); d3 = d3*(d - c); 
		 
	        if (d1 > d2) { if (d1>d3) max=d1;
	                 else max = d3;}
	        else  { if (d2>d3) max = d2; 
	              else max = d3;}
	           System.out.println(max);
	        }
	
	else  if (d == a)   System.out.print("d = a");
	              else if (d == b) System.out.print("d = b");
	                   else if (d == c) System.out.print("d = c");
	 

	
	 //System.out.print(max);
	}	
}

