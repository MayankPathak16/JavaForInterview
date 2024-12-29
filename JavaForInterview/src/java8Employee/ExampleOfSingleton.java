package java8Employee;
class Singleton {
	//Need to define static variable of singleton type
	private static Singleton single_instance = null;
	//Defining one String s
	public String s;
	/**
	 * @param s , Need to create private constructor
	 */
	private Singleton() {
		s = "Hello I am String part of Singleton class";
	}
	//static method to create instance of singleton class
	public static synchronized Singleton getInstance() {
		if(single_instance == null) {
			single_instance = new Singleton();
			
		}
		return single_instance;
	}
	
	
}
public class ExampleOfSingleton {

	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		System.out.println("HashCode of x is: "+ x.hashCode());
		System.out.println("HashCode of y is: "+ y.hashCode());
		System.out.println("HashCode of z is: "+ z.hashCode());
		
		if(x==y && y==z) {
			System.out.println("They are pointing to the same memory");
		}else {
			System.out.println("They are not pointing to same memory");
		}

	}

}
