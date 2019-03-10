package _03_Printing_Binary;

public class BinaryPrinter {
	// Complete the methods below so they print the passed in parameter in binary.
	// Don't be afraid to use the methods that are already complete to finish the
	// others.
	// Create a main method to test your methods.

	public static void main(String[] args) {
		Byte b = 8;
		printByteBinary(b);
		Short s = 2;
		printShortBinary(s);
		int i = 32;
		printIntBinary(i);
		long l = 64;
		printLongBinary(l);
	}

	public static void printByteBinary(byte b) {
		System.out.println(Integer.toBinaryString(Integer.parseInt(Byte.toString(b))));
	}

	public static void printShortBinary(short s) {
		System.out.println(Integer.toBinaryString(Integer.parseInt(Short.toString(s))));
	}

	public static void printIntBinary(int i) {
		System.out.println(Integer.toBinaryString(i));
	}

	public static void printLongBinary(long l) {
		System.out.println(Integer.toBinaryString(Integer.parseInt(Long.toString(l))));
	}
}
