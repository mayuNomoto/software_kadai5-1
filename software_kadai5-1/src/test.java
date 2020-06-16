import static org.junit.Assert.*;


import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class test {
	@Test
	public void IntToEngで1から19までを英語に変換できる() {
		IntToEng ite = new IntToEng();
		String expected = "thirteen";
		String actual = ite.solve1(13);
		assertThat(actual, is(expected));
	}
	@Test
	public void IntToEngで20から99までを英語に変換できる() {
			IntToEng ite = new IntToEng();
			String expected = "fifty three";
			String actual = ite.solve2(53);
			assertThat(actual, is(expected));
			expected = "seventy nine";
			actual = ite.solve2(79);
			assertThat(actual, is(expected));
		
	}
	@Test
	public void IntToEngで100から999までを英語に変換できる() {
			IntToEng ite = new IntToEng();
			String expected = "seven hundred thirty four";
			String actual = ite.solve3(734);
			assertThat(actual, is(expected));
			
		
	}

	@Test
	public void IntToEngで1000から99999までを英語に変換できる() {
			IntToEng ite = new IntToEng();
			String expected = "six thousand seven hundred sixty two";
			String actual = ite.solve4(6762);
			assertThat(actual, is(expected));
			expected = "twenty seven thousand nine hundred sixty eight";
			actual = ite.solve4(27968);
			assertThat(actual, is(expected));
			
		
	}
	@Test
	public void IntToEngで100000から1000000000までを英語に変換できる() {
			IntToEng ite = new IntToEng();
			String expected = "seventeen million two hundred fifty three thousand nine hundred sixty four";
			String actual = ite.solve5(17253964);
			assertThat(actual, is(expected));
			
	}
	@Test
	public void IntToEngで1000000000からintの範囲まで英語に変換できる() {
		IntToEng ite = new IntToEng();
		String expected = "one billion seven hundred twenty five million three hundred ninety six thousand four hundred eighty five";
		String actual = ite.solve6(1725396485);
		assertThat(actual, is(expected));
	}



}
