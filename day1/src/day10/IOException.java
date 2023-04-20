package day10;

public class IOException extends java.io.IOException {


	public class Hello_App {
		// saurabh
		void m1() {
			System.out.println("No exception in this method");
		}
		
		//abhishek 
		void m2() throws IOException
		{
			System.out.println("Device Error");
		}
		 //bhavesh
		void m3() throws ArithmeticException
		{
			System.out.println("Arithmetic exception may be happen");
			int a=50/0;
		}
		

		public static void main(String[] args) {
		
			

		}

	}
}
