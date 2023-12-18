package Practice;

public class Data_types {

	public static void main(String[] args) {
		//Data types - types of data
		//java is very strict data type not flexible it is interger, float or double
		// java is static and dynamic
		// static means compile time and dynamic means run time.
		// it follows small letter and capital letters because its case sensitive
		
		// two types of data
		// premitive and non-premitive
		
		// Premitive - does not need OBJECT and REFERENCE
		       // types of premitive  -- 
		        // 1. Boolean (true, false) 
		        // 2. numeric (numbers) - 
		                // a. character - a, e, 
		                // b. intergral numbers
		                          // interger - Bype, short, long, int
		                          // Floating-point - Float, double
		
		
		//1. Byte = size 1 byte = 8 bits
		// 2^7
		// range = -128 to 127
		
	        Byte a = 10;
	        a = 20;
		
	     //2. short = size of 2 byte = 2*8 = 16 bits
	     // 2^16
	     // range = 32768 to -32767 
	        
	        short c = 127;
	        
	      //3. int = size 4 bytes = 4*8 = 32 bits
	        
	        // 2^31 = 2147483648
	        // range = -2147483648 to 2147483647
	        
	        int i = 10;
	        
	       // 4. Long = 8 bytes = 8*8 = 64 bits
	       // range = 2^63 to 2^63-1
	        // distance of moon
	        // number of hairs.
	        // total number of population.
	        
	        long n= 12345678900l; // but here l will not print on the console.
	        
	        String phone = "9192928373464";
	        
	        // 5. Float = 4 bytes (Same like int)
	     // range  = after dot . can take 7 digits
	        // 32 bits
	        
	        float e = 12.33f;
	        float f = (float) 12.45;
	        
	        // 6. double = 8 bytes (long)
	        // range  = after dot . can take 15 digits
	        
	        double s = 100;
	        double t = 12.567897d;
	        
	        // 7. char = // -1 not allowed because its 2 digits
	        // 2 bytes = 16 bits (same like short)
	        // unique --> special + lang char + ASCII
	        
	        // in the character, if you are doing any mathematical calculations it always calculate with ASCII value for example
	        
	        char c1 = 'a';
	        char c11 = 'b';
	     
	        char k = '1';
	        char m = 's';
	        
	        System.out.println(c1+c11); // 195
	        
	        // 8. boolean - true or false (these are not a keywords) boolean literals
	        
	        boolean fl = true;
	        //size = ~1bit
	        // range - true /false
		
		// Non-primitive - need OBJECT and REFERENCE
		      // Array, class, interface, string and objects
		
		
		
		
		
	}

}
