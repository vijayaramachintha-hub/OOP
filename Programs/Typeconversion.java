package Programs;

public class Typeconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int intVal = 100;
		        long longVal = intVal;     
		        float floatVal = longVal;   
		        double doubleVal = floatVal; 

		        System.out.println("Widening Conversion:");
		        System.out.println("int value: " + intVal);
		        System.out.println("long value: " + longVal);
		        System.out.println("float value: " + floatVal);
		        System.out.println("double value: " + doubleVal);

		        double d = 123.456;
		        float f = (float) d;        
		        long l = (long) f;          
		        int i = (int) l;            

		        System.out.println("\nNarrowing Conversion:");
		        System.out.println("double value: " + d);
		        System.out.println("float value: " + f);
		        System.out.println("long value: " + l);
		        System.out.println("int value: " + i);
		    }
}


