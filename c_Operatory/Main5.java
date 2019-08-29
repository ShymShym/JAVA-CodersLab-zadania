
public class Main5 {

	public static void main(String[] args) {
		int a = 1; // a = 1
		int b;
		System.out.println(++a); // wykonaj a+1=2, wyświetl
		System.out.println(a++); // wyświetl a+1, wykonaj. A ma teraz wartość 3
		System.out.println(a); //wyświetla obecną wartość a
		b=a++;				// b = ((wyświetl a), wykonaj a+1). A ma teraz wartość 4, co można sprawdzić w konsoli
		System.out.println(b);
		/*System.out.println(a);
		//dowód na to, że a ma wartość 4, jak w l.10 */
		b=++a;				// b = obecna wartość a zwiększona o 1, a ma teraz wartość 5
		/*System.out.println(a);
		//dowód na to, że a ma teraz wartość 5*/
		System.out.println(++a); // wykonaj a+1=6, wyświetl
	}

}
