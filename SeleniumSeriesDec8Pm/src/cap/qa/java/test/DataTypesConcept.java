package cap.qa.java.test;

public class DataTypesConcept {

	/*
	 * 
	 * Variable:-
	 * 
	 * Software --> Processing the data
	 * 
	 * Data --> Excel (Documents) + DB (SQL, Oracle, ADUP, AWS/Google cloud)
	 * 
	 * Programming language --> Variable --> Store any data or value.
	 * 
	 * Variable is like a container to store the data or info or value
	 * 
	 * What type of data that we are going to store? --> Data type
	 * 
	 * Data type is used to define the type of data to be stored in the variable
	 * 
	 * Strict data type. / Strictly typed language
	 * 
	 * int age = 28;
	 * 
	 * float x = 28.9;
	 * 
	 * 
	 * 
	 */

	/**
	 * 
	 * Memory --> Byte (8 bits)
	 * 
	 *
	 * Class --> Idea or Blue Print or Template Object --> Real time Entity
	 * 
	 * Variable --> To store the data. Data type --> Type of data.
	 * 
	 * 1. Primitive Data type - Don't need object to store the data
	 * 
	 * > boolean type boolean -> true/false > Numeric type a. Character Type: char
	 * 'a', 'z' , '1' , ':' '?' --> Single digit Alpha, Numeric(0 to 9), Special b.
	 * Integral Type: int(4B), short(2B), long(8B), byte(1B) --> To store the
	 * numbers b1. Floating Type: double(8B), float(4B)
	 * 
	 * 8 Primitive Data types--> boolean, char, byte, short, int, long, float,
	 * double
	 * 
	 * 2. Non-Primitive Data type - Needs Object to store the data
	 * 
	 * 
	 */

	public static void main(String[] args) {

		// 1. byte: 1 B (8 bits)
		// -2^(n-1) to 2(n-1)-1 --> n number of bits --> Ranges --> -128 to 127

		byte b = 90; // Datatype variable = data;

		b = 10;

		b = 26;

		System.out.println(b); // To print the output

		byte b1 = 28;

		System.out.println(b1);

		System.out.println(b + b1);

		System.out.println(b * b1);

		// 2. Short (2B) --> 16 bits

		// -32768 to 32767

		short s = -32768;

		s = 2000;

		System.out.println(s);

		// 3. int (4B) --> 32 bits

		// -2147483648 to -2147483647

		int i = -538394337;

		i = 6448;

		System.out.println(i);

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Byte.MIN_VALUE);

		System.out.println(Byte.MAX_VALUE);

		System.out.println(Short.MIN_VALUE);

		System.out.println(Short.MAX_VALUE);

		System.out.println(Long.MIN_VALUE);

		System.out.println(Long.MAX_VALUE);

		// 4. Long (8B) --> 64 bits

		/*
		 * -9223372036854775808 to 9223372036854775807
		 */

		long l1 = 100;

		System.out.println(l1);

		// int (Middle) -> 4B

		// 5. float
		// size : 4B
		// after . it will take upto 7 digits

		// 1.4e^-45
		/*
		 * // Range 1.4E-45 3.4028235E38
		 */

		System.out.println(Float.MIN_VALUE);

		System.out.println(Float.MAX_VALUE);

		float f = 20.565675767f;

		float f1 = 20;

		System.out.println(f1);

		System.out.println(f);

		// 6. double --> 8B --> 64 bits
		// range after . upto 15 digits

		/*
		 * 4.9E-324 to 1.7976931348623157E308
		 */

		System.out.println(Double.MIN_VALUE);

		System.out.println(Double.MAX_VALUE);

		double x = 10.34694040468749408d;

		double d1 = 100;

		System.out.println(d1);

		System.out.println(x);

		// 7. char

		// char --> ASCII
		// American standard code for information interchange

		char c1 = 'a';
		char c2 = ':';
		char c3 = '1';

		System.out.println((byte) c1);
		System.out.println((byte) c2);
		System.out.println((byte) c3);

		// 8. boolean

		boolean b11 = true;
		boolean b2 = false;

		System.out.println(b11);

		System.out.println(b2);

	}

}
