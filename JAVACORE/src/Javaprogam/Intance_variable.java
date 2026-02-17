package Javaprogam;

public class Intance_variable {
	
		String name;
		int age;
		public void setDetails(String n,int a) {
			name=n;
			age=a;
		}
		public void displayDetails() {
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
		}
		public static void main(String[] args) {
			 Intance_variable s1=new  Intance_variable();
			s1.setDetails("pooja",21);
			s1.displayDetails();
		}

	}




