package day2;

public class DecisionMaking {
	public static void main(String[] args) {
		int x=8, y=7;
		int a=10;
		int b=11;
		
		if (x>=y) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		if (!(a<b)|| (a==b)) {          //false || false
			System.out.println("condition is true");
		}
		else {
			System.out.println("condition is false");
		}

	}
}
