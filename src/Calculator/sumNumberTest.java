package Calculator;



import static org.assertj.core.api.Assertions.assertThat;

/*
 * sumNumberクラスのテストクラス（テストコード）
 */


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class sumNumberTest {

	
	
	
	@Test
	@DisplayName("ともに自然数")
	
	public void naturals() {
		sumNumber sumnumbers = new sumNumber();
		
		int result = sumnumbers . abAdd ( 3 , 8 );
		
		assertThat(result).isEqualTo( 11 );
	}
		
	@Test
	@DisplayName("ともに負の数")
	
	public void negatives() {
		sumNumber sumnumbers = new sumNumber();	
		
		int result = sumnumbers .abAdd( -3 , -8 );
		
		assertThat(result).isEqualTo( 11 );
		
	}
	
	@Test
	@DisplayName("ゼロを含む計算")
	
	public void zero() {
		sumNumber sumnumbers = new sumNumber();
		
		int result = sumnumbers .abAdd( 0 , -8 );
		
		assertThat(result).isEqualTo( 8 );
		
	}
	
	@Test
	@DisplayName("ゼロの計算")
	
	public void zeros() {
		sumNumber sumnumbers = new sumNumber();
		
		int result = sumnumbers .abAdd( 0 , 0 );
		
		assertThat(result).isEqualTo( 0 );
		
	}
	
	@Test
	@DisplayName("計算ミス")
	
	public void mistake() {
		sumNumber sumnumbers = new sumNumber();	
		
		int result = sumnumbers .abAdd( -3 , -8 );
		
		assertThat(result).isEqualTo( 12 );
		
	}
	
}
