package day10;

public class App_New {
	
		void validate (int age)
		{
			if(age <18) {
			throw new ArithmeticException("cause their age is less");
			}
			else {
				System.out.println("they are eligible");
			}
		}

		public static void main(String[] args) {
			App_New obj= new App_New();
			obj.validate(19);
			

		}
}
