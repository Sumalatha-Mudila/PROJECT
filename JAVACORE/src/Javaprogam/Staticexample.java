package Javaprogam;

public class Staticexample {
	
		static int COUNT=0;
		Staticexample(){
			COUNT++;
		}
		public static void main(String[] args) {
			new Staticexample();
			new Staticexample();
			System.out.println("objects created:"+COUNT);
		}
	}



