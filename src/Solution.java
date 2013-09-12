import java.util.ArrayList;
import java.util.Scanner;


public class Solution {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int input = 0;
		while(input >= 0 ){
			System.out.println("What do you want to do?");
			System.out.print(
					"0: calcPrimeNumbers\n" +
							"-1: quit\n" 

					);
			input = in.nextInt();


			switch(input){

			//Quit
			case -1:
				System.out.println("Goodbye");
				break;

				// Calculate Prime Numbers
			case 0:
				System.out.println("Calculate Prime Numbers from 0 - N\n " +
						"Please input N:");

				long startTime = System.nanoTime();				
				System.out.println("Solution: " + calcPrimeNumbers(in.nextInt()));
				Long duration = System.nanoTime() - startTime;
				System.out.println("Duration: " + (duration * 0.000001) + " milliseconds");

				break;
			default:			
				System.out.println("Invalid response");
				break;
			}
			System.out.println("---------------------------------");

		}

	}


	/*
	 * Uses the Sieve_of_Eratosthenes
	 * Should be O(n)
	 */
	public static ArrayList<Integer> calcPrimeNumbers(int n) {

		ArrayList<Boolean> primeBooleans = new ArrayList<Boolean>();
		ArrayList<Integer> primes = new ArrayList<Integer>();

		for(int i = 0; i < n; i++){
			primeBooleans.add(true);
		}
		int i;
		for(i = 2; i < Math.sqrt(n);  i += 1){
			if(primeBooleans.get(i)){
				for(int j = i*i; j < n; j += i){
					primeBooleans.set(j, false);				 
				}
			}
		}
		for(i = 0; i < primeBooleans.size(); i++){
			if (primeBooleans.get(i))
				primes.add(i);
		}

		return primes;
	} 

}
