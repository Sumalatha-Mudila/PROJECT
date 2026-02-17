package Javaprogam;

public class Constructorexample {
	
		String name;
		int age;
		Constructorexample() {
			name = "Pooja";
			age = 0;
		}
			Constructorexample(String n, int a){
				name = n;
				age = a;
			}
			void display() {
				System.out.println("Name:"+name);
				System.out.println("Age:"+age);
			}
			public static void main(String[] args) {
				Constructorexample s1=new Constructorexample();
				Constructorexample s2=new Constructorexample("poojitha",20)	;
				s1.display();
				s2.display();
		}

	}


