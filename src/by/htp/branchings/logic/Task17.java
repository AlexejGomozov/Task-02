package by.htp.branchings.logic;

public class Task17 {
public static void task() {
	/* Даны целые числа m, n. Если числа не равны, то заменить каждое 
	 * из них одним и тем же числом, равным большему из исходных, а если равны,
	 *  то заменить числа нулями.
	 */
	int m, n, a; 
	
	m = 4;
	n = 5;
	
    a = Math.max(m, n);
	if (m != n) {m = a; n = a; System.out.print("числа m  и n заменили на большее из них "+a);
}
	else  if (m==n) {m = 0; n=0; System.out.print("числа m и n заменили на '0'");
		
	}
}
}
