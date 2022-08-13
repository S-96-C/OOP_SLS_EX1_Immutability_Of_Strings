public class StringBasic {

	public static void main(String[] args) {
		
		String str = "Hello";
		System.out.println("Using the string literal : " + str);
		str = new String("Hello");
		System.out.println("Object : " + str);
		
		char c[] = {'H','e','l','l','o' };
		str = new String(c);
		System.out.println("Object : " + str);
		
		String s = "Hello";
		str = new String("Using another str obj : " + s);
		System.out.println("Object : " + str);
		
		String res = str.concat(" world");
		System.out.println("result : " + res);
		
		String rep_res = str.replace('H', 'h');
		System.out.println("result replace : " + rep_res);
	
	}

}
