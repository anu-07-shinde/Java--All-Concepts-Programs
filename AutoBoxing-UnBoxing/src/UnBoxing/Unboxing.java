package UnBoxing;

public class Unboxing {
	
	public static void main(String[] args) {
		
		Integer a = new Integer(3);
		int i = Integer.valueOf(a);
		
		int j=a;
		
		System.out.println("a:"+a+"\ni:"+i+"\nj:"+j);
	}

}
