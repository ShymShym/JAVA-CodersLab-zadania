
public class Main8 {

	public static void main(String[] args) {
		int black = 16;
		int white = 15;
		boolean blackOrWhite = black < white; //false
		boolean good = true;
		boolean bad = false;
		boolean goodOrBad = good || bad;
		boolean comparison = blackOrWhite && goodOrBad; //(false) AND (true OR false)
		System.out.println(blackOrWhite);// 16 < 15
		System.out.println(goodOrBad);//alternatywa; true jeśli jedna z wartości true
		System.out.println(comparison);//koniukcja; true tylko jeśli obie wartości true
	}

}
