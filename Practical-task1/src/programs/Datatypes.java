package programs;
public class Datatypes{
	public static void main(String[] args) {
		byte b=10;
		short s=100;
		int i=1000;
		long l=100000;
		float f=10.3f;
		double d=30.55;
		char c='v';
		boolean bool = true;
		System.out.println("byte: "+ b +", size: "+byte.class+"bytes");
		System.out.println("short: "+ s +", size: "+short.class+"bytes");
		System.out.println("int: "+ i +", size: "+Integer.class+"bytes");
		System.out.println("long: "+ l +", size: "+long.class+"bytes");
		System.out.println("float: "+ f +", size: "+float.class+"bytes");
		System.out.println("double: "+ d +", size: "+double.class+"bytes");
		System.out.println("char: "+ c +", size: "+Character.class+"bytes");
		System.out.println("boolean: "+ bool +", size:JVM dependent");
	}
}