package day10;

public class ExceptionHandling {
	public static void main(String[] args) {
		int number=50/5;
		System.out.println(number);
		
		int number1=50/10;
		System.out.println(number1);

	
		
		try {
			 int number2 = 50/0;
			System.out.println(number2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    

		int number3= 50/25;
		System.out.println(number3);

	}
}
