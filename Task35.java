package by.htp.branchings.logic;

public class Task35 {
public static void task() {
	//Вычислить число и месяц в невисокосном году по номеру дня.
	
	
	int  j, f, m, a, m1, jn, jl, ag, s, o, n, d, x, y;  
	
	x = 334;
	
	j = 31;
	f = 28; 
	m = 31;
	a =30;
	m1 = 31;
	jn = 30;
	jl = 31;
	ag = 31;
	s = 30;
	o = 31;
	n = 30;
	d = 31;
	        if (x > 0 & x <= j) System.out.print("число " + x+" это "+x + " января");
	        
	        if (x> j & x <= (j + f))  {y = x - j; System.out.print("число " + x+" это "+y + " февраля");}
	        
	        if (x> (j + f) & x <= (j + f + m))  {y = x - (j +f); System.out.print("число " + x+" это "+y + " февраля");} 
	        
	        if (x> (j + f + m) & x <= (j + f + m + a))  {y = x - (j + f + m); System.out.print("число " + x+" это "+y + " марта");} 
	        if (x> (j + f + m + a) & x <= (j + f + m + a + m1))  {y = x - (j + f + m+a); System.out.print("число " + x+" это "+y + " апреля");}

	        if (x> (j + f + m + a + m1 ) & x <= (j + f + m + a + m1 +jn))  {y = x - (j + f + m + a + m1); System.out.print("число " + x+" это "+y + " мая");}
	        if (x> (j + f + m + a + m1 +jn) & x <= (j + f + m + a + m1 +jn+jl))  {y = x - (j + f + m + a + m1 +jn); System.out.print("число " + x+" это "+y + " июня");}
		     
	        if (x> (j + f + m + a + m1 +jn+jl) & x <= (j + f + m + a + m1 +jn+jl+ag))  {y = x - (j + f + m + a + m1 +jn+jl); System.out.print("число " + x+" это "+y + " августа");}
	        if (x> (j + f + m + a + m1 +jn+jl+ag) & x <= (j + f + m + a + m1 +jn+jl+ag+s))  {y = x - (j + f + m + a + m1 +jn+jl+ag); System.out.print("число " + x+" это "+y + " сентября");}
	        
	        if (x> (j + f + m + a + m1 +jn+jl+ag+s) & x <= (j + f + m + a + m1 +jn+jl+ag+s+o))  {y = x - (j + f + m + a + m1 +jn+jl+ag+s); System.out.print("число " + x+" это "+y + " октября");}
	        if (x> (j + f + m + a + m1 +jn+jl+ag+s+o) & x <= (j + f + m + a + m1 +jn+jl+ag+s+o+n))  {y = x - (j + f + m + a + m1 +jn+jl+ag+s+o); System.out.print("число " + x+" это "+y + " ноября");}
            if (x> (j + f + m + a + m1 +jn+jl+ag+s+o+n) & x <= (j + f + m + a + m1 +jn+jl+ag+s+o+n+d))  {y = x - (j + f + m + a + m1 +jn+jl+ag+s+o+n); System.out.print("число " + x+" это "+y + " декобря");}



}
}
