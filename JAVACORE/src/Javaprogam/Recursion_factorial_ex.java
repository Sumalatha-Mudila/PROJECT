package Javaprogam;

public class Recursion_factorial_ex {
	public class recursionfactorial_exp {
		public static void main(String[] args) {
			int num =7;
			int result = factorial(num);
			System.out.println("Facorial of"+ num+"="+ result);
		}
		public static int factorial(int n) {
			if(n==0) {
				return 1;
			}
			else {
				return n * factorial(n-1);
				
			}
			
		}

	}


}
