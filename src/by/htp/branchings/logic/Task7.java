package by.htp.branchings.logic;

public class Task7 {
  public static void task() {
	 /* Составить программу нахождения модуля выражения a*x*x + b*x + c 
	  при заданных значениях a, b, c и х */
	  
	  int a, b, c, d, x;
	  
	  a = 4;
	  b = 2;
	  c = 91; 
	  x = 234;
	  
	  d = Math.abs(a*x*x + b*x + c);
	  
	  System.out.print(d);
  }
}
