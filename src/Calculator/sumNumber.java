package Calculator;

	/*
	 * 絶対値を計算するクラス（プロダクションコード）
	 */

public class sumNumber {
	/*
	 * 絶対値の足し算を行う
	 * @param a 値1
	 * @param b 値2
	 */
	
public static int abAdd(int a,int b) {
	
	/*
	 * abが絶対値になるように計算を行う
	 * 絶対値：0からの距離を示す
	 * つまり、-2の絶対値は2
	 */
	
	if( a < 0 ) {
		a = a * -1 ;
	}

	if( b < 0 ) {
		b = b * -1 ;
	}
	
	return a + b ;
	
}
		

}
