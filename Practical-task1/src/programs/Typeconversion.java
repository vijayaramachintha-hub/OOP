package programs;

public class Typeconversion {

	public static void main(String[] args) {
	
		        int intVal = 50;               
		        long longVal = intVal;         
		        float floatVal = longVal;      

		        System.out.println("Widening Conversion:");
		        System.out.println("int value: " + intVal);
		        System.out.println("long value (from int): " + longVal);
		        System.out.println("float value (from long): " + floatVal);

		       
		        double doubleVal = 99.99;        
		        int narrowedInt = (int) doubleVal;  
		        System.out.println("\nNarrowing Conversion:");
		        System.out.println("double value: " + doubleVal);
		        System.out.println("int value (from double): " + narrowedInt);
		    }
		}



