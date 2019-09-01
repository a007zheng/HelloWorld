//Test

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello Java!");
		
		int x= 10;
		System.out.println(x);
		change(10);
		System.out.println(x);
	}
	static void change(int x) {
		
		System.out.println(x);
		x = 50;
		System.out.println(x);
	}

}
