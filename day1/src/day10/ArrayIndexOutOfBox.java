package day10;

public class ArrayIndexOutOfBox {
	public static void main(String[] args) {
		int []arr = new int [4];
		
		System.out.println("welcome to B45 batch");
		
		try {
			
		int i= arr[6];
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		finally {
			System.out.println("whatever happens this line will be execute");
		}
		System.out.println("next line should be execute");
		
	}

}
