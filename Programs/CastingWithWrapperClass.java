package Programs;

public class CastingWithWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        int num = 50;
	        Integer intObj = num;
	        int unboxedNum = intObj; 
	        Integer intWrapper = Integer.valueOf(100);

	       
	        double doubleVal = intWrapper.doubleValue();  
	        float floatVal = intWrapper.floatValue();     
	        byte byteVal = intWrapper.byteValue();        

	        System.out.println("Wrapper Class Casting:");
	        System.out.println("Integer object: " + intWrapper);
	        System.out.println("As double: " + doubleVal);
	        System.out.println("As float: " + floatVal);
	        System.out.println("As byte: " + byteVal);
	    }
	}



