package by.htp.branchings.logic;

public class Task21 {
public static void task() {
	/*Программа — льстец. На экране высвечивается вопрос
	 * «Кто ты: мальчик или девочка? Введи Д или М». В зависимости 
	 * от ответа на экране должен появиться текст «Мне нравятся девочки!» 
	 * или «Мне нравятся мальчики!».
	 */
	String s, m, n, p, b;
	
	 s = "Кто ты: мальчик или девочка? Введи Д или М";
	
	 m = "Д";
	 n = "М";
	p = "Мне нравятся девочки!";
	b = "Мне нравятся мальчики!";
	
	System.out.println(s);
	
	String x = "М";
			
	switch(x) {
	
	case  "Д": 
		System.out.println(m);
		System.out.println(b);
	break;
	case  "М": 
		System.out.println(n);
		System.out.println(p);
	break;
	}
}

}
