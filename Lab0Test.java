package eecs2030.lab0;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Lab0Test {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	
	@Test
	public void test00_one() {
		assertEquals(1, Lab0.one());
	}
	
	
	@Test
	public void test01_isDivisible() {
		
		
		assertEquals("isDivisible (3, 5) is not implemented correclty", false,
				Lab0.isDivisible(3, 5));
		assertEquals("isDivisible (5, 21) is not implemented correclty", false,
				Lab0.isDivisible(5, 21));
		assertEquals("isDivisible ( 5,10 ) is not implemented correclty", true,
				Lab0.isDivisible(5, 10));
		assertEquals("isDivisible(64, 512) is not implemented correclty", true,
				Lab0.isDivisible(64, 512));
		assertEquals("isDivisible is not implemented correclty", true,
				Lab0.isDivisible(64, -512));
		
	}
	
	@Test
	public void test02_isCongruent() {
		
		
		
		assertEquals("isCongruent ( 81,199,5) is not implemented correclty", false,
				Lab0.isCongruent ( 81,199,5));
		assertEquals("isCongruent ( 24, 14, 6) is not implemented correclty", false,
				Lab0.isCongruent ( 24, 14, 6));
		assertEquals("isCongruent ( -8,2, 5) is not implemented correclty", true,
				Lab0.isCongruent ( -8,2, 5));
		assertEquals("isCongruent ( 38,23, 15) is not implemented correclty ", true,
				Lab0.isCongruent ( 38,23, 15));
		assertEquals("isCongruent ( 2,3, 10) is not implemented correclty ", false,
				Lab0.isCongruent ( 2,3, 10));
	}
	
	
	@Test
	public void test03_avg() {
		final int[] A = { 1, 0, -100, 0 };
		final int[] B = { 1, 1, -101, Integer.MAX_VALUE };
		final int[] C = { 1, 1, -103, Integer.MAX_VALUE };
		final double[] EXP = { 1.0, 2.0 / 3, -304.0 / 3, (2.0 * Integer.MAX_VALUE) / 3 };
		for (int i = 0; i < A.length; i++) {
			int a = A[i];
			int b = B[i];
			int c = C[i];
			double exp = EXP[i];
			String error = String.format("avg(%d, %d, %d) failed", a, b, c);
			assertEquals(error, exp, Lab0.avg(a, b, c), 10 * Math.ulp(exp));
		}
	}
	
	
	
	@Test
	public void test03_isPrime() {
		
		
		
		assertEquals("isPrime ( 81) is not implemented correclty", false,
				Lab0.isPrime ( 81));
		assertEquals("isPrime ( 24) is not implemented correclty", false,
				Lab0.isPrime ( 6));
		assertEquals("isPrime ( -8)  is not implemented correclty", false,
				Lab0.isPrime ( -8));
		assertEquals("isPrime (29) is not implemented correclty ", true,
				Lab0.isPrime ( 29));
		assertEquals("isPrime ( 13) is not implemented correclty ", true,
				Lab0.isPrime ( 13));
	}
	
	@Test
	public void test04_0_countPrimeElements() {
		
		List<Integer> t = Arrays.asList(0,1);
		List<Integer> u = new ArrayList<>(t);
		String error = String.format("countPrimeElements(%s) failed", t);
		assertEquals(error,0,Lab0.countPrimeElements(t));
		assertEquals("countPrimeElements(t) changed the list t",u, t);
		
	}
	@Test
	public void test04_1_countPrimeElements() {
		
		List<Integer> t = Arrays.asList(1,2,4,5,6,7);
		List<Integer> u = new ArrayList<>(t);
		String error = String.format("countPrimeElements(%s) failed", t);
		assertEquals(error,3,Lab0.countPrimeElements(t));
		assertEquals("countPrimeElements(t) changed the list t",u, t);
		
	}
	
	@Test
	public void test04_2_countPrimeElements() {
		
		List<Integer> t = Arrays.asList(-9, -5, 9, 13, 17, 19, 37);
		List<Integer> u = new ArrayList<>(t);
		String error = String.format("countPrimeElements(%s) failed", t);
		assertEquals(error,4,Lab0.countPrimeElements(t));
		assertEquals("countPrimeElements(t) changed the list t",u, t);
		
	}
	@Test
	public void test04_3_countPrimeElements() {
		
		List<Integer> t = Arrays.asList();
		List<Integer> u = new ArrayList<>(t);
		String error = String.format("countPrimeElements(%s) failed", t);
		assertEquals(error,0,Lab0.countPrimeElements(t));
		assertEquals("countPrimeElements(t) changed the list t",u, t);
		
	}
	
	
	
	@Test
	public void test05_0_countCongruentElement() {
		
		int [] t = {1,6,8,5};
		int b=14;
		int m=3;
		int [] u= Arrays.copyOf(t, t.length);
		String error = String.format("countCongruentElement(%s) failed", Arrays.toString( t));
		assertEquals(error,2,Lab0.countCongruentElement(t, b, m) );
		assertEquals("countCongruentElement(t, b, m) changed the list t",
				Arrays.toString(u), Arrays.toString( t));
		
	}
	
	
	@Test
	public void test05_1_countCongruentElement() {
		
		int [] t = {2,3,17,19,29};
		int b= 7;
		int m=7;
		int [] u= Arrays.copyOf(t, t.length);
		String error = String.format("countCongruentElement(%s) failed", Arrays.toString( t));
		assertEquals(error,0,Lab0.countCongruentElement(t, b, m) );
		assertEquals("countCongruentElement(t, b, m) changed the list t",
				Arrays.toString(u), Arrays.toString( t));
		
	}
	
	
	@Test
	public void test05_2_countCongruentElement() {
		
		int [] t = {};
		int b= 7;
		int m=7;
		int [] u= Arrays.copyOf(t, t.length);
		String error = String.format("countCongruentElement(%s) failed", Arrays.toString( t));
		assertEquals(error,0,Lab0.countCongruentElement(t, b, m) );
		assertEquals("countCongruentElement(t, b, m) changed the list t",
				Arrays.toString(u), Arrays.toString( t));
		
	}
	
	@Test
	public void test05_3_countCongruentElement() {
		
		int [] t = {81,45,65,99};
		int b= 18;
		int m=3;
		int [] u= Arrays.copyOf(t, t.length);
		String error = String.format("countCongruentElement(%s) failed", Arrays.toString( t));
		assertEquals(error,3,Lab0.countCongruentElement(t, b, m) );
		assertEquals("countCongruentElement(t, b, m) changed the list t",
				Arrays.toString(u), Arrays.toString( t));
		
	}
	
}
