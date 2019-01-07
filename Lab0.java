package eecs2030.lab0;

import java.util.List;

/**
 * 
 * 
 * A random assortment of methods reviewing topics that should
 * have been covered in your previous programming courses.
 *
 */

public class Lab0 {
	
	
	private Lab0() {
		// empty to prevent object creation
	}
	
	
	
	/**
	 * Returns the value 1.
	 * 
	 * @return the value 1
	 */
	public static int one() {
		return 1;
	}
	
	
	
	
	/**
	 * <p><strong> Divisibility </strong> :  When dividing an integer by a second nonzero integer, 
	 * the quotient may or  may not be an integer. </p>
	 * <p> For example, 12/3 = 4 while 9/4 = 2:25.</p>
	 * <p><strong>Definition </strong>: <em> If {@code a}  and {@code b} are integers with {@code a} 
	 * is not equal to  zero , we say that {@code a}  divides {@code b} 
	 * if there exists an integer {@code c}  such that  {@code b = ac}. 
	 *  When {@code a}  divides {@code b} we say that {@code a}  is a factor of {@code b} 
	 *  and that {@code b}  is a multiple of {@code a} </em>. </p>
	 *  <p> This method take two integers {@code a} and {@code b}, then it return true if  
	 *  {@code a} divides {@code b }  </p>
	 *  
	 *  <pre>
	 *  Example:
	 *  
	 *  isDivisible ( 3, 5) returns false 
	 *  isDivisible ( 5, 21) returns false
	 *  isDivisible ( 75, 512) returns false
	 *  isDivisible ( 5, 10) returns true 
	 *  isDivisible ( 22, 198) returns true 
	 *  isDivisible ( 64, 512) returns true 
	 *  </pre>
	 * 
	 * @param a integer not equal to zero
	 * @param b integer not equal to zero
	 * @return true true if  {@code a} divides {@code b } or {@code b} divides {@code a} 
	 * @pre.
	 * 		{@code a != 0} , and  {@code b != 0}
	 */
	
	public static boolean  isDivisible ( int a , int b ) {
		boolean result = a % b == 0;
		return result;
	}
	
	
	/**
	 * <p><strong> Modular Arithmetic</strong> </p> 
	 * <p><strong> Definition: </strong><em>
	 *  If {@code a} and {@code b}  are integers and {@code m} is a positive integer, 
	 *  then {@code a} is <b>congruent</b> to {@code b}  modulo {@code m} if <b> {@code m} divides {@code a-b} </b>. </em>
	 *  </p><p> In the other words, two integers are congruent mod {@code m} if and only if 
	 *  they have the <b> same remainder when divided by {@code m} </b> .</p>
	 * <p> This method take three integers {@code a} and {@code b} and {@code m}, then it return true if  
	 *  {@code a} is <b>congruent</b> to {@code b}  modulo {@code m} </p>
	 *  
	 *  <pre>
	 *  Example:
	 *  
	 *  isCongruent ( 81,199,5) returns false 
	 *  isCongruent ( -8,8, 5) returns false
	 *  isCongruent ( 24, 14, 6) returns false
	 *  isCongruent ( 10, 26, 8) returns true 
	 *  isCongruent ( 17, 5, 6) returns true 
	 *  isCongruent ( -1,1, 2) returns true 
	 *  isCongruent ( -8,2, 5) returns true 
	 *  isCongruent ( 38,23, 15) returns true 
	 *  </pre>
	 * 
	 * 
	 * @param a integer not equal to zero
	 * @param b integer not equal to zero 
	 * @param m integer not equal to zero
	 * @return true if {@code a} is <b>congruent</b> to {@code b}  modulo {@code m} 
	 * @pre.
	 * 		{@code m > 0} , {@code a != 0}  , {@code b != 0} 
	 */
	
	
	public static boolean isCongruent (int a , int b , int m ) {
		
		
		
		
	}
	
	
	/**
	 * Returns the mathematical average of 3 values.
	 * 
	 * @param a a value
	 * @param b a value
	 * @param c a value
	 * @return the average of a, b, and c
	 */
	public static double avg(int a, int b, int c) {
		
			
	}
	
	
	
	
	/**
	 * <p><strong> Primes</strong> </p>
	 * <p> A <em> positive integer </em> {@code n > 1} is called <strong> prime</strong> 
	 * if the only positive factors of {@code n}  are {@code  1}  and {@code  n} . 
	 * A positive integer that is greater than one and is not prime is called <strong> composite</strong>.</p>
	 * <p> An integer {@code  n} is <strong> composite </strong> 
	 * if and only if there exists an integer {@code a} such that
	 * <strong> <em>  {@code a}  divides {@code n}  </em></strong> and {@code 1 < a < n}.</p>
	 * 
	 * <p> <strong> Hint:  1 is neither prime nor composite. It forms its own special category as a "unit".</strong></p>
	 * 
	 * <p> This method checks the positive integer if it is prime or not.</p>
	 *  <pre>
	 *  Example:
	 *  
	 *  isPrime ( -5) returns false 
	 *  isPrime ( 6) returns false
	 *  isPrime ( 25) returns false
	 *  isPrime ( 2) returns true 
	 *  isPrime ( 3) returns true 
	 *  isPrime ( 13) returns true 
	 *  isPrime ( 17) returns true 
	 *  isPrime ( 29) returns true 
	 *  </pre>
	 * 
	 * @param n positive integer 
	 * @return true  if number {@code n} is prime, else false
	 * @pre.
	 * 		{@code n > 0}  
	 */
	public static boolean isPrime(int n) {
		
		

		
	}
	
	/**
	 * This method checks the element of the list of integers and 
	 * return the number (count) of  of prime integers.
	 * 
	 * 
	 * <pre>
	 * Example: if the input list is 
	 *  
	 *  [1,2,4,5,6,7] returns 3 ( hint: we have three prime integers : 2, 5, and 7)  
	 *  [-1, -5, 6, 8, 16 , 18]  returns 0 ( hint: none of these integers are prime )
	 *  [ 9, 13, 17, 19, 37] returns 4 ( hint: we have four prime numbers: 13, 17, 19 and 37) 
	 * 
	 *  </pre>
	 * 
	 * <p> Note: This method does not modify the input list of integer {@code listofintegers}.</p>
	 * 
	 * @param listofintegers  a list of Integers
	 * @return the number of prime integers  in the given list of integers
	 */
	
	
	public static int countPrimeElements(List<Integer> listofintegers) {
		
			
			
	}
	
	/**
	 * This method check the input array of integers and return number of elements 
	 * that are  <b>congruent</b> to {@code b}  modulo {@code m}.
	 * 
	 * <pre>
	 * Example:   
	 *  arrayofint= [1,6,8,5],b=14  m=3  returns 2   
	 *  arrayofint= [2,3,17,19,29], b=7, m=7  returns 0
	 *  arrayofint= [81,45,65,99] b= 18 , m=3 returns 4 
	 * 
	 *  </pre>
	 *  
	 * <p> Note: This method does not modify the input list of integer {@code arrayofint}.</p>
	 * @param arrayofint input array of int , elements are not equal to zero
	 * @param b integer not equal to zero 
	 * @param m positive integer 
	 * @return the number of elements that are  <b>congruent</b> to {@code b}  modulo {@code m}.
	 * 
	 * @pre.
	 * 		{@code m > 0} , {@code b != 0}  , {@code arrayofint[i] != 0} 
	 * 
	 */
	public static int countCongruentElement(int [] arrayofint, int b, int m ) {
		
	
	}
		
		
		

}
