package lesson1;

public class Application {

	public static void main(String[] arg) {
		
		
		boolean a = true;
		char c = '#';
		byte b = 2;
		short s = 3;
		int n = 4; 
		long l = 5L;
		float f = 6F;
		double d = 7.5;
		
		System.out.println("Boolean true = " + Boolean.TRUE);
		System.out.println("Boolean false = " + Boolean.FALSE);
		System.out.println("Character min = " + Character.MIN_RADIX);
		System.out.println("Character max = " + Character.MAX_RADIX);
		System.out.println("Byte min = " + Byte.MIN_VALUE);
		System.out.println("Byte max = " + Byte.MAX_VALUE);
		System.out.println("Short min = " + Short.MIN_VALUE);
		System.out.println("Short max = " + Short.MAX_VALUE);
		System.out.println("Integer min = " + Integer.MIN_VALUE);
		System.out.println("Integer max = " + Integer.MAX_VALUE);
		System.out.println("Long min = " + Long.MIN_VALUE);
		System.out.println("Long max = " + Long.MAX_VALUE);
		System.out.println("Float min = " + Float.MIN_VALUE);
		System.out.println("Float max = " + Float.MAX_VALUE);
		System.out.println("Double min = " + Double.MIN_VALUE);
		System.out.println("Double max = " + Double.MAX_VALUE);
		
		int [] array = {15, 13, 1, 98, 50, 398, 2, 5, 38, 19};
				
		boolean isSorted = false;
		int j = 0;
		while(!isSorted) {
			isSorted = true;
			for(int i = 0; i < array.length-1; i++) {
				if(array[i] > array[i+1]) {
					isSorted = false;
					j = array[i];
					array[i] = array[i+1];
					array[i+1] = j;
				}
			}
		}
		System.out.println("\nMin array value = " + array[0]);
		System.out.println("Max array value = " + array[array.length-1]);

		
	}
}

