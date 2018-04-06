
public class FunWithRecursion {

	public static void main(String[] args) {	
		System.out.println("Christopher Odden, CIS319, Unit 5 Guided Practice 1\n");
		System.out.println("Rocket Countdown: ");
		rocketCountdown(10);
		System.out.println();
		
		System.out.println("Factorial: ");
		computeFactorial(5);
		System.out.println();
	}
	
	public static void rocketCountdown(int num) {	
		System.out.print("Using Iteration: ");
		iterativeCountdown(num);
		System.out.println("Blast Off!");
		
		System.out.print("Using Recursion: ");
		recursiveCountdown(num);
		System.out.println("Blast Off!");
	} // end method rocketCountdown
	
	public static void iterativeCountdown(int num) {	
		for (int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}
	} // end method iterativeCountdown
	
	public static void recursiveCountdown(int num) {
		System.out.print(num);
		System.out.print(" ");
		if (num > 1) {
			recursiveCountdown(num - 1);
		}
	} // end method recursiveCountdown
	
	public static void computeFactorial(int num) {
		System.out.print("Using Iteration: ");
		System.out.println(iterativeFactorial(num));
		
		System.out.print("Using Head Recursion: ");
		System.out.println(headRecursiveFactorial(num));
		
		System.out.print("Using Tail Recursion: ");
		System.out.println(tailRecursiveFactorial(num));
	} // end method computerFactorial
	
	public static long iterativeFactorial(int num) {
		long factorial = 1;
		for (int i = num; i > 1; i--) {
			factorial *= i;
		}
		return factorial;
	} // end method iterativeFactorial
	
	public static long headRecursiveFactorial(int num) {
		if ((num == 0) || (num == 1)) {
			return 1;
		} else {
			return headRecursiveFactorial(num - 1) * num;
		}
	} // end method headRecursiveFactorial
	
	public static long tailRecursiveFactorial(int num) {
		long factorial = 1;
		return tailHelperRecursiveFactorial(num, factorial);
	} // end method tailRecursiveFactorial
	
	public static long tailHelperRecursiveFactorial(int currentNum, long factorialSoFar) {
		if (currentNum == 0) {
			return factorialSoFar;
		} else {
			return tailHelperRecursiveFactorial(currentNum - 1, factorialSoFar * currentNum);
		}
	} // end method tailHelperRecursiveFactorial
}




