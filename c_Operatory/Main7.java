
public class Main7 {

	public static void main(String[] args) {
		int nr1 = 7;
		int nr2 = 4;
		int result = nr1 + nr2;
		System.out.println(result); //wynik 1
		nr1 = 10;
		result = nr1 + nr2; //ponowne przypisanie sumy wartości nr1 i nr2 do zmiennej result
		//bez ponownego przypisania wynik 2 byłby taki sam jak wynik 1
		System.out.println(result); //wynik 2
	}
// Wyniki 1 i 2 są różne, ponieważ uwzględniana jest ostatnia przypisana zmiennej nr1 wartość.

}
