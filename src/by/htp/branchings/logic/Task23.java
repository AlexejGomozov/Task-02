package by.htp.branchings.logic;

public class Task23 {
public static void task() {
	/* Определить правильность даты, введенной с клавиатуры 
	 * (число — от 1 до 31, месяц — от 1 до 12). Если введены 
	 * некорректные данные, то сообщить об этом.
	 */
	
	int x, m;
	
	x = 24;
	m = 11;
	
	if( x>=1 & x<=31 & m>=1 & m <= 12 ) {System.out.print("сегодня "+x+ "."+ m);}
	 else  System.out.print("Вы ввели некоректные данные");
	
} 

}
