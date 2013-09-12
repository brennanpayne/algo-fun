import java.util.ArrayList;


public class Solution {
	public static void main(String[] args){
		  calcPrimeNumbers(40);
	}
		

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
